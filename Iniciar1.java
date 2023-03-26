/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.*;

public class Iniciar1 extends javax.swing.JFrame {
    
    Conexion enlace = new Conexion(); 
    Connection conect  = (Connection) enlace.Conectar();
    
    public Iniciar1() {
        initComponents();
    }

     public void ValidarUsuario(String id, String nombre){
        int resultado =0;
        String consulta ="select * from USUARIO where id ='"+id+"' and nombre = '"+nombre+"' "; 
        
        if(nombre.isEmpty()|| id.isEmpty()){
            NombreRegistrar.setText("");
            Contraseña.setText("");
            JOptionPane.showMessageDialog(null, "Error Digite todo los campos");
        }
        else{
            
            try {
                Statement st = conect.createStatement();
                ResultSet rs = st.executeQuery(consulta);
                
                if(rs.next()){
                    resultado =1;
                    if(resultado ==1){
                        JOptionPane.showMessageDialog(null, "Seccion Inciada");
                        VerResultado verresultado = new VerResultado();
                        this.setVisible(false);
                        verresultado.setVisible(true);
                    }
                }
                else{JOptionPane.showMessageDialog(null,"Error Acceso Denegado");}
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error "+e);
            } 
        }
        
        NombreRegistrar.setText("");
            Contraseña.setText("");
         
     }
     public void ValidarUsuarioAdmin(String id, String nombre){
        int resultado =0;
        String consulta ="select * from usuario_admin where id ='"+id+"' and nombre = '"+nombre+"' "; 
        
        if(nombre.isEmpty()|| id.isEmpty()){
            NombreRegistrar.setText("");
            Contraseña.setText("");
            JOptionPane.showMessageDialog(null, "Error Digite todo los campos");
        }
        else{
            
            try {
                Statement st = conect.createStatement();
                ResultSet rs = st.executeQuery(consulta);
                
                if(rs.next()){
                    resultado =1;
                    if(resultado ==1){
                        JOptionPane.showMessageDialog(null, "Seccion Inciada");
                        PanelDeControl panel = new PanelDeControl();
                        this.setVisible(false);
                        panel.setVisible(true);
                    }
                }
                else{JOptionPane.showMessageDialog(null,"Error Acceso Denegado");}
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error "+e);
            } 
        }
        
        NombreRegistrar.setText("");
            Contraseña.setText("");
         
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreRegistrar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Contraseña = new javax.swing.JTextField();
        IniciarSeccion = new javax.swing.JButton();
        Atras1 = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("LOGIN ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("USUARIO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        IniciarSeccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IniciarSeccion.setText("ENTRAR");
        IniciarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSeccionActionPerformed(evt);
            }
        });

        Atras1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Atras1.setText("ATRAS");
        Atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras1ActionPerformed(evt);
            }
        });

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ADMIN", "USUARIO" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contraseña))))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(IniciarSeccion)
                .addGap(198, 198, 198))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(Atras1)
                    .addContainerGap(389, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(IniciarSeccion)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(274, Short.MAX_VALUE)
                    .addComponent(Atras1)
                    .addGap(4, 4, 4)))
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

    private void IniciarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSeccionActionPerformed
        String nombre = NombreRegistrar.getText();
        String id = Contraseña.getText();
        
        int option = ComboBox.getSelectedIndex();
        
        
        if(option ==1){
            ValidarUsuarioAdmin(id, nombre);
        }
        else if(option ==2){
            ValidarUsuario(id, nombre);
        }
        else{JOptionPane.showMessageDialog(null, "Opcion No valida");
            NombreRegistrar.setText("");
            Contraseña.setText("");}
        
        
    }//GEN-LAST:event_IniciarSeccionActionPerformed

    private void Atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras1ActionPerformed
        Ingresar ingresar = new Ingresar();
        this.setVisible(false);
        ingresar.setVisible(true);
    }//GEN-LAST:event_Atras1ActionPerformed

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
            java.util.logging.Logger.getLogger(Iniciar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras1;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField Contraseña;
    private javax.swing.JButton IniciarSeccion;
    private javax.swing.JTextField NombreRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
