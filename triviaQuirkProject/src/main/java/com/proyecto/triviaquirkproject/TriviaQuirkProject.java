/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyecto.triviaquirkproject;

/**
 * Clase principal que inicia la aplicación de Trivia Quirk Project.
 * La aplicación utiliza la interfaz gráfica proporcionada por la clase MainJF.
 * Se lanza el hilo de eventos de la interfaz de usuario en el método main.
 * 
 * @author Nahum
 */
public class TriviaQuirkProject {

    /**
     * Método principal que inicia la aplicación.
     * Crea una instancia de MainJF (interfaz gráfica principal) y la hace visible.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            /**
             * Implementación del método run de la interfaz Runnable.
             * Crea una instancia de MainJF y la hace visible al usuario.
             */
            public void run() {
                MainJF mainJF = new MainJF();
                mainJF.setVisible(true);
            }
        });
    }
}
