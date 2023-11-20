/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.border.Border;
import poo.proyecto2.triviaquirk.excepciones.excepcionPartidaNoDisponible;
import poo.proyecto2.triviaquirk.excepciones.excepcionPreguntasNoDisponibles;
import poo.proyecto2.triviaquirk.iJugador;
import poo.proyecto2.triviaquirk.iPregunta;
import poo.proyecto2.triviaquirk.iSuscriptorPreguntas;

/**
 * Clase que representa la ventana de inicio del juego en TriviaQuirk.
 * Extiende javax.swing.JFrame.
 * 
 * @author Arnold
 */
public class StartGame extends javax.swing.JFrame {
    
    Categoria cat;
    Partida partida;
    private String NombreJugador;
    private ArrayList<String> categoriasEscogidas;
    private ArrayList<Jugador> jugadores;
    private Timer timer;
    private int tiempoRestante;
    private int indicePregunta = 0;
    private int indiceJugador = 0;
    private String respuestaEscogida;
    private byte respuestaCorrecta;
        
    /**
     * Constructor de la clase StartGame.
     * Inicializa los componentes y establece el temporizador.
     */
    public StartGame() {
        initComponents();     
        tiempoRestante = 20; // establece el tiempo inicial en segundos
        jLabelTime.setText(Integer.toString(tiempoRestante));

        // Mostrar el nombre del primer jugador en la etiqueta
        jLabelUserName.setText("player");
        
        /**
         * Funcion para llevar el temporizador
         */
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Actualiza la etiqueta y verifica si el tiempo ha llegado a cero
                tiempoRestante--;
                jLabelTime.setText(Integer.toString(tiempoRestante));

                if (tiempoRestante == 0) {
                    // El tiempo ha llegado a cero, realiza la acción deseada (en este caso, cierra la ventana)
                    timer.stop();
                    dispose();
                    // Salta a la siguiente pregunta
                }
            }
        });
        timer.start();
    }
  
    
    /**
     * Inicializa y establece la apariencia de los componentes de la ventana.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGuardarPregunta = new javax.swing.JLabel();
        btnOpcionA = new javax.swing.JButton();
        btnOpcionB = new javax.swing.JButton();
        btnOpcionC = new javax.swing.JButton();
        jLabelTime = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGuardarPregunta.setBackground(new java.awt.Color(255, 0, 51));
        lblGuardarPregunta.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblGuardarPregunta.setText("Espacio Para la pregunta");

        btnOpcionA.setText("OpcionA");
        btnOpcionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionAActionPerformed(evt);
            }
        });

        btnOpcionB.setText("OpcionB");
        btnOpcionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionBActionPerformed(evt);
            }
        });

        btnOpcionC.setText("OpcionC");
        btnOpcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionCActionPerformed(evt);
            }
        });

        jLabelTime.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabelTime.setText("20");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Terminar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonSiguiente.setBackground(new java.awt.Color(0, 153, 255));
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Turno:");

        jLabelUserName.setText("username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOpcionC)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnOpcionA)
                        .addComponent(btnOpcionB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton1)
                        .addGap(67, 67, 67)
                        .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lblGuardarPregunta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelUserName)))
                .addContainerGap(570, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGuardarPregunta)
                .addGap(18, 18, 18)
                .addComponent(btnOpcionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnOpcionB)
                        .addGap(18, 18, 18)))
                .addComponent(btnOpcionC)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jLabelTime.getAccessibleContext().setAccessibleName("time");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento de hacer clic en el botón "Terminar".
     * Detiene el temporizador y cierra la ventana.
     * 
     * @param evt Evento de acción.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        timer.stop();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Maneja el evento de hacer clic en el botón de opción A.
     * Resalta el botón y almacena la respuesta escogida.
     * 
     * @param evt Evento de acción.
     */
    private void btnOpcionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionAActionPerformed
        resaltarBoton(btnOpcionA);
        respuestaEscogida = "";
        respuestaEscogida = btnOpcionA.getText();
    }//GEN-LAST:event_btnOpcionAActionPerformed

    /**
     * Maneja el evento de hacer clic en el botón de opción B.
     * Resalta el botón y almacena la respuesta escogida.
     * 
     * @param evt Evento de acción.
     */
    private void btnOpcionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionBActionPerformed
        resaltarBoton(btnOpcionB);
        respuestaEscogida = "";
        respuestaEscogida = btnOpcionB.getText();
    }//GEN-LAST:event_btnOpcionBActionPerformed

    /**
     * Maneja el evento de hacer clic en el botón de opción C.
     * Resalta el botón y almacena la respuesta escogida.
     * 
     * @param evt Evento de acción.
     */
    private void btnOpcionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionCActionPerformed
        resaltarBoton(btnOpcionC);
        respuestaEscogida = " ";
        respuestaEscogida = btnOpcionC.getText();
    }//GEN-LAST:event_btnOpcionCActionPerformed

    /**
     * Maneja el evento de hacer clic en el botón "Siguiente".
     * Llama al método `siguientePregunta()`.
     * 
     * @param evt Evento de acción.
     */
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        siguientePregunta();
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void siguientePregunta(){
        this.dispose();
    }
    
    public String getRespuestaEscogida(){
        return respuestaEscogida;
    }
    
    
    /**
     * Set label de pregunta
     * @param pregunta 
     */
    public void setPregunta(String pregunta) {
        lblGuardarPregunta.setText(pregunta);
    }

    /**
     * Set or add opcion A de la pregunta
     * @param opcionA 
     */
    public void setOpcionA(String opcionA) {
        btnOpcionA.setText(opcionA);
    }

    /**
     * Set or add opcion B de la pregunta
     * @param opcionB
     */
    public void setOpcionB(String opcionB) {
        btnOpcionB.setText(opcionB);
    }

    /**
     * Set or add opcion C de la pregunta
     * @param opcionC
     */
    public void setOpcionC(String opcionC) {
        btnOpcionC.setText(opcionC);
    }
    
    /**
     * Establece el texto del componente de etiqueta (label) para mostrar el nombre de usuario.
     * 
     * @param username El nombre de usuario que se establecerá en la etiqueta.
     */
    public void setLblUserName(String username) {
        jLabelUserName.setText(username);
    }

    /**
     * Establece el nombre del jugador.
     * 
     * @param nombre El nombre que se asignará al jugador.
     */
    public void setNombreJugador(String nombre) {
        this.NombreJugador = nombre;
    }

    /**
     * Obtiene el nombre del jugador.
     * 
     * @return El nombre del jugador.
     */
    public String getNombreJugador() {
        return this.NombreJugador;
    }
    
    /**
     * Establece el tiempo restante en la etiqueta correspondiente.
     * 
     * @param tiempoRestante El tiempo restante en segundos.
     */
    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
        jLabelTime.setText(Integer.toString(tiempoRestante));
    }
    
    /**
     * Detiene el temporizador.
     */
    public void detenerTemporizador() {
        timer.stop();
    }

    /**
     * Reinicia el temporizador.
     */
    public void reiniciarTemporizador() {
        tiempoRestante = 20; // Establece el tiempo inicial en segundos
        jLabelTime.setText(Integer.toString(tiempoRestante));
        timer.start();
    }
    
    
    /**
     * Resalta el botón seleccionado durante un tiempo y luego lo restaura.
     * Deshabilita los botones durante la animación.
     * 
     * @param boton El botón a resaltar.
     */
    private void resaltarBoton(JButton boton) {
        Border bordeOriginal = boton.getBorder();

        boton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        // Deshabilitar los botones durante la animación
        btnOpcionA.setEnabled(false);
        btnOpcionB.setEnabled(false);
        btnOpcionC.setEnabled(false);
        jButtonSiguiente.setEnabled(false);

        timer.stop();
        
        // Crear un Timer para manejar la pausa y la animación
        Timer animacionTimer  = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Restaurar el borde original del botón
                boton.setBorder(bordeOriginal);

                // Habilitar nuevamente los botones
                btnOpcionA.setEnabled(true);
                btnOpcionB.setEnabled(true);
                btnOpcionC.setEnabled(true);
                jButtonSiguiente.setEnabled(true);

                
                // Continuar con la siguiente pregunta
                siguientePregunta();

                timer.start();
                
                // Detener el Timer después de una ejecución
                ((Timer) e.getSource()).stop();
            }
        });

        // Iniciar el Timer de animación
        animacionTimer.start();
    }

    
    /**
     * Método principal que inicia la aplicación.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpcionA;
    private javax.swing.JButton btnOpcionB;
    private javax.swing.JButton btnOpcionC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel lblGuardarPregunta;
    // End of variables declaration//GEN-END:variables
}
