
package com.mycompany.puntodeventaurizen;

public class OperacionesAdmin extends javax.swing.JFrame {

    public OperacionesAdmin() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInventario = new javax.swing.JButton();
        verVentas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAtrasLogin = new javax.swing.JButton();
        btnActualizarExistencias = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/HacerHoy2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/verInventario.png"))); // NOI18N
        btnInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 317, 37));

        verVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/VerVentas.png"))); // NOI18N
        verVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        verVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verVentasActionPerformed(evt);
            }
        });
        jPanel1.add(verVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 249, 34));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/verPedidos.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 262, 30));

        btnAtrasLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/home.png"))); // NOI18N
        btnAtrasLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtrasLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtrasLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 80, 70));

        btnActualizarExistencias.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarExistencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/ActualizarExistencias.png"))); // NOI18N
        btnActualizarExistencias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnActualizarExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarExistenciasActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizarExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 370, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/pequeño 200.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasLoginActionPerformed

        OperacionesJFrame jf = new   OperacionesJFrame();
        jf.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAtrasLoginActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        
        VerInventario vi = new VerInventario ();
        vi.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void verVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verVentasActionPerformed
        
        VerVentas vv = new VerVentas ();
        vv.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_verVentasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VerPedidos vp = new VerPedidos ();
        vp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarExistenciasActionPerformed
        
        ActualizarExistencias AcE = new ActualizarExistencias ();
        AcE.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnActualizarExistenciasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarExistencias;
    private javax.swing.JButton btnAtrasLogin;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton verVentas;
    // End of variables declaration//GEN-END:variables
}
