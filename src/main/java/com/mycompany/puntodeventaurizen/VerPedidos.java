
package com.mycompany.puntodeventaurizen;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerPedidos extends javax.swing.JFrame {

    Conexion cone = new Conexion();
    Connection con;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    public VerPedidos() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        consultarpe();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtrasOperacionAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        btnBorrarPedidos = new javax.swing.JButton();
        btnActualizarPedidos = new javax.swing.JButton();
        btnActualizarPed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtrasOperacionAdmin.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\home.png")); // NOI18N
        btnAtrasOperacionAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtrasOperacionAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasOperacionAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtrasOperacionAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 80, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\pedidosemana.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 16, -1, -1));

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Pedido", "Id_Cliente", "Adelanto", "Restante", "Fecha_Pedido", "Fecha_Entrega", "Encargo", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(Tabla2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 850, 300));

        btnBorrarPedidos.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\borrar.png")); // NOI18N
        btnBorrarPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBorrarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPedidosActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, -1, 90));

        btnActualizarPedidos.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\editar.png")); // NOI18N
        btnActualizarPedidos.setToolTipText("");
        btnActualizarPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btnActualizarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, -1, -1));

        btnActualizarPed.setIcon(new javax.swing.ImageIcon("C:\\UrizenMetalShop\\refrescar.png")); // NOI18N
        btnActualizarPed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnActualizarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPedActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizarPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 90, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasOperacionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasOperacionAdminActionPerformed

        OperacionesAdmin opa = new OperacionesAdmin ();
        opa.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAtrasOperacionAdminActionPerformed

    private void btnBorrarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPedidosActionPerformed
       eliminar();
       limpiarTabla();
    }//GEN-LAST:event_btnBorrarPedidosActionPerformed

    private void btnActualizarPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPedActionPerformed
        consultarpe();
    }//GEN-LAST:event_btnActualizarPedActionPerformed

    void eliminar(){
        int fila = Tabla2.getSelectedRow();
        try {
        int idPedido = Integer.parseInt(Tabla2.getValueAt(fila, 0).toString());
        String sql = "DELETE FROM pe WHERE Id_Pedido=" + idPedido;

        con = cone.conectar();                // CORRECTO
        st = con.createStatement();           // CORRECTO: se hace sobre 'con', no sobre 'cone'
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Pedido Cancelado");
        } catch(Exception e) {
        System.out.println("Error al eliminar el pedido: " + e.getMessage());
       }
    }
    
    void limpiarTabla(){
        for(int i = 0 ; i<=Tabla2.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerPedidos().setVisible(true);
            }
        });
    }

void consultarpe() {
    String sql = "SELECT * FROM pe";
    try {
        con = cone.conectar(); 
        st = con.createStatement();
        rs = st.executeQuery(sql);
        modelo = (DefaultTableModel) Tabla2.getModel();
        modelo.setRowCount(0); 
        Object[] pe = new Object[8]; 

        while (rs.next()) {
            pe[0] = rs.getInt("Id_Pedido");
            pe[1] = rs.getString("Id_Cliente");
            pe[2] = rs.getString("Adelanto");
            pe[3] = rs.getString("Restante");
            pe[4] = rs.getString("Fecha_Pedido");
            pe[5] = rs.getString("Fecha_Entrega");
            pe[6] = rs.getString("Encargo");
            pe[7] = rs.getString("Telefono");
            modelo.addRow(pe);
        }
    } catch (Exception e) {
        System.out.println("Error al mostrar datos: " + e.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (st != null) st.close(); } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla2;
    private javax.swing.JButton btnActualizarPed;
    private javax.swing.JButton btnActualizarPedidos;
    private javax.swing.JButton btnAtrasOperacionAdmin;
    private javax.swing.JButton btnBorrarPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
