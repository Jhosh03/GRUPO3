/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josh Bor
 */
public class CONEXION {
    
    private final String base="db_caja_bancos";
    private final String user="root";
    private final String password="123456789";
    private final String url="jdbc:mysql://localhost:3306/"+base;
    private Connection con=null;
    
    
    
    public Connection getConexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CONEXION.class.getName()).log(Level.SEVERE, null, ex);
        }
    return con; 
    }
    
}
