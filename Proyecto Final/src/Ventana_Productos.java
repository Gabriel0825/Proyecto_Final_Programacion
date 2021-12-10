
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Ventana_Productos extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Productos
     */
    public Ventana_Productos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        btn_Eliminar = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        campo_nombre_producto = new javax.swing.JTextField();
        campo_marca = new javax.swing.JTextField();
        campo_categoria = new javax.swing.JTextField();
        campo_precio = new javax.swing.JTextField();
        campo_cantidad = new javax.swing.JTextField();
        btn_regresar = new javax.swing.JButton();
        fondo_ventanaproductos2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Eliminar.setText("ELIMINAR");
        getContentPane().add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 360, 100, 30));

        btn_Guardar.setText("GUARDAR");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 360, 100, 30));

        nombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("NOMBRE:");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        marca.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("MARCA:");
        getContentPane().add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        categoria.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        categoria.setForeground(new java.awt.Color(255, 255, 255));
        categoria.setText("CATEGORÍA:");
        getContentPane().add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        precio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        precio.setForeground(new java.awt.Color(255, 255, 255));
        precio.setText("PRECIO:");
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        cantidad.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cantidad.setForeground(new java.awt.Color(255, 255, 255));
        cantidad.setText("CANTIDAD:");
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        campo_nombre_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombre_productoActionPerformed(evt);
            }
        });
        getContentPane().add(campo_nombre_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 170, 30));
        getContentPane().add(campo_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 170, 30));
        getContentPane().add(campo_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 170, 30));
        getContentPane().add(campo_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, 30));

        campo_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(campo_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, 30));

        btn_regresar.setText("REGRESAR");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        fondo_ventanaproductos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aurora.jpg"))); // NOI18N
        getContentPane().add(fondo_ventanaproductos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_nombre_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombre_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombre_productoActionPerformed

    private void campo_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cantidadActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        Gestion_Productos btn_regresar = new Gestion_Productos();
        btn_regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
           String nombre_producto,marca,categoria,precio,cantidad;
       
       nombre_producto = campo_nombre_producto.getText();
       marca = campo_marca.getText();
       categoria = campo_categoria.getText();
       precio = campo_precio.getText();
       cantidad = campo_cantidad.getText();
       
       
        
        if ( campo_nombre_producto.getText().equals("") || campo_marca.getText().equals("") || (campo_categoria.getText().equals("")) || (campo_precio.getText().equals("")) || (campo_cantidad.getText().equals(""))
          ) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"No puede haber campos vacios!! \n","ADVERTENCIA!!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            campo_nombre_producto.requestFocus();
        }
        else {
        
        try {
           
            
            String url = "jdbc:mysql://localhost:3306/productos";
            String user = "root";
            String pass = "";
            
             Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(url, user, pass); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexi\u00f3n a la base de datos\n" + url ); 
  
                  String query = "INSERT INTO lista_productos (Nombre, Marca, Categoria, Precio, Cantidad) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement PreQuery = con.prepareStatement(query);
                PreQuery.setString(1, nombre_producto);
                PreQuery.setString(2, marca);
                PreQuery.setString(3, categoria);
                PreQuery.setString(4, precio);
                PreQuery.setString(5, cantidad);
                
                PreQuery.execute();
              
                  System.out.println("Se han ingresado los registros");
                 
                   
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
        
       }
        
        finally {
            Object con = null;
            if (con != null) {
               
            }
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        this.campo_nombre_producto.setText("");
        this.campo_marca.setText("");  
        this.campo_categoria.setText("");
        this.campo_precio.setText("");
        this.campo_cantidad.setText("");
    }//GEN-LAST:event_btn_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JTextField campo_cantidad;
    private javax.swing.JTextField campo_categoria;
    private javax.swing.JTextField campo_marca;
    private javax.swing.JTextField campo_nombre_producto;
    private javax.swing.JTextField campo_precio;
    private javax.swing.JLabel cantidad;
    private javax.swing.JLabel categoria;
    private javax.swing.JLabel fondo_ventanaproductos2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel precio;
    // End of variables declaration//GEN-END:variables
}
