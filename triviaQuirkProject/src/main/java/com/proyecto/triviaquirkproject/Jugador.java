/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.triviaquirkproject;
import poo.proyecto2.triviaquirk.iJugador;

/**
 * Clase que representa a un jugador en el juego de trivia Quirk.
 * Implementa la interfaz iJugador, proporcionando métodos para obtener y aumentar el puntaje del jugador.
 * El nombre del jugador es inmutable después de la creación.
 *
 * La clase utiliza un constructor para inicializar el nombre y el puntaje del jugador.
 *
 * @author Nahum
 */
public class Jugador implements iJugador {
    // Nombre del jugador
    private final String nombre;
    
    // Puntaje del jugador
    private short puntaje;

    /**
     * Constructor de la clase Jugador.
     *
     * @param nombre El nombre del jugador.
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    /**
     * Obtiene el nombre del jugador.
     *
     * @return El nombre del jugador.
     */
    @Override
    public String obtenerNombreJugador() {
        return this.nombre;
    }

    /**
     * Obtiene el puntaje actual del jugador.
     *
     * @return El puntaje actual del jugador.
     */
    @Override
    public short obtenerPuntaje() {
        return this.puntaje;
    }

    /**
     * Aumenta el puntaje del jugador en la cantidad especificada.
     *
     * @param puntos La cantidad de puntos a aumentar.
     * @return El nuevo puntaje del jugador después de aumentar los puntos.
     */
    @Override
    public short aumentarPuntaje(short puntos) {
        this.puntaje += puntos;
        return this.puntaje;
    }
}
