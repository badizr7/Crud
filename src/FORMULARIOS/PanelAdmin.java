
package FORMULARIOS;

import com.mysql.jdbc.Connection;
import java.sql.*;
import conexion.conexionMysql2;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.frmlogin;



public class PanelAdmin extends javax.swing.JFrame {
    public static frmlogin fl;
    conexion.conexionMysql2 con = new conexionMysql2();
    Connection cn;
    Statement st; 
    ResultSet rs; 
    DefaultTableModel modelo; 
    int id; 
    public PanelAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }


    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtbarrio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacodigos = new javax.swing.JTable();
        btnagregar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btncerrarsesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("ID: ");

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        txtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        txtid.setEnabled(false);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("BARRIO:");

        txtbarrio.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("DIRECCION:");

        txtcodigo.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("CODIGO: ");

        txtdireccion.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        txtdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        tablacodigos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        tablacodigos.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tablacodigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
            tablacodigos.getColumnModel().getColumn(1).setMinWidth(120);
            tablacodigos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablacodigos.getColumnModel().getColumn(1).setMaxWidth(120);
            tablacodigos.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        btnagregar.setBackground(new java.awt.Color(0, 153, 255));
        btnagregar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\juanl\\Downloads\\CrudET\\build\\classes\\images\\add_user.png")); // NOI18N
        btnagregar.setText("AGREGAR");
        btnagregar.setBorder(null);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btneditar.setBackground(new java.awt.Color(0, 153, 255));
        btneditar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btneditar.setForeground(new java.awt.Color(255, 255, 255));
        btneditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\juanl\\Downloads\\CrudET\\build\\classes\\images\\revert.png")); // NOI18N
        btneditar.setText("EDITAR");
        btneditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(0, 153, 255));
        btneliminar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\juanl\\Downloads\\CrudET\\build\\classes\\images\\button_cancel.png")); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(0, 153, 255));
        btnnuevo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\juanl\\Downloads\\CrudET\\build\\classes\\images\\search.png")); // NOI18N
        btnnuevo.setText("NUEVO");
        btnnuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        btncerrarsesion.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btncerrarsesion.setForeground(new java.awt.Color(0, 153, 255));
        btncerrarsesion.setIcon(new javax.swing.ImageIcon("C:\\Users\\juanl\\Downloads\\CrudET\\build\\classes\\images\\button_cancel.png")); // NOI18N
        btncerrarsesion.setText("CERRAR SESION");
        btncerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO ADMIN ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addComponent(btncerrarsesion)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btncerrarsesion))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 792, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        Agregar();
        listar();
        nuevo();
                
    }//GEN-LAST:event_btnagregarActionPerformed

    private void tablacodigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacodigosMouseClicked
        int fila = tablacodigos.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null,"Usuario no Seleccionado");
        }else{
            id = Integer.parseInt((String)tablacodigos.getValueAt(fila, 0).toString());
            String barrio = (String)tablacodigos.getValueAt(fila, 1).toString();
            String codigo = (String)tablacodigos.getValueAt(fila, 2).toString();
            String direccion = (String)tablacodigos.getValueAt(fila, 3).toString();
            txtid.setText(""+id);
            txtbarrio.setText(barrio);
            txtcodigo.setText(codigo);
            txtdireccion.setText(direccion);

        }
    }//GEN-LAST:event_tablacodigosMouseClicked

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        modificar();
        listar();
        nuevo();
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminar();
        listar();
        nuevo();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btncerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsesionActionPerformed
        cerrarsesion();
    }//GEN-LAST:event_btncerrarsesionActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed
    void modificar(){
        String barrio = txtbarrio.getText();
        String codigo = txtcodigo.getText();
        String direccion = txtdireccion.getText();
        String sql = "update codigos set barrio='"+barrio+"',codigo='"+codigo+"',direccion='"+direccion+"' where id="+id;
        if(barrio.equals("")||codigo.equals("")||direccion.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar los datos");
        }else{
            try {
                cn = con.getConnection2();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"CODIGO ACTUALIZADO","ACTUALIZADO",JOptionPane.INFORMATION_MESSAGE);
                limpiartabla();
            } catch (Exception e) {
            }
        }
    }

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
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdmin().setVisible(true);
            }
        });
    }
    void listar(){
        String sql = "select * from codigos";
        try {
            cn=con.getConnection2();
            st = cn.createStatement();
            rs =st.executeQuery(sql);
            Object[]codigos= new Object[4];
            modelo = (DefaultTableModel) tablacodigos.getModel();
            modelo.setRowCount(0);
            while(rs.next()){
                codigos[0]=rs.getInt("id");
                codigos[1]=rs.getString("barrio");
                codigos[2]=rs.getInt("codigo");
                codigos[3]=rs.getString("direccion");
                modelo.addRow(codigos);
            }
            tablacodigos.setModel(modelo);
        } catch (SQLException e) {
        }
    }
    void Agregar(){
        String barrio = txtbarrio.getText();
        String codigo = txtcodigo.getText();
        String direccion = txtdireccion.getText();
        if(barrio.isEmpty()||codigo.isEmpty()||direccion.isEmpty()){
            JOptionPane.showMessageDialog(null,"AGREGUE LOS DATOS SOLICITADOS","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            String sql = "INSERT INTO codigos(barrio,codigo,direccion)VALUES('"+barrio+"','"+codigo+"','"+direccion+"')";
            try {
                cn= con.getConnection2();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "¡¡¡CODIGO AGREGADO CORRECTAMENTE!!!","AGREGADO",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
            }
        }
    }
    void limpiartabla(){
        modelo.setRowCount(0);
    }
    void eliminar(){
        int filaseleccionado = tablacodigos.getSelectedRow();
        if(filaseleccionado == -1){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
        }else{
            String sql = "delete from codigos where id="+id;
            try {
                cn = con.getConnection2();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"¡¡¡CODIGO ELIMINADO!!!","ELIMIINADO",JOptionPane.INFORMATION_MESSAGE);
                limpiartabla();
            } catch (SQLException e) {
            }
        }
    }
    void nuevo(){
        txtid.setText("");
        txtbarrio.setText("");
        txtcodigo.setText("");
        txtdireccion.setText("");
        txtbarrio.requestFocus();
    }
    void cerrarsesion(){
        int opcion = JOptionPane.showConfirmDialog(this, "Desea salir?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION){
            this.dispose();
            fl = new frmlogin(null, true);
            fl.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncerrarsesion;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablacodigos;
    private javax.swing.JTextField txtbarrio;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
