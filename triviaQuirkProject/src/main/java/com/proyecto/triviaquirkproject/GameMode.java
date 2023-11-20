/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.triviaquirkproject;

/**
 * Clase que representa la ventana de selección de modo de juego en el juego de trivia Quirk.
 * Esta clase extiende javax.swing.JFrame y proporciona opciones para seleccionar el modo de juego
 * (solitario o multijugador).
 *
 * La ventana contiene etiquetas y botones para interactuar con el usuario.
 *
 * @author Arnold
 */
public class GameMode extends javax.swing.JFrame {

    /**
     * Crea una nueva instancia de la clase GameMode.
     * Se llama al método initComponents() para inicializar los componentes de la interfaz gráfica.
     */
    public GameMode() {
        initComponents();
    }

    /**
     * Inicializa los componentes de la interfaz gráfica.
     * Este método es generado automáticamente por el editor de formularios y no debe modificarse manualmente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSeleccionModo = new javax.swing.JLabel();
        btnSolitario = new javax.swing.JButton();
        btnMultijugador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSeleccionModo.setText("Seleccione el modo de juego");

        btnSolitario.setText("Solitario");
        btnSolitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolitarioActionPerformed(evt);
            }
        });

        btnMultijugador.setText("Multijugador");
        btnMultijugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultijugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMultijugador)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnSolitario)))
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lblSeleccionModo)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblSeleccionModo)
                .addGap(36, 36, 36)
                .addComponent(btnSolitario)
                .addGap(63, 63, 63)
                .addComponent(btnMultijugador)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// </editor-fold>
    
    
    /**
     * Método invocado cuando se hace clic en el botón "Solitario".
     * Cierra la ventana actual y muestra la ventana de inicio de sesión para el modo solitario.
     *
     * @param evt Evento de acción.
     */
    private void btnSolitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolitarioActionPerformed
        this.dispose();
        
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnSolitarioActionPerformed

    /**
     * Método invocado cuando se hace clic en el botón "Multijugador".
     * Cierra la ventana actual y muestra la ventana de inicio de sesión para el modo multijugador.
     *
     * @param evt Evento de acción.
     */
    private void btnMultijugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultijugadorActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MultiLogin Multilogin = new MultiLogin();
        Multilogin.setVisible(true);
    }//GEN-LAST:event_btnMultijugadorActionPerformed

    /**
     * Método principal que inicia la aplicación.
     * Crea una instancia de la clase GameMode y la hace visible.
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
            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMultijugador;
    private javax.swing.JButton btnSolitario;
    private javax.swing.JLabel lblSeleccionModo;
    // End of variables declaration//GEN-END:variables
}
