/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import java.util.ArrayList;
import poo.proyecto2.triviaquirk.iJugador;
import poo.proyecto2.triviaquirk.iSuscriptorPreguntas;

/**
 *
 * @author Nahum
 */
class Partida {
    public final int numeroPartida;
    public final ArrayList<Integer> numeroPreguntasRealizadas;
    public final ArrayList<iSuscriptorPreguntas> listadoSuscriptores;
    public final ArrayList<iJugador> listadoJugadores;

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

    public ArrayList<iSuscriptorPreguntas> getListadoSuscriptores() {
        return this.listadoSuscriptores;
    }

    public void addSuscriptor(iSuscriptorPreguntas suscriptor) {
        this.listadoSuscriptores.add(suscriptor);
    }

    public void addJugador(iJugador jugador) {
        this.listadoJugadores.add(jugador);
    }

    public ArrayList<iJugador> getListadoJugadores() {
        return this.listadoJugadores;
    }

    public int getNumeroPartida() {
        return this.numeroPartida;
    }

    public ArrayList<Integer> getNumeroPreguntasRealizadas() {
        return this.numeroPreguntasRealizadas;
    }

    @Override
    public String toString() {
        return String.format("Partida #:%d preguntas realizadas %s", this.numeroPartida, this.numeroPreguntasRealizadas.toString());
    }
}
