/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Mario
 */
public class Conexion {
    
    Connection enlace = null;
     
    public Connection Conectar(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            enlace = DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion Fallida intente de nuevo "+e);
        }
            return enlace;
    }
}
