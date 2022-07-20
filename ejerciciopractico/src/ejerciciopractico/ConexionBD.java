package ejerciciopractico;

import java.sql.*;
import java.util.logging.*;

public class ConexionBD
{
    //Configuracion de la conexion a la base de datos
    private String url = "";
    public Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    final String BD="facturacion.db";
    //Constructor sin parmetros
    public ConexionBD()
    {
        //url = "jdbc:sqlite:reto5db.db";
        url = "jdbc:sqlite:"+BD;
        try
        {
            // Realizar la conexion
            con = DriverManager.getConnection(url);
            if (con != null)
            {
                DatabaseMetaData meta = con.getMetaData();
                System.out.println("Base de datos " + BD + " conectada. Driver " + meta.getDriverName());
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    //Retornar la conexion
    public Connection getConnection()
    {
        return con;
    }
    //Cerrar la conexion
    public void closeConnection(Connection con)
    {
        if(con != null)
        {
            try
            {
                con.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //Metodo que devuelve un ResultSet de una consulta (tratamiento de SELECT)
    public ResultSet consultarBD(String sentencia)
    {
        try
        {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sentencia);
        }
        catch(SQLException sqlex)
        {
            System.out.println(sqlex.getMessage());
        }
        catch(RuntimeException rex)
        {
            System.out.println(rex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return rs;
    }
    //Metodo que realiza un INSERT y devuelve TRUE si la operacin fue exitosa
    public boolean insertarBD(String sentencia)
    {
        try
        {
            stmt = con.createStatement();
            stmt.execute(sentencia);
        }
        catch(SQLException | RuntimeException sqlex)
        {
            System.out.println("ERROR RUTINA: " + sqlex);
            return false;
        }
        return true;
    }
    public boolean borrarBD(String sentencia)
    {
        try
        {
            stmt = con.createStatement();
            stmt.execute(sentencia);
        }
        catch(SQLException | RuntimeException sqlex)
        {
            System.out.println("ERROR RUTINA: " + sqlex);
            return false;
        }
        return true;
    }
    //Metodo que realiza una operacin como UPDATE, DELETE, CREATE TABLE, entre otras y devuelve TRUE si la operacion fue exitosa
    public boolean actualizarBD(String sentencia)
    {
        try
        {
            stmt = con.createStatement();
            stmt.executeUpdate(sentencia);
        }
        catch(SQLException | RuntimeException sqlex)
        {
            System.out.println("ERROR RUTINA: " + sqlex);
            return false;
        }
        return true;
    }
    //Por defecto, una conexión funciona en modo autocommit, es decir, cada vez que se ejecuta una sentencia SQL se abre y se cierra automáticamente una transacción, que sólo afecta a dicha sentencia
    public boolean setAutoCommitBD(boolean parametro)
    {
        try
        {
            con.setAutoCommit(parametro);
        }
        catch (SQLException sqlex)
        {
            System.out.println("Error al configurar el autoCommit " + sqlex.getMessage());
            return false;
        }
        return true;
    }
    //Metodo para cerrar la conexion
    public void cerrarConexion()
    {
        closeConnection(con);
    }
    //Hacer un commit se refiere a la idea de confirmar un conjunto de cambios provisionales de forma permanente
    public boolean commitBD()
    {
        try
        {
            con.commit();
            return true;
        } catch(SQLException sqlex)
        {
            System.out.println("Error al hacer commit " + sqlex.getMessage());
            return false;
        }
    }
    //Un rollback o reversión es una operación que devuelve a la base de datos a algún estado previo
    public boolean rollbackBD()
    {
        try
        {
            con.rollback();
            return true;
        }
        catch(SQLException sqlex)
        {
            System.out.println("Error al hacer rollback " + sqlex.getMessage());
            return false;
        }
    }
}

