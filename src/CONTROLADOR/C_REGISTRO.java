/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.CONEXION;
import MODELO.SQL_USUARIOS;
import MODELO.USUARIOS;
import VISTA.ADMIN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class C_REGISTRO {
    
    ADMIN frmAdmin;
    CONEXION con = new CONEXION();
    Connection cn;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;  
    
    public int Registro (){
    
     SQL_USUARIOS modSql = new SQL_USUARIOS();
        USUARIOS mod = new USUARIOS();

       
    
    return 0;
    }
    
}
