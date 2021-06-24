/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

/**
 *
 * @author SUPERTRONICA
 */
public class conexion {
    Connection connect;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/fiseii","root","");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se ah podido conectar con la base de datos. Conectese con el administrador del sistema");
        }
        return connect;
    }
    
}
