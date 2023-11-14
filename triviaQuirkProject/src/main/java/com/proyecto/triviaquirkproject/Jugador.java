/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.triviaquirkproject;
import poo.proyecto2.triviaquirk.iJugador;

/**
 *
 * @author Nahum
 */
public class Jugador implements iJugador {
    private final String nombre;
    private short puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    @Override
    public String obtenerNombreJugador() {
        return this.nombre;
    }

    @Override
    public short obtenerPuntaje() {
        return this.puntaje;
    }

    @Override
    public short aumentarPuntaje(short puntos) {
        this.puntaje += puntos;
        return this.puntaje;
    }
}
