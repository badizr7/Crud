package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conexionMysql {
    Connection con;
    public conexionMysql(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/login_java_mysql", "root", "");
            System.out.println("CONECTADO A LA BASE DE DATOS");
        } catch (Exception e) {
            System.out.println("ERROR DE CONEXION" + e);
        }
    }
    public Connection getConnection(){
        return con;
    }

}
