/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import poo.proyecto2.triviaquirk.excepciones.excepcionPreguntasNoDisponibles;
import poo.proyecto2.triviaquirk.iJugador;
import poo.proyecto2.triviaquirk.iPregunta;

/**
 * Clase que representa la ventana de inicio de juego en TriviaQuirk.
 * Permite a los jugadores ver la lista de jugadores, el número de partida,
 * e iniciar el juego con preguntas de categorías aleatorias.
 * 
 * @author Nahum
 */
public class PlayGame extends JFrame {
    
   private ArrayList<String> listaCategorias;
    private Partida partida;
    private JButton btnIniciar;
    private JLabel lblJugador;
    private JLabel lblNumeroPartida;
    private int numJugadores;
    private Categoria catPadre;
    private ArrayList<Categoria> categoriasJugar = new ArrayList<>();;

      public PlayGame(Categoria catPadre, Partida partida) {
        this.listaCategorias = listaCategorias;
        this.partida = partida;
        this.numJugadores = partida.listadoJugadores.size();
        this.catPadre = catPadre;
        
        System.out.println(partida.numeroPartida + " desde el constructor");
   
        
        // Configuración de la ventana
        setTitle("Inicio de Juego");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Usar un administrador de diseño más avanzado si es necesario

        // Inicialización de componentes
        JLabel lblJugador = new JLabel("Jugadores: ");
        lblJugador.setBounds(20, 20, 250, 20);
        add(lblJugador);

        JTextArea txtAreaJugadores = new JTextArea(obtenerNombresJugadores());
        txtAreaJugadores.setBounds(20, 40, 250, 60);
        txtAreaJugadores.setEditable(false);
        add(txtAreaJugadores);

        lblNumeroPartida = new JLabel("Número de partida: " + partida.numeroPartida);
        lblNumeroPartida.setBounds(20, 110, 250, 20);
        add(lblNumeroPartida);

        btnIniciar = new JButton("Iniciar Juego");
        btnIniciar.setBounds(20, 140, 150, 30);
        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    iniciarJuego();
                } catch (excepcionPreguntasNoDisponibles ex) {
                    Logger.getLogger(PlayGame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        add(btnIniciar);

        // Mostrar la ventana
        setVisible(true);
    }

    private void iniciarJuego() throws excepcionPreguntasNoDisponibles {
        
        ArrayList<String> listaDeCategorias = catPadre.obtenerCategorias();
        System.out.println(listaDeCategorias);
        // Almacena las instancias de StartGame en una cola
        ArrayList<StartGame> juegosPendientes = new ArrayList<>();
        for(String i : listaDeCategorias){
            Categoria catTemp = new Categoria().getInstance();
            catTemp.asignarCategoria(i);
            categoriasJugar.add(catTemp);
            
        }
        
        //num para comparar con el indice random que no se repita
        int num = 0;
        for(int i = 0; i < 30; i++){
            //obtener un indice random de la lista categoriasJugar
            int indiceRandom = (int) (Math.random() * categoriasJugar.size());
            
            if (indiceRandom == num){
                //darle un nuevo que no sea igual al anterior
                indiceRandom = (int) (Math.random() * categoriasJugar.size());
                if (indiceRandom == num){
                    indiceRandom = (int) (Math.random() * categoriasJugar.size());
                }
            }
            num = indiceRandom;
            System.out.println("numale: "+indiceRandom);
            //obtener la categoria de la lista categoriasJugar con el indice random
            Categoria ctTemp = categoriasJugar.get(indiceRandom);
            // Registrar la partida y obtener el número de partida
            int numeroPartida = ctTemp.registrarPartida();
            System.out.println("numparti: "+numeroPartida);
            
            // Obtener pregunta aleatoria para la partida actual
            iPregunta pregunta = ctTemp.obtenerPreguntaAleatoria(numeroPartida);

            for(iJugador j : partida.listadoJugadores){
                StartGame startGame = new StartGame();
                startGame.setLblUserName(j.obtenerNombreJugador());
                startGame.setPregunta(pregunta.obtenerDescripcion());
                startGame.setOpcionA(pregunta.obtenerRespuesta1());
                startGame.setOpcionB(pregunta.obtenerRespuesta2());
                startGame.setOpcionC(pregunta.obtenerRespuesta3());
                startGame.setNombreJugador(j.obtenerNombreJugador());
                juegosPendientes.add(startGame);
            }
        }
        
        
        // Cierra la ventana actual
        this.dispose();
        

        //Extraer la primera ventanda de juegosPendientes
        StartGame sg = juegosPendientes.get(0);
        sg.setVisible(true);
        
        sg.reiniciarTemporizador();
        // Eliminar la primera ventana de juegosPendientes
        juegosPendientes.remove(0);
        // Contador
        
        // Agregar el WindowListener a la nueva instancia de StartGame
       
        sg.addWindowListener(new WindowAdapter() {
            int contador = 0;
            String nombre = sg.getNombreJugador();
            @Override
            public void windowClosed(WindowEvent e) {
                
                if (contador==0){
                    System.out.println(sg.getRespuestaEscogida());
                    contador = contador + 1 ;
                    String respuesta = sg.getRespuestaEscogida();
                    System.out.println(respuesta);
                    System.out.println(sg.getRespuestaEscogida());
                    if (sg.getRespuestaEscogida()==respuesta){
                        System.out.println("Nombre: "+nombre);
                       for(iJugador j : partida.listadoJugadores){
                           System.out.println("Nombre2: "+j.obtenerNombreJugador());
                           if (j.obtenerNombreJugador()==nombre){
                               short num = 1;
                               j.aumentarPuntaje(num);
                               System.out.println("Este es el pnt de: "+j.obtenerPuntaje());
                           }
                       }
                    }
                    
                } 
                if (juegosPendientes.size() > 0) {
                    
                    System.out.println("Juegos pendientes: " + juegosPendientes.size());
                    StartGame sg = juegosPendientes.get(0);
                    sg.setVisible(true);
                    sg.addWindowListener(new WindowAdapter() {
                        String nombre = sg.getNombreJugador();
                        public void windowClosed(WindowEvent e) {
                            System.out.println(sg.getRespuestaEscogida());
                            contador = contador + 1 ;
                            String respuesta = sg.getRespuestaEscogida();
                            //System.out.println(respuesta);
                            
                            //System.out.println(sg.getRespuestaEscogida());
                            if (sg.getRespuestaEscogida()==respuesta){
                                //System.out.println("Nombre: "+nombre);
                               for(iJugador j : partida.listadoJugadores){
                                   System.out.println("Nombre2: "+j.obtenerNombreJugador());
                                   if (j.obtenerNombreJugador()==nombre){
                                       short num = 1;
                                       j.aumentarPuntaje(num);
                                       //System.out.println("Este es el pnt de: "+j.obtenerPuntaje());
                                   }
                               }
                            }
                        }
                    });
                    //añadir un listener para obtener la respuesta de sg.getRespuestaEscogida()
                    juegosPendientes.remove(0);
                    
                    sg.reiniciarTemporizador();
                    
                    //mostrar las siguientes unicamente cuando se cierre la anterior
                    sg.addWindowListener(this);
                }
 
            }
        });
        
        MostrarMarcador showMarcador = new MostrarMarcador();
        int cantJug = partida.listadoJugadores.size();
         if (cantJug >= 1) {
            iJugador jugTemp = partida.listadoJugadores.get(0);
            showMarcador.setJugador1Visible(true, String.valueOf(jugTemp.obtenerPuntaje()), jugTemp.obtenerNombreJugador());
        }

        if (cantJug >= 2) {
            iJugador jugTemp2 = partida.listadoJugadores.get(1);
            showMarcador.setJugador2Visible(true, String.valueOf(jugTemp2.obtenerPuntaje()), jugTemp2.obtenerNombreJugador());
        }

        if (cantJug >= 3) {
            iJugador jugTemp3 = partida.listadoJugadores.get(2);
            showMarcador.setJugador3Visible(true, String.valueOf(jugTemp3.obtenerPuntaje()), jugTemp3.obtenerNombreJugador());
        }

        if (cantJug >= 4) {
            iJugador jugTemp4 = partida.listadoJugadores.get(3);
            showMarcador.setJugador4Visible(true, String.valueOf(jugTemp4.obtenerPuntaje()), jugTemp4.obtenerNombreJugador());
        }
    }

    private String obtenerNombresJugadores() {
        StringBuilder nombres = new StringBuilder();
        for (iJugador jugador : partida.listadoJugadores) {
            nombres.append(jugador.obtenerNombreJugador()).append("\n");
        }
        return nombres.toString();
    }
    
    
    public static void main(String[] args) {
        // Puedes probar la clase PlayGame creando una instancia en el método main
        // y pasando las listas y partida necesarias.
    }
}