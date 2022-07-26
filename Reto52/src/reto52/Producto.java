

package reto52;

import persistencia.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Producto 
{
    private String nombre;
    private String id;
    private double temperatura;
    private double valorBase;

public Producto(){}

public Producto(String nombre, String id,double temperatura,double valorBase)
{
    this.nombre=nombre;
    this.id=id;
    this.temperatura=temperatura;
    this.valorBase=valorBase;
}

public String getNombre()
    {
        return(this.nombre);
    }
 public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

  public String getId()
    {
        return(this.id);
    }
 public void setId(String id)
    {
        this.id=id;
    }

 public double getTemperatura()
    {
        return(this.temperatura);
    }
 public void setTemperatura(double temperatura)
    {
        this.temperatura=temperatura;
    }
public double getValorBase()
    {
        return(this.valorBase);
    }
 public void setValorBase(double valorBase)
    {
        this.valorBase=valorBase;
    }

     @Override
    public String toString()
    {
            return this.getClass().getName() + "{" + "id=" + id + ", nombre=" + nombre + ", temperatura=" + temperatura + ", ValorBase=" + valorBase +"}';";
    }
    
public List<Producto> listarProductos()
    {
        //CONEXION A BASE DE DATOS
        ConexionBD miconexion= new ConexionBD();
        //CREO LISTA QUE CONTIENE OBJETOS
            List<Producto>listaProductos= new ArrayList<>();
            Producto miproducto;
        try
        {

            //EJECUCION DE CONSULTA Y RESULTADO
            String consultaSQL="SELECT * FROM productos";
            ResultSet miconsulta= miconexion.consultarBD(consultaSQL);
            
            //RECORRO TODO EL RESULTSET CON EL METODO NEXT()
            while(miconsulta.next())
            {
                miproducto=new Producto();
                miproducto.setId(miconsulta.getString("id"));
                miproducto.setNombre(miconsulta.getString("nombre"));
                miproducto.setTemperatura(miconsulta.getDouble("temperatura"));
                miproducto.setValorBase(miconsulta.getDouble("valorBase"));
                listaProductos.add(miproducto);
            }
        }

        catch(SQLException ex)
        {
            System.out.println("Error listando productos"+ ex.getMessage());
        }
        finally 
        {
            miconexion.cerrarConexion();
        }
        return (listaProductos);
    }

 public boolean guardarProducto()
{
    //CONEXION A BASE DE DATOS
        ConexionBD miconexion= new ConexionBD();
       //CREANDO MI SCRIPT PARA ENVIAR A SQL -TRANSACCION
        String SQL="INSERT INTO productos(id,nombre,temperatura,valorBase) VALUES('"+this.id+"','"+this.nombre+"',"+this.temperatura+","+this.valorBase+");";
        if (miconexion.setAutoCommitBD(false)==true)
        {
            if(miconexion.insertarBD(SQL)==true)
            {
                miconexion.commitBD();
                miconexion.cerrarConexion();
                return (true);
            }
            
            else
            {
                miconexion.rollbackBD();
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

 public boolean actualizarProducto()
{
    //CONEXION A BASE DE DATOS
        ConexionBD miconexion= new ConexionBD();
       //CREANDO MI SCRIPT PARA ENVIAR A SQL -TRANSACCION
        String SQL="UPDATE productos SET nombre='"+this.nombre+"', temperatura="+this.temperatura+", valorBase="+this.valorBase+" WHERE id='"+this.id+"';";

        if (miconexion.setAutoCommitBD(false)==true)
        {
            if(miconexion.actualizarBD(SQL)==true)
            {
                miconexion.commitBD();
                miconexion.cerrarConexion();
                return (true);
            }
            
            else
            {
                miconexion.rollbackBD();
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

//BORRAR CLIENTE
  public boolean borrarProducto()
{
    //CONEXION A BASE DE DATOS
        ConexionBD miconexion= new ConexionBD();
       //CREANDO MI SCRIPT PARA ENVIAR A SQL -TRANSACCION
        String SQL="DELETE FROM productos WHERE id='"+this.id+"';";

        if (miconexion.setAutoCommitBD(false)==true)
        {
            if(miconexion.borrarBD(SQL)==true)
            {
                miconexion.commitBD();
                miconexion.cerrarConexion();
                return (true);
            }
            
            else
            {
                miconexion.rollbackBD();
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