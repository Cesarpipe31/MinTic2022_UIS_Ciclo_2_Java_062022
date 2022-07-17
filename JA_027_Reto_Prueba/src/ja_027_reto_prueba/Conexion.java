package ja_027_reto_prueba;

import java.sql.*;

public class Conexion {
    Connection conectar = null;
    public Connection conectar(){
        try{
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:tienda.db");
            // conectar = DriverManager.getConnection("jdbc:squlite:C:\\sqlite\\Data\\Facturacion.db");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
