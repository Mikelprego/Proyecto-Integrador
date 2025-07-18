
package com.mycompany.puntodeventaurizen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;


public class IngresarVenta extends javax.swing.JFrame {

    public IngresarVenta() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmProducto = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmPago = new javax.swing.JComboBox<>();
        btnAtrasRVenta = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Javanese Text", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\RegistrarVenta.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 24, 409, 63));

        jLabel2.setFont(new java.awt.Font("Javanese Text", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\Monto.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 153, 180, -1));

        txtMonto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 153, 94, -1));

        jLabel3.setFont(new java.awt.Font("Javanese Text", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\Producto.png")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 93, 209, 34));

        cmProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Playera Rock", "Playera Anime", "Playera Niño", "Pulsera", "Tazas", "Termo", "Stickers", "Sudadera", "Hitters", "Grindrs", "Falda", "Short", "Gorros", "Funko Pequeño", "Medias", "Papel Para Forjar", "Rompecabezas", "Pantalon de Cuero", "Collar ", "Collares Varios", "Pieza Ombligo", "Pieza Nariz ", "Pieza Oreja ", "Sin especificar ", "Varios Productos" }));
        cmProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cmProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmProductoActionPerformed(evt);
            }
        });
        jPanel2.add(cmProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 93, -1, -1));

        btnAceptar.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\aceptar.png")); // NOI18N
        btnAceptar.setBorder(new javax.swing.border.MatteBorder(null));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 218, 34));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\Tipo de Pago.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 24));

        cmPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transferencia", "Cobro por tarjeta", "Efectivo" }));
        cmPago.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(cmPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        btnAtrasRVenta.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\FlechaChida.png")); // NOI18N
        btnAtrasRVenta.setBorder(new javax.swing.border.MatteBorder(null));
        btnAtrasRVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasRVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtrasRVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 66, 47));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmProductoActionPerformed

    private void btnAtrasRVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasRVentaActionPerformed
        
        OperacionesJFrame jf = new   OperacionesJFrame();
        jf.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAtrasRVentaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        String producto = cmProducto.getSelectedItem().toString();
        String monto = txtMonto.getText();
        String tipoPago = cmPago.getSelectedItem().toString();

    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uri", "root", "root123");
        String sql = "INSERT INTO venta (Producto, Monto, Tipo_Pago) VALUES (?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, producto);
        stmt.setString(2, monto);
        stmt.setString(3, tipoPago);
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Venta registrada con éxito");
        con.close(); // Cerrar la conexión después de usarla
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al registrar la venta");
    }

    }//GEN-LAST:event_btnAceptarActionPerformed

  
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
            java.util.logging.Logger.getLogger(IngresarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtrasRVenta;
    private javax.swing.JComboBox<String> cmPago;
    private javax.swing.JComboBox<String> cmProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
