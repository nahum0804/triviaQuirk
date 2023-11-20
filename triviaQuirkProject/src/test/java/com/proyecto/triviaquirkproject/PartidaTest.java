/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import poo.proyecto2.triviaquirk.iJugador;
import poo.proyecto2.triviaquirk.iSuscriptorPreguntas;

/**
 *
 * @author Nahum
 */
public class PartidaTest {
@Test
    public void testCreacionPartida() {
        Partida partida = new Partida(1);

        assertNotNull(partida);
        assertEquals(1, partida.getNumeroPartida());
        assertEquals(0, partida.getNumeroPreguntasRealizadas().size());
        assertTrue(partida.getListadoSuscriptores().isEmpty());
        assertTrue(partida.getListadoJugadores().isEmpty());
    }

    @Test
    public void testAgregarSuscriptor() {
        Partida partida = new Partida(2);
        iSuscriptorPreguntas suscriptor = new SuscriptorPreguntasStub();

        partida.addSuscriptor(suscriptor);

        assertEquals(1, partida.getListadoSuscriptores().size());
        assertTrue(partida.getListadoSuscriptores().contains(suscriptor));
    }

    @Test
    public void testAgregarJugador() {
        Partida partida = new Partida(3);
        iJugador jugador = new JugadorT();

        partida.addJugador(jugador);

        assertEquals(1, partida.getListadoJugadores().size());
        assertTrue(partida.getListadoJugadores().contains(jugador));
    }
}

class SuscriptorPreguntasStub implements iSuscriptorPreguntas {
    @Override
    public void publicarPuntaje(ArrayList<iJugador> al) {
    }
}

class JugadorT implements iJugador {
    @Override
    public String obtenerNombreJugador() {
        return "Jugador1";
    }
    @Override
    public short obtenerPuntaje() {
        return 100;
    }
    @Override
    public short aumentarPuntaje(short letter) {
        return letter;
    }
}
    

