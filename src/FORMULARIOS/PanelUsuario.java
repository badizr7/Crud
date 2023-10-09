/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FORMULARIOS;

import static FORMULARIOS.PanelAdmin.fl;
import com.mysql.jdbc.Connection;
import java.sql.*;
import conexion.conexionMysql2;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.frmlogin;

/**
 *
 * @author juanl
 */
public class PanelUsuario extends javax.swing.JFrame {

    conexion.conexionMysql2 con = new conexionMysql2();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    public PanelUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        listar2();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacodigos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        combofiltro = new javax.swing.JComboBox<>();
        txtbusqueda = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btncerrarsesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USUARIO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        tablacodigos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablacodigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "BARRIO", "CODIGO", "DIRECCION"
            }
        ));
        tablacodigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacodigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablacodigos);
        if (tablacodigos.getColumnModel().getColumnCount() > 0) {
            tablacodigos.getColumnModel().getColumn(0).setMinWidth(50);
            tablacodigos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablacodigos.getColumnModel().getColumn(0).setMaxWidth(50);
            tablacodigos.getColumnModel().getColumn(1).setResizable(false);
            tablacodigos.getColumnModel().getColumn(2).setResizable(false);
            tablacodigos.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setText("BUSCAR POR:");

        combofiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        combofiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BARRIO", "CODIGO", "DIRECCION", " " }));
        combofiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        txtbusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        btnbuscar.setBackground(new java.awt.Color(0, 153, 255));
        btnbuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\juanl\\Downloads\\CrudET\\build\\classes\\images\\search.png")); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combofiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(combofiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbuscar))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 792, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO AL PROGRAMA DE CODIGOS POSTALES");

        btncerrarsesion.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btncerrarsesion.setForeground(new java.awt.Color(0, 153, 255));
        btncerrarsesion.setIcon(new javax.swing.ImageIcon("C:\\Users\\juanl\\Downloads\\CrudET\\build\\classes\\images\\button_cancel.png")); // NOI18N
        btncerrarsesion.setText("CERRAR SESION");
        btncerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncerrarsesion)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btncerrarsesion)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablacodigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacodigosMouseClicked

    }//GEN-LAST:event_tablacodigosMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        String campoSeleccionado = combofiltro.getSelectedItem().toString();
        String busqueda = txtbusqueda.getText();

        buscar(campoSeleccionado, busqueda);


    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btncerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsesionActionPerformed
        cerrarsesion();
    }//GEN-LAST:event_btncerrarsesionActionPerformed

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
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelUsuario().setVisible(true);
            }
        });
    }

    void listar2() {
        String sql = "select * from codigos";
        try {
            cn = con.getConnection2();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] codigos = new Object[4];
            modelo = (DefaultTableModel) tablacodigos.getModel();
            modelo.setRowCount(0);
            while (rs.next()) {
                codigos[0] = rs.getInt("id");
                codigos[1] = rs.getString("barrio");
                codigos[2] = rs.getInt("codigo");
                codigos[3] = rs.getString("direccion");
                modelo.addRow(codigos);
            }
            tablacodigos.setModel(modelo);
        } catch (SQLException e) {
        }
    }

    void buscar(String campo, String busqueda) {
        String sql = "SELECT * FROM codigos WHERE " + campo + " LIKE '%" + busqueda + "%'";

        try {
            cn = con.getConnection2();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] codigos = new Object[4];
            modelo = (DefaultTableModel) tablacodigos.getModel();
            modelo.setRowCount(0);
            while (rs.next()) {
                codigos[0] = rs.getInt("id");
                codigos[1] = rs.getString("barrio");
                codigos[2] = rs.getInt("codigo");
                codigos[3] = rs.getString("direccion");
                modelo.addRow(codigos);
            }
            tablacodigos.setModel(modelo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void cerrarsesion() {
        int opcion = JOptionPane.showConfirmDialog(this, "Desea salir?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            this.dispose();
            fl = new frmlogin(null, true);
            fl.setVisible(true);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncerrarsesion;
    private javax.swing.JComboBox<String> combofiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablacodigos;
    private javax.swing.JTextField txtbusqueda;
    // End of variables declaration//GEN-END:variables
}
