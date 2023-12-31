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
 * Clase que representa una categoría en el juego de trivia Quirk.
 * Cada categoría tiene un nombre, partidas activas, y métodos para gestionar preguntas y jugadores.
 * Implementa la interfaz iCategorias.
 *
 * @author Nahum
 */
public class Categoria implements iCategorias {

    private String nombreCategoria;
    private final ArrayList<Partida> partidasActivas = new ArrayList();
    private static Categoria instancia;
    private int numeroDeElementos;
    private ArrayList<String> categoriasEscogidas = new ArrayList<>();
    private ArrayList<iPregunta> preguntasUsadas;
    
    /**
     * Obtiene la instancia única de la categoría utilizando el patrón Singleton.
     *
     * @return La instancia de la categoría.
     */
    public Categoria getInstance(){
        return instancia == null ? new Categoria() : instancia;
    }
    
    /**
     * Obtiene el nombre de la categoría.
     *
     * @return El nombre de la categoría.
     */
    @Override
    public String nombreCategoria() {
        return nombreCategoria;
    }

    /**
     * Registra una nueva partida y devuelve su número.
     *
     * @return El número de la nueva partida registrada.
     */
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

    /**
     * Finaliza una partida activa dado su número.
     *
     * @param numeroPartida El número de la partida a finalizar.
     * @throws excepcionPartidaNoDisponible Si la partida no está disponible.
     */
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

    /**
     * Obtiene una pregunta aleatoria para una partida específica.
     *
     * @param numeroPartida El número de la partida.
     * @return La pregunta aleatoria.
     * @throws excepcionPreguntasNoDisponibles Si no hay preguntas disponibles.
     */
    @Override
    public iPregunta obtenerPreguntaAleatoria(int numeroPartida) throws excepcionPreguntasNoDisponibles {
        
        String pregunta = "empty";
        String respuestaA = "empty";
        String respuestaB = "empty";
        String respuestaC = "empty";
        byte respuestaCorrecta = 0;                                                                 
        
        //Verificar la categoria escogida
        switch (this.nombreCategoria) {
            case "Sorpresa":
                {
                    GodOfWarTriviaQuestions[] elementos = GodOfWarTriviaQuestions.values();
                    numeroDeElementos = elementos.length;
                    break;
                }
            case "Ciencia Y Tecnologia":
                {
                    TriviaPreguntaTecnologiaYCiencia[] elementos = TriviaPreguntaTecnologiaYCiencia.values();
                    numeroDeElementos = elementos.length;
                    break;
                }
            case "Cine":
                {
                    TriviaPreguntaCine[] elementos = TriviaPreguntaCine.values();
                    numeroDeElementos = elementos.length;
                    break;
                }
            case "Historia":
                {
                    TriviaPreguntaHistoria[] elementos = TriviaPreguntaHistoria.values();
                    numeroDeElementos = elementos.length;
                    break;
                }
            default:
                break;
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
            
            switch (this.nombreCategoria) {
                case "Sorpresa":
                    {
                        GodOfWarTriviaQuestions[] preguntas = GodOfWarTriviaQuestions.values();
                        GodOfWarTriviaQuestions preguntaAleatoria = preguntas[numeroAleatorio];
                        pregunta = preguntaAleatoria.getPregunta();
                        respuestaA = preguntaAleatoria.getOpcion1();
                        respuestaB = preguntaAleatoria.getOpcion2();
                        respuestaC = preguntaAleatoria.getOpcion3();
                        respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
                        break;
                    }
                case "Ciencia Y Tecnologia":
                    {
                        TriviaPreguntaTecnologiaYCiencia[] preguntas = TriviaPreguntaTecnologiaYCiencia.values();
                        TriviaPreguntaTecnologiaYCiencia preguntaAleatoria = preguntas[numeroAleatorio];
                        pregunta = preguntaAleatoria.getPregunta();
                        respuestaA = preguntaAleatoria.getRespuestaA();
                        respuestaB = preguntaAleatoria.getRespuestaB();
                        respuestaC = preguntaAleatoria.getRespuestaC();
                        respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
                        break;
                    }
                case "Cine":
                    {
                        TriviaPreguntaCine[] preguntas = TriviaPreguntaCine.values();
                        TriviaPreguntaCine preguntaAleatoria = preguntas[numeroAleatorio];
                        pregunta = preguntaAleatoria.getPregunta();
                        respuestaA = preguntaAleatoria.getRespuestaA();
                        respuestaB = preguntaAleatoria.getRespuestaB();
                        respuestaC = preguntaAleatoria.getRespuestaC();
                        respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
                        break;
                    }
                case "Historia":
                    {
                        TriviaPreguntaHistoria[] preguntas = TriviaPreguntaHistoria.values();
                        TriviaPreguntaHistoria preguntaAleatoria = preguntas[numeroAleatorio];
                        pregunta = preguntaAleatoria.getPregunta();
                        respuestaA = preguntaAleatoria.getRespuestaA();
                        respuestaB = preguntaAleatoria.getRespuestaB();
                        respuestaC = preguntaAleatoria.getRespuestaC();
                        respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
                        break;
                    }
                default:
                    break;
            }
            
            Pregunta preguntaSolicitada = new Pregunta(numeroAleatorio, pregunta, respuestaA, respuestaB, respuestaC, respuestaCorrecta);
            return preguntaSolicitada;
        }
    }

    /**
     * Publica el puntaje de una partida en los suscriptores registrados.
     *
     * @param numeroPartida El número de la partida.
     * @throws excepcionPartidaNoDisponible Si la partida no está disponible.
     */
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

    /**
     * Agrega un suscriptor a una partida específica.
     *
     * @param numeroPartida El número de la partida.
     * @param sp             El suscriptor a agregar.
     * @throws excepcionPartidaNoDisponible Si la partida no está disponible.
     */
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

    /**
     * Obtiene la cantidad total de preguntas disponibles en la categoría.
     *
     * @return La cantidad total de preguntas.
     */
    @Override
    public short cantidadDePreguntasExistentes() {
        TriviaPreguntaCine[] elementos = TriviaPreguntaCine.values();
        int numeroDeElementos = elementos.length;
        return (short)numeroDeElementos;
    }

    /**
     * Agrega un jugador a una partida específica.
     *
     * @param numeroPartida El número de la partida.
     * @param jugador       El jugador a agregar.
     * @throws excepcionPartidaNoDisponible Si la partida no está disponible.
     */
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
    
    /**
     * Agrega una categoría a la lista de categorías escogidas.
     *
     * @param categoria La categoría a agregar.
     */
    public void agregarCategorias(String categoria){
        categoriasEscogidas.add(categoria);
    }
    
    /**
     * Obtiene la lista de categorías escogidas.
     *
     * @return La lista de categorías escogidas.
     */
    public ArrayList<String> obtenerCategorias(){
        return categoriasEscogidas;
    }
    
    /**
     * Asigna un nombre a la categoría.
     *
     * @param nombreCategoria El nombre de la categoría.
     */
    public void asignarCategoria(String nombreCategoria){
        this.nombreCategoria = nombreCategoria;
    }
    
    /**
     * Agrega una pregunta usada a la lista de preguntas usadas.
     *
     * @param preguntaJugada La pregunta usada a agregar.
     */
    public void addPreguntaUsada(iPregunta preguntaJugada){
            preguntasUsadas.add(preguntaJugada);
    }
}