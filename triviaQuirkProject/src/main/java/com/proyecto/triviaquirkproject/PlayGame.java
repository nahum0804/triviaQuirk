/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import poo.proyecto2.triviaquirk.iJugador;

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

      public PlayGame(ArrayList<String> listaCategorias, Partida partida) {
        this.listaCategorias = listaCategorias;
        this.partida = partida;

        // Configuración de la ventana
        setTitle("Inicio de Juego");
        setSize(300, 200);
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
                // Aquí puedes agregar la lógica para iniciar el juego
                iniciarJuego();
            }
        });
        add(btnIniciar);

        // Mostrar la ventana
        setVisible(true);
    }

    private void iniciarJuego() {
        // Aquí puedes agregar la lógica para iniciar el juego
        // Por ejemplo, puedes abrir la ventana de la clase StartGame
        StartGame startGame = new StartGame();
        startGame.setVisible(true);

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
