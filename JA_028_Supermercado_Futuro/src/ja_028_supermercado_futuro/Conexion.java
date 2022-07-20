package ja_028_supermercado_futuro;

import java.sql.*;

public class Conexion {
    Connection conectar = null;
    public Connection conectar(){
        try{
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:Supermercado.db");
            // conectar = DriverManager.getConnection("jdbc:squlite:C:\\sqlite\\Data\\Facturacion.db");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }

    boolean setAutoCommitBD(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
