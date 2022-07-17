package ja_026_facturación;

import java.sql.*;

public class Conexion {
    Connection conectar = null;
    public Connection conectar(){
        try{
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:tiendamascotas.db");
            // conectar = DriverManager.getConnection("jdbc:squlite:C:\\sqlite\\Data\\Facturacion.db");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
