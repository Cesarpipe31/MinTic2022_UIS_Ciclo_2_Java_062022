package persistencia;

import java.sql.*;
import java.util.logging.*;

public class ConexionBD{
    private String ruta = "";
    private Connection miconexion = null;
    private Statement mitransaccion = null;
    private ResultSet miconsulta = null;
    final String NombreBD = "reto_52.db"; 
    
    public ConexionBD(){
        ruta = "jdbc:sqlite:"+NombreBD;
        try{
            miconexion = DriverManager.getConnection(ruta);
            if(miconexion != null){
                DatabaseMetaData metadata = miconexion.getMetaData();
                System.out.println("¡ La Base de datos " + NombreBD + " se conectó exitosamente! Driver utilizado: " + metadata.getDriverName());
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection(){
        return(miconexion);
    }
    
    public void closeConnection(Connection conexion){
        if(conexion != null){
            try{
                conexion.close();
            }catch(SQLException ex){
                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);    
            }
        }
    }

    public ResultSet consultarBD(String sentencia){
        try{
            mitransaccion = miconexion.createStatement();
            miconsulta = mitransaccion.executeQuery(sentencia);
        }catch(SQLException sqlex){
            System.out.println(sqlex.getMessage());
        }catch(RuntimeException rex){
            System.out.println(rex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return miconsulta;
    }
    
    public boolean insertarBD(String sentencia){
        try{
            mitransaccion = miconexion.createStatement();
            mitransaccion.execute(sentencia);
        }catch(SQLException | RuntimeException sqlex){
            System.out.println("Error rutina: " + sqlex);
            return false;
        }
        return true;
    }

    public boolean borrarBD(String sentencia){
        try{
            mitransaccion = miconexion.createStatement();
            mitransaccion.execute(sentencia);
        }catch(SQLException | RuntimeException sqlex){
            System.out.println("Error rutina: " + sqlex);
            return false;
        }
        return true;
    }

    public boolean actualizarBD(String sentencia){
        try{
            mitransaccion = miconexion.createStatement();
            mitransaccion.executeUpdate(sentencia);
        }catch(SQLException | RuntimeException sqlex){
            System.out.println("ERROR RUTINA: " + sqlex);
            return false;
        }
        return true;
    }

    public boolean setAutoCommitBD(boolean parametro){
        try{
            miconexion.setAutoCommit(parametro);
        }catch (SQLException sqlex){
            System.out.println("Error al configurar el autoCommit " + sqlex.getMessage());
            return false;
        }
        return true;
    }
    
    public void cerrarConexion(){
        closeConnection(miconexion);
    }

    public boolean commitBD(){
        try{
            miconexion.commit();
            return true;
        }catch(SQLException sqlex){
            System.out.println("Error al hacer commit " + sqlex.getMessage());
            return false;
        }
    }
    
    public boolean rollbackBD(){
        try{
            miconexion.rollback();
            return true;
        }catch(SQLException sqlex){
            System.out.println("Error al hacer rollback " + sqlex.getMessage());
            return false;
        }
    }
}
