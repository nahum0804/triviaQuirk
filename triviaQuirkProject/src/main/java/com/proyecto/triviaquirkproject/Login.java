/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.triviaquirkproject;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import poo.proyecto2.triviaquirk.iJugador;

/**
 * Clase que representa la ventana de inicio de sesión en el juego de trivia Quirk.
 * Permite al usuario ingresar su nombre de jugador y seleccionar categorías para jugar.
 *
 * La ventana utiliza checkboxes para seleccionar categorías y un JTextField para ingresar el nombre del jugador.
 *
 * @author Arnold
 */
public class Login extends javax.swing.JFrame {
    
    // Variables para gestionar la interfaz gráfica y la información del juego.   
    private ButtonGroup buttonGroup;
    private ArrayList<String> categoriasSeleccionadas; 
    String nombreJugador;
    Categoria categoriaInstancia = new Categoria().getInstance();
    private Partida partidaActual;
    private int numeroPartida;
   
    /**
     * Creates new form Login
     */
    public Login() {
        categoriasSeleccionadas = new ArrayList<>();
        initComponents();
        jCheckBox1.setVisible(false);
        jCheckBox2.setVisible(false);
        jCheckBox3.setVisible(false);
        jCheckBox4.setVisible(false);
        jButton1.setVisible(false);
    }

    /**
     * Inicializa los componentes de la interfaz gráfica.
     * Este método es generado automáticamente por el editor de formularios y no debe modificarse manualmente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDigiteNombre = new javax.swing.JLabel();
        tfInputNombre = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDigiteNombre.setText("Digite su nombre de jugador");

        tfInputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInputNombreActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Ingresar");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jLabelMessage.setText("Unicamente puedes usar letras y numeros");

        jCheckBox1.setText("Cine");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Historia");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Ciencia y Tecnología");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Sorpresa");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jButton1.setText("JUGAR!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfInputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDigiteNombre)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelMessage)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSiguiente)
                        .addGap(181, 181, 181))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jButton1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblDigiteNombre)
                .addGap(31, 31, 31)
                .addComponent(tfInputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMessage)
                .addGap(18, 18, 18)
                .addComponent(btnSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfInputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfInputNombreActionPerformed

    
    /**
     * Método invocado cuando se hace clic en el botón "Ingresar".
     * Captura el nombre del jugador y valida su formato.
     * Si el nombre es válido, muestra las opciones de categorías y el botón para empezar a jugar.
     *
     * @param evt Evento de acción.
     */
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        nombreJugador = tfInputNombre.getText();

        // Expresión regular para validar que solo hay letras, números y espacios
        String regex = "^[a-zA-Z0-9]+$";

        // Verificar si el nombre del jugador cumple con la expresión regular
        if (nombreJugador.matches(regex)) {
            // El nombre del jugador es válido (solo contiene letras, números y espacios)
            buttonGroup = new ButtonGroup();
            buttonGroup.add(chekbCine);
            buttonGroup.add(checkbHistoria);
            buttonGroup.add(checkbCiencia);
            buttonGroup.add(checkbSorpresa);
            
            jLabelMessage.setForeground(Color.BLACK);
            jLabelMessage.setEnabled(false);
            btnSiguiente.setVisible(false);
            jCheckBox1.setVisible(true);
            jCheckBox2.setVisible(true);
            jCheckBox3.setVisible(true);
            jCheckBox4.setVisible(true);
            jButton1.setVisible(true);
            
        } else {
            // El nombre del jugador no es válido
            System.out.println("Nombre del jugador no válido. Solo se permiten letras y números.");
            tfInputNombre.setText("");
            jLabelMessage.setForeground(Color.RED);
        }      
    }//GEN-LAST:event_btnSiguienteActionPerformed

    /**
     * Método invocado cuando se selecciona/deselecciona el checkbox "Cine".
     * Agrega o elimina la categoría "Cine" de la lista de categorías seleccionadas.
     *
     * @param evt Evento de acción.
     */
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            categoriasSeleccionadas.add("Cine");
        } else {
            categoriasSeleccionadas.remove("Cine");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * Método invocado cuando se selecciona/deselecciona el checkbox "Historia".
     * Agrega o elimina la categoría "Historia" de la lista de categorías seleccionadas.
     *
     * @param evt Evento de acción.
     */
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected()){
            categoriasSeleccionadas.add("Historia");
        } else {
            categoriasSeleccionadas.remove("Historia");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    /**
     * Método invocado cuando se selecciona/deselecciona el checkbox "Ciencia y Tecnología".
     * Agrega o elimina la categoría "Ciencia y Tecnología" de la lista de categorías seleccionadas.
     *
     * @param evt Evento de acción.
     */
    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(jCheckBox3.isSelected()){
            categoriasSeleccionadas.add("Ciencia Y Tecnologia");
        } else {
            categoriasSeleccionadas.remove("Ciencia Y Tecnologia");
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    /**
     * Método invocado cuando se selecciona/deselecciona el checkbox "Sorpresa".
     * Agrega o elimina la categoría "Sorpresa" de la lista de categorías seleccionadas.
     *
     * @param evt Evento de acción.
     */
    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if(jCheckBox4.isSelected()){
            categoriasSeleccionadas.add("Sorpresa");
        } else {
            categoriasSeleccionadas.remove("Sorpresa");
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    /**
     * Método invocado cuando se hace clic en el botón "JUGAR!!".
     * Verifica que se hayan seleccionado al menos una categoría y luego inicia el juego.
     *
     * @param evt Evento de acción.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(categoriasSeleccionadas.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe escoger al menos una categoría de preguntas para poder jugar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            //this.dispose();
            numeroPartida = categoriaInstancia.registrarPartida();
            partidaActual = new Partida(numeroPartida); // Instancia unica - Singleton
            Jugador jugadorActual = new Jugador(nombreJugador);
            partidaActual.addJugador(jugadorActual);
            
            for(String categorie : categoriasSeleccionadas){
                categoriaInstancia.agregarCategorias(categorie);
            }
            
            PlayGame jugar = new PlayGame(categoriaInstancia, partidaActual);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Método principal que inicia la aplicación.
     * Crea una instancia de la clase Login y la hace visible.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private javax.swing.JCheckBox checkbCiencia;
    private javax.swing.JCheckBox checkbHistoria;
    private javax.swing.JCheckBox checkbSorpresa;
    private javax.swing.JCheckBox chekbCine;
    private javax.swing.JLabel lblEscogerCategoria;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel lblDigiteNombre;
    private javax.swing.JTextField tfInputNombre;
    // End of variables declaration//GEN-END:variables
}
