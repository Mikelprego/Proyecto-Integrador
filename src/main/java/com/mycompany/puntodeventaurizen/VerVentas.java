package com.mycompany.puntodeventaurizen;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VerVentas extends javax.swing.JFrame {

    Conexion cone = new Conexion();
    Connection con;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    public VerVentas() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        consultar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizarPed = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtrasOperaAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnBorrarVentas = new javax.swing.JButton();
        btnActualizarVentas = new javax.swing.JButton();

        btnActualizarPed.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\refrescar.png")); // NOI18N
        btnActualizarPed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnActualizarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPedActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\VentasAdmin.png")); // NOI18N

        btnAtrasOperaAdmin.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\home.png")); // NOI18N
        btnAtrasOperaAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtrasOperaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasOperaAdminActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Producto", "Id_Venta", "Id_empleado", "Monto", "Tipo_Pago", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        btnBorrarVentas.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\borrar.png")); // NOI18N
        btnBorrarVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBorrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarVentasActionPerformed(evt);
            }
        });

        btnActualizarVentas.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\refrescar.png")); // NOI18N
        btnActualizarVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnActualizarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAtrasOperaAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrarVentas)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarVentas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtrasOperaAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAtrasOperaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasOperaAdminActionPerformed

        OperacionesAdmin opa = new OperacionesAdmin ();
        opa.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAtrasOperaAdminActionPerformed

    private void btnBorrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarVentasActionPerformed
        eliminarventa();
        limpiarTablaVenta();
    }//GEN-LAST:event_btnBorrarVentasActionPerformed

    private void btnActualizarPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPedActionPerformed
        
    }//GEN-LAST:event_btnActualizarPedActionPerformed

    private void btnActualizarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarVentasActionPerformed
        consultar();
    }//GEN-LAST:event_btnActualizarVentasActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VerVentas().setVisible(true);
        });
    }

    void consultar() {
    String sql = "SELECT * FROM venta";
    try {
        con = cone.conectar(); 
        st = con.createStatement();
        rs = st.executeQuery(sql);
        modelo = (DefaultTableModel) Tabla.getModel();
        modelo.setRowCount(0); 
        Object[] venta = new Object[6]; 

        while (rs.next()) {
            venta[0] = rs.getString("Producto");
            venta[1] = rs.getInt("Id_Venta");
            venta[2] = rs.getInt("Id_Empleado");
            venta[3] = rs.getString("Monto");
            venta[4] = rs.getString("Tipo_Pago");
            venta[5] = rs.getString("Fecha");
            modelo.addRow(venta);
        }
    } catch (Exception e) {
        System.out.println("Error al mostrar datos: " + e.getMessage());
    }
}

    void eliminarventa() {
    int fila = Tabla.getSelectedRow();
    
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "Selecciona una venta para eliminar.");
        return;
    }

    try {
        // CORRECTO: Id_Venta está en la columna 1
        int idVenta = Integer.parseInt(Tabla.getValueAt(fila, 1).toString());
        String sql = "DELETE FROM venta WHERE Id_Venta=" + idVenta;

        con = cone.conectar();
        st = con.createStatement();
        st.executeUpdate(sql);

        JOptionPane.showMessageDialog(null, "Venta eliminada correctamente.");

    } catch(Exception e) {
        System.out.println("Error al eliminar la venta: " + e.getMessage());
    }
}

        
        void limpiarTablaVenta(){
        for(int i = 0 ; i<=Tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizarPed;
    private javax.swing.JButton btnActualizarVentas;
    private javax.swing.JButton btnAtrasOperaAdmin;
    private javax.swing.JButton btnBorrarVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
