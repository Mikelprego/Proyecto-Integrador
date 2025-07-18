
package com.mycompany.puntodeventaurizen;

public class ActualizarExistencias extends javax.swing.JFrame {

    public ActualizarExistencias() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtrasAcE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbActualizar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbTalla = new javax.swing.JComboBox<>();
        btnSubirExistencias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtrasAcE.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\FlechaChida.png")); // NOI18N
        btnAtrasAcE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtrasAcE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasAcEActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtrasAcE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 66, 47));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\ActualizarExistencias2.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 27, 425, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\ProductoActualizar.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 88, 425, 35));

        cmbActualizar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Playera  Lisa", "Playera Rock ", "Sudadera", "Corset", "Falda", "Playera Sublimada Unitalla", "Playera Sublimada Niño ", "Playera Sublimada Extra Grande", "Tarjetas", "Piezas de Perforaciones", "Pulseras", " " }));
        cmbActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cmbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 142, 35));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\Cantidad.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtCantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 148, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\Talla.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 40));

        cmbTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chica", "Mediana", "Grande", "Extra Grande", " " }));
        cmbTalla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cmbTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 110, 30));

        btnSubirExistencias.setBackground(new java.awt.Color(0, 0, 0));
        btnSubirExistencias.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\subirpedido.png")); // NOI18N
        btnSubirExistencias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btnSubirExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasAcEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasAcEActionPerformed

        OperacionesAdmin opa = new OperacionesAdmin ();
        opa.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAtrasAcEActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarExistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasAcE;
    private javax.swing.JButton btnSubirExistencias;
    private javax.swing.JComboBox<String> cmbActualizar;
    private javax.swing.JComboBox<String> cmbTalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
