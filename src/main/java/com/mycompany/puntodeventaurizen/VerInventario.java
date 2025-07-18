
package com.mycompany.puntodeventaurizen;


public class VerInventario extends javax.swing.JFrame {

    public VerInventario() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAtrasOperAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/verInventario.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        btnAtrasOperAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/IMG/home.png"))); // NOI18N
        btnAtrasOperAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtrasOperAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasOperAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtrasOperAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 66, 47));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasOperAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasOperAdminActionPerformed

        OperacionesAdmin opa = new OperacionesAdmin ();
        opa.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAtrasOperAdminActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasOperAdmin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
