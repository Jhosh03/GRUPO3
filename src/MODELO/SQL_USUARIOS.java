
package MODELO;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SQL_USUARIOS extends CONEXION {
    
 public boolean login(USUARIOS usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT ID_USUARIO, PASSWORD,TIPO_USUARIO FROM USUARIOS WHERE ID_USUARIO=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                if (usr.getPassword().equals(rs.getString(2))) {                 
                    usr.setId_tipo(rs.getString(3));
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(SQL_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
      public boolean registrar (USUARIOS usr){
    
        PreparedStatement ps= null;
        Connection con=getConexion();
        
        String sql = "INSERT INTO usuarios (ID_USUARIO,PASSWORD,TIPO_USUARIO) VALUES(?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,usr.getId());
            ps.setString(2,usr.getPassword());
            ps.setString(3,usr.getId_tipo());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQL_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }
    
    
}
