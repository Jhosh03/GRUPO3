
package CONTROLADOR;

import MODELO.CONEXION;
import MODELO.HASH;
import MODELO.SQL_USUARIOS;
import MODELO.USUARIOS;



public class C_LOGIN extends CONEXION {
    
public int Ingresar (String usuario,String password){
    
 
    SQL_USUARIOS modSql = new SQL_USUARIOS();
        USUARIOS mod = new USUARIOS();
            String nuevoPass = HASH.sha1(password);
            mod.setId(usuario);
            mod.setPassword(nuevoPass);
            if (modSql.login(mod)) {
                if (mod.getId_tipo().equalsIgnoreCase("MASTER")) {
                    return 1;
                }
                if (mod.getId_tipo().equalsIgnoreCase("USUARIO")) {
                    return 2;
                }
                
            }
             return 0;         
}
}
