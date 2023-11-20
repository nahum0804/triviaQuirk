/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import java.util.ArrayList;
import poo.proyecto2.triviaquirk.iJugador;
import poo.proyecto2.triviaquirk.iSuscriptorPreguntas;

/**
 * Clase que representa una partida en el juego TriviaQuirk.
 * Contiene información sobre el número de partida, preguntas realizadas,
 * suscriptores de preguntas, y jugadores participantes.
 * 
 * @author Nahum
 */
class Partida {
    /**
     * Número único que identifica a la partida.
     */
    public final int numeroPartida;

    /**
     * Lista que almacena los números de las preguntas realizadas en la partida.
     */
    public final ArrayList<Integer> numeroPreguntasRealizadas;

    /**
     * Lista que contiene los suscriptores de preguntas asociados a la partida.
     */
    public final ArrayList<iSuscriptorPreguntas> listadoSuscriptores;

    /**
     * Lista que almacena los jugadores que participan en la partida.
     */
    public final ArrayList<iJugador> listadoJugadores;
    
    
    /**
     * Constructor de la clase Partida.
     * Inicializa las listas y asigna el número de partida.
     *
     * @param numeroPartida Número único que identifica a la partida.
     */
    public Partida(int numeroPartida) {
        this.numeroPartida = numeroPartida;
        this.numeroPreguntasRealizadas = new ArrayList();
        this.listadoSuscriptores = new ArrayList();
        this.listadoJugadores = new ArrayList();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            //GameSelection selector = new GameSelection();
            //selector.setVisible(true);
            }
        });
    }

    /**
     * Obtiene la lista de suscriptores de preguntas asociados a la partida.
     *
     * @return Lista de suscriptores de preguntas.
     */
    public ArrayList<iSuscriptorPreguntas> getListadoSuscriptores() {
        return this.listadoSuscriptores;
    }

    /**
     * Añade un suscriptor de preguntas a la partida.
     *
     * @param suscriptor Suscriptor de preguntas a añadir.
     */
    public void addSuscriptor(iSuscriptorPreguntas suscriptor) {
        this.listadoSuscriptores.add(suscriptor);
    }

    /**
     * Añade un jugador a la partida.
     *
     * @param jugador Jugador a añadir.
     */
    public void addJugador(iJugador jugador) {
        this.listadoJugadores.add(jugador);
    }

    /**
     * Obtiene la lista de jugadores participantes en la partida.
     *
     * @return Lista de jugadores.
     */
    public ArrayList<iJugador> getListadoJugadores() {
        return this.listadoJugadores;
    }

    /**
     * Obtiene el número único que identifica a la partida.
     *
     * @return Número de la partida.
     */
    public int getNumeroPartida() {
        return this.numeroPartida;
    }

    /**
     * Obtiene la lista de números de preguntas realizadas en la partida.
     *
     * @return Lista de números de preguntas realizadas.
     */
    public ArrayList<Integer> getNumeroPreguntasRealizadas() {
        return this.numeroPreguntasRealizadas;
    }

    /**
     * Representación en cadena de la partida.
     *
     * @return Cadena que representa la información de la partida.
     */
    @Override
    public String toString() {
        return String.format("Partida #:%d preguntas realizadas %s", this.numeroPartida, this.numeroPreguntasRealizadas.toString());
    }
}
