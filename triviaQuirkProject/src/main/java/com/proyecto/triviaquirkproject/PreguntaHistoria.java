/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import poo.proyecto2.triviaquirk.excepciones.excepcionRangoMayor;
import poo.proyecto2.triviaquirk.iPregunta;

/**
 *
 * @author Usuario
 */
public class PreguntaHistoria implements iPregunta{
    private final int numeroPregunta;
    private final String descripcion;
    private final String respuesta1;
    private final String respuesta2;
    private final String respuesta3;
    private final byte respuestaCorrecta;

    public PreguntaHistoria(int numeroPregunta, String descripcion, String respuesta1, String respuesta2, String respuesta3, byte respuestaCorrecta) {
        this.numeroPregunta = numeroPregunta;
        this.descripcion = descripcion;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuestaCorrecta = respuestaCorrecta;
    }

     @Override
    public String obtenerDescripcion() {
        return this.descripcion;
    }

    @Override
    public String obtenerRespuesta1() {
        return this.respuesta1;
    }

    @Override
    public String obtenerRespuesta2() {
        return this.respuesta2;
    }

    @Override
    public String obtenerRespuesta3() {
        return this.respuesta3;
    }

    @Override
    public byte esCorrecta(byte opcionElegida) throws excepcionRangoMayor, FileNotFoundException {
        CategoriaHistoria hc = CategoriaHistoria.getInstance();
        byte valor = 0;
        boolean encontrado = false;
        FileInputStream fileIn = new FileInputStream("PreguntasHistoriaEstadistica.dat");

        try {
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<RegistroEstadistico> listaRecuperada = (ArrayList)in.readObject();
            in.close();
            fileIn.close();
            Iterator var14 = listaRecuperada.iterator();

            while(var14.hasNext()) {
                RegistroEstadistico registro = (RegistroEstadistico)var14.next();
                if (registro.numPregunta == this.numeroPregunta) {
                    if (this.respuestaCorrecta == opcionElegida) {
                        ++registro.aciertos;
                        if (registro.desaciertos + registro.aciertos < 10) {
                            valor = 1;
                        } else if (registro.desaciertos * 100 / (registro.desaciertos + registro.aciertos) < 33) {
                            valor = 1;
                        } else if (registro.desaciertos * 100 / (registro.desaciertos + registro.aciertos) < 66) {
                            valor = 2;
                        } else {
                            valor = 3;
                        }
                    } else {
                        ++registro.desaciertos;
                    }

                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                if (this.respuestaCorrecta == opcionElegida) {
                    listaRecuperada.add(new RegistroEstadistico(this.numeroPregunta, 1, 0));
                } else {
                    listaRecuperada.add(new RegistroEstadistico(this.numeroPregunta, 0, 1));
                }
            }

            FileOutputStream fileOut = new FileOutputStream("HCEstadistica.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listaRecuperada);
            out.close();
            fileOut.close();
        } catch (IOException var11) {
            System.out.println("EError: " + var11.getMessage());
            FileOutputStream fileOut = new FileOutputStream("HCEstadistica.dat");

            try {
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                ArrayList<RegistroEstadistico> nuevaLista = new ArrayList();
                if (this.respuestaCorrecta == opcionElegida) {
                    nuevaLista.add(new RegistroEstadistico(this.numeroPregunta, 1, 0));
                } else {
                    nuevaLista.add(new RegistroEstadistico(this.numeroPregunta, 0, 1));
                }

                out.writeObject(nuevaLista);
            } catch (IOException var10) {
                System.out.println("No se puede escrinir en el archivo");
            }

            System.out.println("No se puede abrir el archivo de estady se crea uno nuevo");
        } catch (ClassNotFoundException var12) {
            System.out.println("La clase RegistroEstadistico no esta disponible");
        }

        return valor;
    }

     @Override
    public void falloPorTiempoRespuesta(byte opcionElegida) throws excepcionRangoMayor, FileNotFoundException {
        this.esCorrecta(opcionElegida);
        System.out.println("La respuesta no fue indicada y se auto-evalupor vencimiento del tiempo de respuesta");
    }
}
