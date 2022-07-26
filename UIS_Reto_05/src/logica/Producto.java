package logica;

import persistencia.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Producto {
    private String nombre;
    private String id;
    private double temperatura;
    private double valorBase;

    public Producto(String nombre, String id, double temperatura, double valorBase) {
        this.nombre = nombre;
        this.id = id;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    /*
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", id=" + id + ", temperatura=" + temperatura + ", valorBase=" + valorBase + '}';
    }
*/
    
    @Override
    public String toString()
    {
            return this.getClass().getName() + "{" + "id=" + id + ", nombre=" + nombre + ", temperatura=" + temperatura + ", ValorBase=" + valorBase +"}';";
    }
    
    //METODO PARA CONSULTAR CLIENTES
    public List<Producto> listarProducto()
    {
        //Creo la lista que contiene los objetos cliente
        List<Producto> milistaproductos = new ArrayList<>();
        //Me conecto a la base de datos
        ConexionBD miconexion = new ConexionBD();
        //Preparo el String de consulta
        
        try
        {
            String SQL = "SELECT * FROM productos;";
            //Ejecuto la consulta y guardo el resultado en miconsulta
            ResultSet miconsulta = miconexion.consultarBD(SQL);
            //Declaro la variable que contiene el objeto
            Producto miproducto;
            //Recorro todo el Resulset con el metodo next
            while(miconsulta.next())
            {
                miproducto = new Producto();
                miproducto.setId(miconsulta.getString("Id"));
                miproducto.setNombre(miconsulta.getString("Nombre"));
                miproducto.setTemperatura(miconsulta.getDouble("Temperatura"));
                miproducto.setValorBase(miconsulta.getDouble("valorbase"));
                milistaproductos.add(miproducto);
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
        return milistaproductos;
    }
    //METODO PARA GRABAR CLIENTES
    public boolean guardarProducto()
    {
        //Me conecto a la base de datos
        ConexionBD miconexion = new ConexionBD();
        //Creo el script SQL para la transacción
        String SQL = "INSERT INTO productos(id,nombre,temperatura,valorbase) VALUES('"+this.id+"','"+this.nombre+"','"+this.temperatura+"','"+this.valorBase+"');";
        
        if(miconexion.setAutoCommitBD(false)==true)
        {
            if(miconexion.insertarBD(SQL)==true)
            {
                miconexion.commitBD(); //Ejecuta el cambio preparado en el script
                miconexion.cerrarConexion();
                return(true);
            }
            else
            {
                miconexion.rollbackBD(); //Deshacer el cambio que se habia preparado
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
    //METODO PARA ACTUALIZAR CLIENTES
    public boolean actualizarProducto()
    {
        //Me conecto a la base de datos
        ConexionBD miconexion = new ConexionBD();
        //Creo el script SQL para la transacción
        String SQL = "UPDATE productos SET nombre='"+this.nombre+"', temperatura='"+this.temperatura+"', valorbase='" +this.valorBase +"' WHERE id='"+this.id+"';";
        if(miconexion.setAutoCommitBD(false)==true)
        {
            if(miconexion.actualizarBD(SQL)==true)
            {
                miconexion.commitBD(); //Ejecuta el cambio preparado en el script
                miconexion.cerrarConexion();
                return(true);
            }
            else
            {
                miconexion.rollbackBD(); //Deshacer el cambio que se habia preparado
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
    //METODO PARA BORRAR CLIENTES
    public boolean borrarProducto()
    {
        //Me conecto a la base de datos
        ConexionBD miconexion = new ConexionBD();
        //Creo el script SQL para la transacción
        String SQL = "DELETE FROM productos WHERE id="+this.id+";";
        if(miconexion.setAutoCommitBD(false)==true)
        {
            if(miconexion.borrarBD(SQL)==true)
            {
                miconexion.commitBD(); //Ejecuta el cambio preparado en el script
                miconexion.cerrarConexion();
                return(true);
            }
            else
            {
                miconexion.rollbackBD(); //Deshacer el cambio que se habia preparado
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
