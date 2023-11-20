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
public class JugadorTest {
@Test
    public void testObtenerNombreJugador() {
        // Arrange
        Jugador jugador = new Jugador("Nahum");

        // Act
        String nombre = jugador.obtenerNombreJugador();

        // Assert
        assertEquals("Nahum", nombre);
    }

    @Test
    public void testObtenerPuntajeInicial() {
        // Arrange
        Jugador jugador = new Jugador("Nahum");

        // Act
        short puntaje = jugador.obtenerPuntaje();

        // Assert
        assertEquals(0, puntaje);
    }

    @Test
    public void testAumentarPuntaje() {
        // Arrange
        Jugador jugador = new Jugador("Nahum");

        // Act
        short puntajeDespuesAumento = jugador.aumentarPuntaje((short) 10);

        // Assert
        assertEquals(10, puntajeDespuesAumento);
    }   
}
