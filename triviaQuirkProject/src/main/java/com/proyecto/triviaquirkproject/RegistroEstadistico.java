package com.proyecto.triviaquirkproject;

import java.io.Serializable;

class RegistroEstadistico implements Serializable {
    public int numPregunta;
    public int aciertos;
    public int desaciertos;

    public RegistroEstadistico(int numPregunta, int aciertos, int desaciertos) {
        this.aciertos = aciertos;
        this.numPregunta = numPregunta;
        this.desaciertos = desaciertos;
    }

    public String toString() {
        return String.format("#p:%d a:%d d:%d", this.numPregunta, this.aciertos, this.desaciertos);
    }
}