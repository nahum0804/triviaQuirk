/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nahum
 */
public class PreguntaTest {
    
    @Test
    void testObtenerDescripcion() {
        String descripcion = "¿Cuál es la capital de Francia?";
        Pregunta pregunta = new Pregunta(1, descripcion, "París", "Londres", "Madrid", (byte) 1);

        assertEquals(descripcion, pregunta.obtenerDescripcion());
    }

    @Test
    void testObtenerRespuestas() {
        Pregunta pregunta = new Pregunta(2, "¿Cuál es el color del cielo?", "Azul", "Rojo", "Verde", (byte) 1);

        assertEquals("Azul", pregunta.obtenerRespuesta1());
        assertEquals("Rojo", pregunta.obtenerRespuesta2());
        assertEquals("Verde", pregunta.obtenerRespuesta3());
    }
    
}
