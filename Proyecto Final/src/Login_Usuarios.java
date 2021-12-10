// IMPORTACIONES DE LIBRERIAS PARA CONECTAR A MYSQL
import com.mysql.jdbc.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class Login_Usuarios extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    
    
    
    public Login_Usuarios() {
        initComponents();
        this.setTitle("LOGIN");
        this.setLocation(450,150);
        
     
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JLabel();
        login_name = new javax.swing.JLabel();
        campo_usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JLabel();
        boton_ingresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        campo_contraseña = new javax.swing.JPasswordField();
        login_usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario:");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 70, 30));

        login_name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        login_name.setForeground(new java.awt.Color(255, 255, 255));
        login_name.setText("LOGIN");
        getContentPane().add(login_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 130, 60));

        campo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 150, 30));

        contraseña.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña:");
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        boton_ingresar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        boton_ingresar.setText("Ingresar");
        boton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 80, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Aun no estas registrado? Registrate Aqui");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 240, 20));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 323, 80, 30));

        campo_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_contraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(campo_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 150, 30));

        login_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aurora.jpg"))); // NOI18N
        getContentPane().add(login_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_usuarioActionPerformed
        
    }//GEN-LAST:event_campo_usuarioActionPerformed

    private void boton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ingresarActionPerformed
        
       
        String usuario,password;
        
        //SIRVE PARA QUE NO SE INGRESEN CAMPOS VACIOS
        usuario = campo_usuario.getText();
        password = new String (campo_contraseña.getPassword());
        if (campo_usuario.getText().equals("") || (campo_contraseña.getText().equals(""))) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe ingresar usuario y contraseña \n","ADVERTENCIA!!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            campo_usuario.requestFocus();
        }
        
        else {
            
            //STRING CONNECTION PARA PODER CONECTARSE A MYSQL
            String url = "jdbc:mysql://localhost:3306/usuarios";
            String user = "root";
            String pass = "";
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            try { 
                con = (Connection) DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(Login_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
             if ( con != null ) {}
                 
            String query = "SELECT * FROM registro_usuarios WHERE Nombre_Usuario = '" + usuario + "' AND Password = '" + password + "'";
                Statement s = null;
            try {
                 ResultSet result;
                s = con.createStatement();
               result = (ResultSet) s.executeQuery(query);
                if (result.next()) {
                     Botones_administracion nuevo_registro = new Botones_administracion();
                     nuevo_registro.setVisible(true);
                     this.dispose();
                    
                   
                }
                else {
                     javax.swing.JOptionPane.showMessageDialog(this,"Sus datos no son correctos \n","ADVERTENCIA!!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            campo_usuario.requestFocus();
                   
                   
                   
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            
            }
       
                
               
        



    }//GEN-LAST:event_boton_ingresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Registro_Usuarios nuevo_registro = new Registro_Usuarios();
       nuevo_registro.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campo_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_contraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login_Usuarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ingresar;
    private javax.swing.JPasswordField campo_contraseña;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JLabel contraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel login_name;
    private javax.swing.JLabel login_usuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}


