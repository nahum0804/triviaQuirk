/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.triviaquirkproject;

/**
 *
 * @author Usuario
 */
public class MostrarMarcador extends javax.swing.JFrame {

    /**
     * Creates new form MostrarMarcador
     */
    public MostrarMarcador() {
        initComponents();
        labelJugador1.setVisible(false);
        labelJuagdor2.setVisible(false);
        labelJugador3.setVisible(false);
        labelJugador4.setVisible(false);
        labelPuntajeJ1.setVisible(false);
        labelPuntajeJ2.setVisible(false);
        labelPuntajeJ3.setVisible(false);
        labelPuntajeJ4.setVisible(false);
    }
    
    /**
     * Establece la visibilidad del jugador 1 y su puntaje.
     * 
     * @param visible Indica si se debe hacer visible o no el elemento del jugador 1.
     * @param puntaje El puntaje del jugador 1 que se mostrará.
     * @param username El nombre de usuario del jugador 1.
     */
    public void setJugador1Visible(boolean visible, String puntaje, String username) {
        labelJugador1.setVisible(visible);
        labelPuntajeJ1.setVisible(visible);
        labelPuntajeJ1.setText(puntaje);
        labelJugador1.setText(username);
    }

    /**
     * Establece la visibilidad del jugador 2 y su puntaje.
     * 
     * @param visible Indica si se debe hacer visible o no el elemento del jugador 2.
     * @param puntaje El puntaje del jugador 2 que se mostrará.
     * @param username El nombre de usuario del jugador 2.
     */
    public void setJugador2Visible(boolean visible, String puntaje, String username) {
        labelJuagdor2.setVisible(visible);
        labelPuntajeJ2.setVisible(visible);
        labelPuntajeJ2.setText(puntaje);
        labelJuagdor2.setText(username);
    }

    /**
     * Establece la visibilidad del jugador 3 y su puntaje.
     * 
     * @param visible Indica si se debe hacer visible o no el elemento del jugador 3.
     * @param puntaje El puntaje del jugador 3 que se mostrará.
     * @param username El nombre de usuario del jugador 3.
     */
    public void setJugador3Visible(boolean visible, String puntaje, String username) {
        labelJugador3.setVisible(visible);
        labelPuntajeJ3.setVisible(visible);
        labelPuntajeJ3.setText(puntaje);
        labelJugador3.setText(username);
    }

    /**
     * Establece la visibilidad del jugador 4 y su puntaje.
     * 
     * @param visible Indica si se debe hacer visible o no el elemento del jugador 4.
     * @param puntaje El puntaje del jugador 4 que se mostrará.
     * @param username El nombre de usuario del jugador 4.
     */
    public void setJugador4Visible(boolean visible, String puntaje, String username) {
        labelJugador4.setVisible(visible);
        labelPuntajeJ4.setVisible(visible);
        labelPuntajeJ4.setText(puntaje);
        labelJugador4.setText(username);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloPuntaje = new javax.swing.JLabel();
        labelJugador1 = new javax.swing.JLabel();
        labelJuagdor2 = new javax.swing.JLabel();
        labelJugador3 = new javax.swing.JLabel();
        labelJugador4 = new javax.swing.JLabel();
        labelPuntajeJ1 = new javax.swing.JLabel();
        labelPuntajeJ2 = new javax.swing.JLabel();
        labelPuntajeJ3 = new javax.swing.JLabel();
        labelPuntajeJ4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTituloPuntaje.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelTituloPuntaje.setText("Puntajes de la partida:");

        labelJugador1.setText("jLabel1");

        labelJuagdor2.setText("jLabel2");

        labelJugador3.setText("jLabel3");

        labelJugador4.setText("jLabel4");

        labelPuntajeJ1.setText("jLabel5");

        labelPuntajeJ2.setText("jLabel6");

        labelPuntajeJ3.setText("jLabel7");

        labelPuntajeJ4.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabelTituloPuntaje)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelJugador1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPuntajeJ1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(labelJuagdor2)
                            .addGap(73, 73, 73)
                            .addComponent(labelPuntajeJ2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelJugador3)
                            .addComponent(labelJugador4))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPuntajeJ4)
                            .addComponent(labelPuntajeJ3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTituloPuntaje)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJugador1)
                    .addComponent(labelPuntajeJ1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJuagdor2)
                    .addComponent(labelPuntajeJ2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJugador3)
                    .addComponent(labelPuntajeJ3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJugador4)
                    .addComponent(labelPuntajeJ4))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(MostrarMarcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarMarcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarMarcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarMarcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarMarcador().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTituloPuntaje;
    private javax.swing.JLabel labelJuagdor2;
    private javax.swing.JLabel labelJugador1;
    private javax.swing.JLabel labelJugador3;
    private javax.swing.JLabel labelJugador4;
    private javax.swing.JLabel labelPuntajeJ1;
    private javax.swing.JLabel labelPuntajeJ2;
    private javax.swing.JLabel labelPuntajeJ3;
    private javax.swing.JLabel labelPuntajeJ4;
    // End of variables declaration//GEN-END:variables
}
