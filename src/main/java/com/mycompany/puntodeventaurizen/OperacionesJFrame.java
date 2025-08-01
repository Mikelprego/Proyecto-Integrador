
package com.mycompany.puntodeventaurizen;

public class OperacionesJFrame extends javax.swing.JFrame {

    
    public OperacionesJFrame() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnIngresarVenta = new javax.swing.JButton();
        btnIngresarPedido = new javax.swing.JButton();
        btnAtrasInicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/user.png"))); // NOI18N
        btnAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 90, 80));

        jLabel1.setFont(new java.awt.Font("Javanese Text", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/HacerHoy2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 23, 609, 49));

        btnIngresarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/IngresarVenta2.png"))); // NOI18N
        btnIngresarVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIngresarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 253, 35));

        btnIngresarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/IngresarPedido2.png"))); // NOI18N
        btnIngresarPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIngresarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 266, 38));

        btnAtrasInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/home.png"))); // NOI18N
        btnAtrasInicio.setBorder(new javax.swing.border.MatteBorder(null));
        btnAtrasInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtrasInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 70));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/pequeño 200.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarVentaActionPerformed
        
        IngresarVenta iv = new IngresarVenta();
        iv.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnIngresarVentaActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        Login lg = new Login ();
        lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnIngresarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPedidoActionPerformed
        IngresarPedido ip = new IngresarPedido();
        ip.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIngresarPedidoActionPerformed

    private void btnAtrasInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasInicioActionPerformed

        Inicio in = new Inicio ();
        in.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAtrasInicioActionPerformed

    public static void main(String args[]) {
    

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionesJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnAtrasInicio;
    private javax.swing.JButton btnIngresarPedido;
    private javax.swing.JButton btnIngresarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
