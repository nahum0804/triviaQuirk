/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.triviaquirkproject;


import com.mycompany.adelanto.GodOfWarTriviaQuestions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import poo.proyecto2.triviaquirk.excepciones.excepcionPartidaNoDisponible;
import poo.proyecto2.triviaquirk.excepciones.excepcionPreguntasNoDisponibles;
import poo.proyecto2.triviaquirk.iJugador;
import poo.proyecto2.triviaquirk.iPregunta;
import poo.proyecto2.triviaquirk.iSuscriptorPreguntas;

/**
 *
 * @author Usuario
 */
public class CategoriaSorpresa {
    private final String nombre = "Sorpresa";
    private final ArrayList<Partida> partidasActivas = new ArrayList();
    private static CategoriaTecnologiaYCiencia instancia;

    public CategoriaSorpresa() {
    }

    public static CategoriaTecnologiaYCiencia getInstance() {
        return instancia == null ? new CategoriaTecnologiaYCiencia() : instancia;
    }

    public String nombreCategoria() {
        Objects.requireNonNull(this);
        return "Sorpresa";
    }

    public int registrarPartida() {
        int nuevaPartida = 0;

        for(int i = 0; i < this.partidasActivas.size(); ++i) {
            int elemento = ((Partida)this.partidasActivas.get(i)).numeroPartida;
            if (elemento > nuevaPartida) {
                nuevaPartida = elemento;
            }
        }

        ++nuevaPartida;
        this.partidasActivas.add(new Partida(nuevaPartida));
        return nuevaPartida;
    }

    public void finalizarPartida(int numeroPartida) throws excepcionPartidaNoDisponible {
        boolean encontrada = false;

        for(int i = 0; i < this.partidasActivas.size(); ++i) {
            if (((Partida)this.partidasActivas.get(i)).getNumeroPartida() == numeroPartida) {
                this.partidasActivas.remove(i);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            throw new excepcionPartidaNoDisponible(String.format("La partida #%d no se encuentra disponible", numeroPartida));
        }
    }

   
    public iPregunta obtenerPreguntaAleatoria(int numeroPartida) throws excepcionPreguntasNoDisponibles {
        GodOfWarTriviaQuestions[] elementos = GodOfWarTriviaQuestions.values();
        int numeroDeElementos = elementos.length;
        Partida partida = null;

        for(int i = 0; i < this.partidasActivas.size(); ++i) {
            if (((Partida)this.partidasActivas.get(i)).getNumeroPartida() == numeroPartida) {
                partida = (Partida)this.partidasActivas.get(i);
                break;
            }
        }

        if (numeroDeElementos <= partida.numeroPreguntasRealizadas.size()) {
            throw new excepcionPreguntasNoDisponibles();
        } else {
            long semilla = System.currentTimeMillis();
            Random random = new Random(semilla);

            int numeroAleatorio;
            for(numeroAleatorio = random.nextInt(numeroDeElementos); partida.numeroPreguntasRealizadas.contains(numeroAleatorio); numeroAleatorio = random.nextInt(numeroDeElementos)) {
            }
            //Se utiliza TriviaPreguntaCine para cargar las preguntas de Cine
            partida.numeroPreguntasRealizadas.add(numeroAleatorio);
            GodOfWarTriviaQuestions[] preguntas = GodOfWarTriviaQuestions.values();
            GodOfWarTriviaQuestions preguntaAleatoria = preguntas[numeroAleatorio];
            String pregunta = preguntaAleatoria.getPregunta();
            String respuestaA = preguntaAleatoria.getOpcion1();
            String respuestaB = preguntaAleatoria.getOpcion2();
            String respuestaC = preguntaAleatoria.getOpcion3();
            byte respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
            Pregunta preguntaSolicitada = new Pregunta(numeroAleatorio, pregunta, respuestaA, respuestaB, respuestaC, respuestaCorrecta);
            return preguntaSolicitada;
        }
    }

    public void publicarEnSuscriptores(int numeroPartida) throws excepcionPartidaNoDisponible {
        Partida partida = null;

        for(int i = 0; i < this.partidasActivas.size(); ++i) {
            if (((Partida)this.partidasActivas.get(i)).getNumeroPartida() == numeroPartida) {
                partida = (Partida)this.partidasActivas.get(i);
                break;
            }
        }

        if (partida == null) {
            throw new excepcionPartidaNoDisponible("Esta partida ya no existe activa");
        } else {
            Iterator var5 = partida.getListadoSuscriptores().iterator();

            while(var5.hasNext()) {
                iSuscriptorPreguntas suscriptor = (iSuscriptorPreguntas)var5.next();
                suscriptor.publicarPuntaje(partida.listadoJugadores);
            }

        }
    }

    public void agregarSuscriptor(int numeroPartida, iSuscriptorPreguntas sp) throws excepcionPartidaNoDisponible {
        Partida partida = null;

        for(int i = 0; i < this.partidasActivas.size(); ++i) {
            if (((Partida)this.partidasActivas.get(i)).getNumeroPartida() == numeroPartida) {
                partida = (Partida)this.partidasActivas.get(i);
                break;
            }
        }

        if (partida == null) {
            throw new excepcionPartidaNoDisponible("Esta partida ya no existe activa");
        } else {
            partida.addSuscriptor(sp);
        }
    }

    public void agregarJugador(int numeroPartida, iJugador jugador) throws excepcionPartidaNoDisponible {
        Partida partida = null;

        for(int i = 0; i < this.partidasActivas.size(); ++i) {
            if (((Partida)this.partidasActivas.get(i)).getNumeroPartida() == numeroPartida) {
                partida = (Partida)this.partidasActivas.get(i);
                break;
            }
        }

        if (partida == null) {
            throw new excepcionPartidaNoDisponible("Esta partida ya no existe activa");
        } else {
            partida.addJugador(jugador);
        }
    }

    public short cantidadDePreguntasExistentes() {
        GodOfWarTriviaQuestions[] elementos = GodOfWarTriviaQuestions.values();
        int numeroDeElementos = elementos.length;
        return (short)numeroDeElementos;
    }
}
