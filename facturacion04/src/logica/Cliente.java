package logica;

import persistencia.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Cliente
{
    private String codtipoid;
    private int id;
    private String nombres;
    private String apellidos;
    //Falta incluir el resto de los atributos: telefono, direccion, correo, fechanacimiento
    public Cliente(String cotipoid, int id, String nombres, String apellidos)
    {
        this.codtipoid=codtipoid;
        this.id=id;
        this.nombres=nombres;
        this.apellidos=apellidos;        
    }
    public Cliente()
    {
        
    }
    public String getCodTipoId()
    {
        return(this.codtipoid);
    }
    public void setCodTipoId(String codtipoid)
    {
        this.codtipoid=codtipoid;
    }    
    public int getId()
    {
        return(this.id);
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getNombres()
    {
        return(this.nombres);
    }
    public void setNombres(String nombres)
    {
        this.nombres=nombres;
    } 
    public String getApellidos()
    {
        return(this.apellidos);
    }
    public void setApellidos(String apellidos)
    {
        this.apellidos=apellidos;
    }
    @Override
    public String toString()
    {
        return this.getClass().getName() + "{" + "codtipoid=" + this.codtipoid + ", id=" + this.id + ", nombres=" + this.nombres + ", apellidos=" + this.apellidos + '}';
    }
    public List<Cliente> listarCliente()
    {
        //Creo la lista que contiene los objetos cliente
        List<Cliente> milistaclientes = new ArrayList<>();
        //Me conecto a la base de datos
        ConexionBD miconexion = new ConexionBD();
        //Preparo el String de consulta
        String SQL = "SELECT * FROM clientes;";
        try
        {
            //Ejecuto la consulta y guardo el resultado en miconsulta
            ResultSet miconsulta = miconexion.consultarBD(SQL);
            //Declaro la variable que contiene el objeto
            Cliente micliente;
            //Recorro todo el Resulset con el metodo next
            while(miconsulta.next())
            {
                micliente = new Cliente();
                micliente.setCodTipoId(miconsulta.getString("codtipoid"));
                micliente.setId(miconsulta.getInt("id"));
                micliente.setNombres(miconsulta.getString("nombres"));
                micliente.setApellidos(miconsulta.getString("apellidos"));
                milistaclientes.add(micliente);
            }
            
        }
        catch(SQLException ex)
        {
            System.out.println("Error al listar productos:" + ex.getMessage());
        }
        finally
        {
            miconexion.cerrarConexion();
        }
        return milistaclientes;
    }
    public boolean guardarCliente()
    {
        //Me conecto a la base de datos
        ConexionBD miconexion = new ConexionBD();
        //Preparo el String de consulta
        String SQL = "INSERT INTO clientes(codtipoid,id,nombres,apellidos) VALUES('"+ this.codtipoid +"',"+ this.id +",'"+ this.nombres +"','"+ this.apellidos +"');";
        //Valido los parametros de conexion
        if(miconexion.setAutoCommitBD(false))
        {
            //Valido el script para la interacción con la base de datos
            if(miconexion.insertarBD(SQL))
            {
                miconexion.commitBD(); //Altera la base de datos con el script indicado
                miconexion.cerrarConexion(); //Cierra la conexion
                return(true);
            }
            else
            {
                miconexion.rollbackBD(); //Cancela la ejecución del script en la base de datos
                miconexion.cerrarConexion();
                return(false);
            }
            
        }
        else
        {
            miconexion.cerrarConexion();
            return(false);
        }
    }
    public boolean actualizarCliente()
    {
        //Me conecto a la base de datos
        ConexionBD miconexion = new ConexionBD();
        //Preparo el String de consulta
        String SQL = "UPDATE clientes SET nombres='"+this.nombres+"', apellidos='"+this.apellidos+"' WHERE codtipoid='"+this.codtipoid+"' AND id='"+this.id+"'";
        //Valido los parametros de conexion
        if(miconexion.setAutoCommitBD(false))
        {
            //Valido el script para la interacción con la base de datos
            if(miconexion.actualizarBD(SQL))
            {
                miconexion.commitBD(); //Altera la base de datos con el script indicado
                miconexion.cerrarConexion(); //Cierra la conexion
                return(true);
            }
            else
            {
                miconexion.rollbackBD(); //Cancela la ejecución del script en la base de datos
                miconexion.cerrarConexion();
                return(false);
            }
            
        }
        else
        {
            miconexion.cerrarConexion();
            return(false);
        }
    }
    public boolean borrarCliente()
    {
        //Me conecto a la base de datos
        ConexionBD miconexion = new ConexionBD();
        //Preparo el String de consulta
        String SQL = "DELETE FROM clientes WHERE codtipoid='"+this.codtipoid+"' AND id='"+this.id+"'";
        //Valido los parametros de conexion
        if(miconexion.setAutoCommitBD(false))
        {
            //Valido el script para la interacción con la base de datos
            if(miconexion.borrarBD(SQL))
            {
                miconexion.commitBD(); //Altera la base de datos con el script indicado
                miconexion.cerrarConexion(); //Cierra la conexion
                return(true);
            }
            else
            {
                miconexion.rollbackBD(); //Cancela la ejecución del script en la base de datos
                miconexion.cerrarConexion();
                return(false);
            }
            
        }
        else
        {
            miconexion.cerrarConexion();
            return(false);
        }
    }  
}
