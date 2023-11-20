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
public class RegistroEstadisticoTest {
    
    @Test
    void testCreacionRegistroEstadistico() {
        RegistroEstadistico registro = new RegistroEstadistico(8, 9, 11);
        assertEquals(8, registro.numPregunta);
        assertEquals(9, registro.aciertos);
        assertEquals(11, registro.desaciertos);
    }

    @Test
    void testToString() {
        RegistroEstadistico registro = new RegistroEstadistico(6, 3, 1);
        String expectedToString = "#p:6 a:3 d:1";
        assertEquals(expectedToString, registro.toString());
    }

    @Test
    void testToStringMultipleInstances() {
        RegistroEstadistico registro1 = new RegistroEstadistico(1, 0, 3);
        RegistroEstadistico registro2 = new RegistroEstadistico(2, 6, 5);

        String expectedToString1 = "#p:1 a:0 d:3";
        String expectedToString2 = "#p:2 a:6 d:5";

        assertEquals(expectedToString1, registro1.toString());
        assertEquals(expectedToString2, registro2.toString());
    }
}
