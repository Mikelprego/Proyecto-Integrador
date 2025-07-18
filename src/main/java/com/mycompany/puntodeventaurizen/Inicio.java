
package com.mycompany.puntodeventaurizen;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        btnSalirPrograma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 396, -1, -1));
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/Iniciar3.png"))); // NOI18N
        btnIniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 180, 34));

        btnSalirPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/salirchico.png"))); // NOI18N
        btnSalirPrograma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalirPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProgramaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalirPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
    Connection con = Conexion.conectar();
    if (con != null) {
        OperacionesJFrame jf = new OperacionesJFrame();
        jf.setVisible(true);
        this.setVisible(false);
    } else {
        JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos");
    }      
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnSalirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProgramaActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);

         if (opcion == JOptionPane.YES_OPTION) {
         System.exit(0);
         
         }
    }//GEN-LAST:event_btnSalirProgramaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalirPrograma;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
