/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import poo.proyecto2.triviaquirk.excepciones.excepcionPartidaNoDisponible;
import poo.proyecto2.triviaquirk.excepciones.excepcionPreguntasNoDisponibles;
import poo.proyecto2.triviaquirk.iJugador;
import poo.proyecto2.triviaquirk.iPregunta;
import poo.proyecto2.triviaquirk.iSuscriptorPreguntas;

/**
 *
 * @author Nahum
 */
public class CategoriaTest {
    @Test
    public void testRegistrarPartida() {
        Categoria hc = new Categoria();
        Categoria instancia = hc.getInstance();
        int partidaInicial = instancia.registrarPartida();
        int partidaNueva = instancia.registrarPartida();

        assertEquals(partidaInicial + 1, partidaNueva);
    }
    
    @Test
    public void testFinalizarPartida() {
        Categoria hc = new Categoria();
        Categoria instancia = hc.getInstance();
        int partidaNueva = instancia.registrarPartida();
        assertDoesNotThrow(() -> instancia.finalizarPartida(partidaNueva));
    }
    
    @Test
    public void testObtenerPreguntaAleatoria() {
        Categoria hc = new Categoria();
        Categoria instancia = hc.getInstance();
        int partida = instancia.registrarPartida();

        //Afecta al generar el javadoc
        
        //assertThrows(excepcionPreguntasNoDisponibles.class, () -> {
        //    for (int i = 0; i <= instancia.cantidadDePreguntasExistentes(); i++) {
        //        instancia.obtenerPreguntaAleatoria(partida);
        //    }
        //});
    }
}
