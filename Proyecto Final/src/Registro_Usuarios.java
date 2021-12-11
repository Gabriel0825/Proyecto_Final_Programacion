
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Registro_Usuarios extends javax.swing.JFrame {

     Connection con = null;
    Statement stmt = null;
   
    
    public Registro_Usuarios() {
        initComponents();
        this.setTitle("REGISTRO");
        this.setLocation(450,150);
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registro_name = new javax.swing.JLabel();
        nombre_usuario_registro = new javax.swing.JLabel();
        apellido_usuario_registro = new javax.swing.JLabel();
        correo_usuario = new javax.swing.JLabel();
        pass_usuario = new javax.swing.JLabel();
        confirmar_pass = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        campo_apellido = new javax.swing.JTextField();
        campo_telefono = new javax.swing.JTextField();
        campo_correo = new javax.swing.JTextField();
        telefono_usuario = new javax.swing.JLabel();
        campo_confirmarpass = new javax.swing.JPasswordField();
        campo_pass = new javax.swing.JPasswordField();
        boton_registrarse = new javax.swing.JButton();
        nombre_usuario = new javax.swing.JLabel();
        campo_nombre_usuario = new javax.swing.JTextField();
        registro_usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registro_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        registro_name.setForeground(new java.awt.Color(255, 255, 255));
        registro_name.setText("REGISTRARSE");
        getContentPane().add(registro_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        nombre_usuario_registro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nombre_usuario_registro.setForeground(new java.awt.Color(255, 255, 255));
        nombre_usuario_registro.setText("NOMBRE:");
        getContentPane().add(nombre_usuario_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        apellido_usuario_registro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        apellido_usuario_registro.setForeground(new java.awt.Color(255, 255, 255));
        apellido_usuario_registro.setText("APELLIDO:");
        getContentPane().add(apellido_usuario_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        correo_usuario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        correo_usuario.setForeground(new java.awt.Color(255, 255, 255));
        correo_usuario.setText("CORREO:");
        getContentPane().add(correo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        pass_usuario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pass_usuario.setForeground(new java.awt.Color(255, 255, 255));
        pass_usuario.setText("CONTRASEÑA:");
        getContentPane().add(pass_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        confirmar_pass.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        confirmar_pass.setForeground(new java.awt.Color(255, 255, 255));
        confirmar_pass.setText("CONFIRMAR CONTRASEÑA:");
        getContentPane().add(confirmar_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });
        campo_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(campo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 180, -1));
        getContentPane().add(campo_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 180, -1));

        campo_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(campo_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 180, -1));
        getContentPane().add(campo_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 180, -1));

        telefono_usuario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        telefono_usuario.setForeground(new java.awt.Color(255, 255, 255));
        telefono_usuario.setText("TELEFONO:");
        getContentPane().add(telefono_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        campo_confirmarpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_confirmarpassActionPerformed(evt);
            }
        });
        getContentPane().add(campo_confirmarpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 170, -1));

        campo_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_passActionPerformed(evt);
            }
        });
        getContentPane().add(campo_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 180, -1));

        boton_registrarse.setText("REGISTRARSE");
        boton_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarseActionPerformed(evt);
            }
        });
        getContentPane().add(boton_registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        nombre_usuario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nombre_usuario.setForeground(new java.awt.Color(255, 255, 255));
        nombre_usuario.setText("NOMBRE DE USUARIO:");
        getContentPane().add(nombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, 20));
        getContentPane().add(campo_nombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 180, -1));

        registro_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aurora.jpg"))); // NOI18N
        registro_usuario.setText("jLabel1");
        getContentPane().add(registro_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_telefonoActionPerformed

    private void campo_confirmarpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_confirmarpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_confirmarpassActionPerformed

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void campo_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_passActionPerformed

    private void boton_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarseActionPerformed
        
     
        
        String nombre_usuario,nombre,apellido,telefono,correo,password;
       
       nombre_usuario = campo_nombre_usuario.getText();
       nombre = campo_nombre.getText();
        apellido = campo_apellido.getText();
        telefono = campo_telefono.getText();
        correo = campo_correo.getText();
        password = new String(campo_pass.getPassword()) ;
       
        
        if ( campo_nombre_usuario.getText().equals("") || campo_nombre.getText().equals("") || (campo_apellido.getText().equals("")) || (campo_telefono.getText().equals("")) || (campo_correo.getText().equals(""))
           || (campo_pass.getText().equals(""))) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"No puede haber campos vacios!! \n","ADVERTENCIA!!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            campo_nombre.requestFocus();
        }
        else {
        
        try {
           
            String url = "jdbc:mysql://localhost:3306/usuarios";
            String user = "root";
            String pass = "";
            
             Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexi\u00f3n a la base de datos\n" + url ); 
  
                  String query = "INSERT INTO registro_usuarios (Nombre, Apellido, No_Telefono, Correo_Electronico, Password, Nombre_Usuario) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement PreQuery = con.prepareStatement(query);
                PreQuery.setString(1, nombre);
                PreQuery.setString(2, apellido);
                PreQuery.setString(3, telefono);
                PreQuery.setString(4, correo);
                PreQuery.setString(5, password);
                PreQuery.setString(6, nombre_usuario);
                
                PreQuery.execute();
              
                  System.out.println("Se ha insertado un registro");
                 
                   
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
        
       }
        
        finally {
            if (con != null) {
                try {
                    con.close();
                    
                } catch ( SQLException e ) { 
                         System.out.println( e.getMessage());
                }
            }
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        this.campo_nombre.setText("");
        this.campo_apellido.setText("");  
        this.campo_telefono.setText("");
        this.campo_correo.setText("");
        this.campo_pass.setText("");
        
         Login_Usuarios loguear = new Login_Usuarios();
        loguear.setVisible(true);
        this.dispose();
       
        

       
    }//GEN-LAST:event_boton_registrarseActionPerformed

    private void campo_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_nombreKeyTyped
       
        
        
        
      
        
        
    }//GEN-LAST:event_campo_nombreKeyTyped

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
            java.util.logging.Logger.getLogger(Registro_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registro_Usuarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido_usuario_registro;
    private javax.swing.JButton boton_registrarse;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JPasswordField campo_confirmarpass;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_nombre_usuario;
    private javax.swing.JPasswordField campo_pass;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JLabel confirmar_pass;
    private javax.swing.JLabel correo_usuario;
    private javax.swing.JLabel nombre_usuario;
    private javax.swing.JLabel nombre_usuario_registro;
    private javax.swing.JLabel pass_usuario;
    private javax.swing.JLabel registro_name;
    private javax.swing.JLabel registro_usuario;
    private javax.swing.JLabel telefono_usuario;
    // End of variables declaration//GEN-END:variables
}