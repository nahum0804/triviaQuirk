/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        for(String i : listaDeCategorias){
            Categoria catTemp = new Categoria().getInstance();
            catTemp.asignarCategoria(i);
            categoriasJugar.add(catTemp);
        }
        
        // Jugar según la cantidad de categorías
        for (Categoria ctTemp : categoriasJugar) {
            // Registrar la partida y obtener el número de partida
            int numeroPartida = ctTemp.registrarPartida();

            // Obtener pregunta aleatoria para la partida actual
            iPregunta pregunta = ctTemp.obtenerPreguntaAleatoria(numeroPartida);
            
            for(iJugador j : partida.listadoJugadores){
                // Crear y mostrar la ventana StartGame
                StartGame startGame = new StartGame();
                startGame.setLblUserName(j.obtenerNombreJugador());
                startGame.setPregunta(pregunta.obtenerDescripcion());
                startGame.setOpcionA(pregunta.obtenerRespuesta1());
                startGame.setOpcionB(pregunta.obtenerRespuesta2());
                startGame.setOpcionC(pregunta.obtenerRespuesta3());
                startGame.setVisible(true);
            }
        }

        // Cierra la ventana actual
        dispose();
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