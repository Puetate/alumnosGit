/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author SUPERTRONICA
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author SUPERTRONICA
 */
public class jComboBox extends JComboBox<Object>{

    public jComboBox() {
        
    }
    
    //CARGA TODOS LOS DATOS EN ITEMS DESDE UNA COLUMNDA DADA Y UNA TABLA DADA
   public void cargarPuetate(String tabla, String campo) {

        try {
            
            String[] datos = new String[0];
            conexion cc = new conexion();
            Connection cn = cc.conectar();

            String sql = "";
            sql = "select " + campo + " from " + tabla;
            Statement psd = cn.createStatement();
            ResultSet rs = psd.executeQuery(sql);
            DefaultComboBoxModel modeloDatos = new DefaultComboBoxModel(datos);
            
            while (rs.next()) {
                modeloDatos.addElement(rs.getString(campo));
                this.setModel(modeloDatos);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "--No se pudo cargar con el sistema contactese con el administrador");

        }
       
    }
   
       public void cargarDatosPrueba(String dato, String tabla){
        try {

                conexion cc = new conexion();
                Connection cn = cc.conectar();
                
                

                String sql = "";
                sql = "insert into "+ tabla +" (dato) values (?)";
                PreparedStatement psd = cn.prepareStatement(sql);

                psd.setString(1, dato);
               

                int n = psd.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "Se guardo correctamente");
                    
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    }
     
    
    
    
    
}
