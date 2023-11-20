package com.proyecto.triviaquirkproject;

import java.io.Serializable;

/**
 * Clase que representa un registro estadístico para una pregunta en TriviaQuirk.
 * Implementa la interfaz Serializable para permitir la serialización.
 * 
 * @author Nahum
 */
class RegistroEstadistico implements Serializable {
    public int numPregunta;
    public int aciertos;
    public int desaciertos;

    /**
     * Constructor de la clase RegistroEstadistico.
     * 
     * @param numPregunta Número de la pregunta.
     * @param aciertos Cantidad de aciertos registrados.
     * @param desaciertos Cantidad de desaciertos registrados.
     */
    public RegistroEstadistico(int numPregunta, int aciertos, int desaciertos) {
        this.aciertos = aciertos;
        this.numPregunta = numPregunta;
        this.desaciertos = desaciertos;
    }

    /**
     * Retorna una representación en cadena del objeto.
     * 
     * @return Cadena que representa el objeto en el formato "#p:numPregunta a:aciertos d:desaciertos".
     */
    public String toString() {
        return String.format("#p:%d a:%d d:%d", this.numPregunta, this.aciertos, this.desaciertos);
    }
}