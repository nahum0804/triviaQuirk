/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import com.mycompany.adelanto.GodOfWarTriviaQuestions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import poo.proyecto2.triviaquirk.excepciones.excepcionPartidaNoDisponible;
import poo.proyecto2.triviaquirk.excepciones.excepcionPreguntasNoDisponibles;
import poo.proyecto2.triviaquirk.iCategorias;
import poo.proyecto2.triviaquirk.iJugador;
import poo.proyecto2.triviaquirk.iPregunta;
import poo.proyecto2.triviaquirk.iSuscriptorPreguntas;

/**
 *
 * @author Usuario
 */
public class Categoria implements iCategorias {

    private String nombreCategoria;
    private final ArrayList<Partida> partidasActivas = new ArrayList();
    private static Categoria instancia;
    private int numeroDeElementos;
    
    public Categoria getInstance(){
        return instancia == null ? new Categoria() : instancia;
    }
    
    @Override
    public String nombreCategoria() {
        return nombreCategoria;
    }

    @Override
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

    @Override
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

    @Override
    public iPregunta obtenerPreguntaAleatoria(int numeroPartida) throws excepcionPreguntasNoDisponibles {
        
        String pregunta = "empty";
        String respuestaA = "empty";
        String respuestaB = "empty";
        String respuestaC = "empty";
        byte respuestaCorrecta = 0;                                                                 
        
        //Verificar la categoria escogida
        if(this.nombreCategoria.equals("Sorpresa")){
            GodOfWarTriviaQuestions[] elementos = GodOfWarTriviaQuestions.values();
            numeroDeElementos = elementos.length;
        } else if(this.nombreCategoria.equals("Ciencia Y Tecnologia")){
            TriviaPreguntaTecnologiaYCiencia[] elementos = TriviaPreguntaTecnologiaYCiencia.values();
            numeroDeElementos = elementos.length;
        } else if(this.nombreCategoria.equals("Cine")){
            TriviaPreguntaCine[] elementos = TriviaPreguntaCine.values();
            numeroDeElementos = elementos.length;
        } else if(this.nombreCategoria.equals("Historia")){
            TriviaPreguntaHistoria[] elementos = TriviaPreguntaHistoria.values();
            numeroDeElementos = elementos.length;
        } else {
            System.out.println("");
        }
        
        
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
            
            if(this.nombreCategoria.equals("Sorpresa")){
                GodOfWarTriviaQuestions[] preguntas = GodOfWarTriviaQuestions.values();
                GodOfWarTriviaQuestions preguntaAleatoria = preguntas[numeroAleatorio];
                pregunta = preguntaAleatoria.getPregunta();
                respuestaA = preguntaAleatoria.getOpcion1();
                respuestaB = preguntaAleatoria.getOpcion2();
                respuestaC = preguntaAleatoria.getOpcion3();
                respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
                
            } else if(this.nombreCategoria.equals("Ciencia Y Tecnologia")){
                TriviaPreguntaTecnologiaYCiencia[] preguntas = TriviaPreguntaTecnologiaYCiencia.values();
                TriviaPreguntaTecnologiaYCiencia preguntaAleatoria = preguntas[numeroAleatorio];
                pregunta = preguntaAleatoria.getPregunta();
                respuestaA = preguntaAleatoria.getRespuestaA();
                respuestaB = preguntaAleatoria.getRespuestaB();
                respuestaC = preguntaAleatoria.getRespuestaC();
                respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
                
            } else if(this.nombreCategoria.equals("Cine")){
                TriviaPreguntaCine[] preguntas = TriviaPreguntaCine.values();
                TriviaPreguntaCine preguntaAleatoria = preguntas[numeroAleatorio];
                pregunta = preguntaAleatoria.getPregunta();
                respuestaA = preguntaAleatoria.getRespuestaA();
                respuestaB = preguntaAleatoria.getRespuestaB();
                respuestaC = preguntaAleatoria.getRespuestaC();
                respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
                
            } else if(this.nombreCategoria.equals("Historia")){
                TriviaPreguntaHistoria[] preguntas = TriviaPreguntaHistoria.values();
                TriviaPreguntaHistoria preguntaAleatoria = preguntas[numeroAleatorio];
                pregunta = preguntaAleatoria.getPregunta();
                respuestaA = preguntaAleatoria.getRespuestaA();
                respuestaB = preguntaAleatoria.getRespuestaB();
                respuestaC = preguntaAleatoria.getRespuestaC();
                respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
                
            }
            
            PreguntaHistoria preguntaSolicitada = new PreguntaHistoria(numeroAleatorio, pregunta, respuestaA, respuestaB, respuestaC, respuestaCorrecta);
            return preguntaSolicitada;
        }
    }

    @Override
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

    @Override
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

    @Override
    public short cantidadDePreguntasExistentes() {
        TriviaPreguntaCine[] elementos = TriviaPreguntaCine.values();
        int numeroDeElementos = elementos.length;
        return (short)numeroDeElementos;
    }

    @Override
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
}
