
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conexionMysql2 {
    Connection con;
    public conexionMysql2(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/codigos_postales", "root", "");
            System.out.println("CONECTADO A LA BASE DE LOS CODIGOS");
        } catch (Exception e) {
            System.out.println("ERROR DE CONEXION" + e);
        }
    }
    public Connection getConnection2(){
        return con;
    }
}
