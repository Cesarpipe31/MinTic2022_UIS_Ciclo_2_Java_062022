
package Logica;
//importar 
import Persistencia.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Persistencia.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Producto {
    
    private String id;
    private String nombre;
    private double temperatura;
    private double valorBase;
 

    public Producto(String id, String nombre, double temperatura, double valorBase) {
        this.id = id;
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
        
    }
    
    public Producto(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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



    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", temperatura=" + temperatura + ", ValorBase=" + valorBase + '}';
    }
    // METODO PARA CONSULTAR PRODUCTOS
    public List<Producto> listarProducto (){
        //CONEXION A BD
        
        //CREO LISTA QUE CONTIENE OBJETOS
        List<Producto> listaProductos = new ArrayList<>();
        //EJECUCION DE CONSULTA Y RESULTADO
        ConexionBD miconexion = new ConexionBD();
        
        
        try {

            String consultaSQL = "SELECT * FROM Producto";
            ResultSet miconsulta = miconexion.consultarBD(consultaSQL);
            //Declaro la variable que contiene el objeto
            Producto miproducto;
            //RECORRO TODO EL RESULSET CON EL METODO NEXT()        
            while (miconsulta.next()){
                
                miproducto=new Producto();
                miproducto.setId(miconsulta.getString("id"));
                miproducto.setNombre(miconsulta.getString("nombre"));
                miproducto.setTemperatura(miconsulta.getDouble("temperatura"));
                miproducto.setValorBase(miconsulta.getDouble("valorBase"));
                listaProductos.add(miproducto);
            }
            
        }
        
        catch (SQLException ex)
        {
            System.out.println("Error listando los productos. " +  ex.getMessage());
        }
        finally {
            
            miconexion.cerrarConexion();            
        }
        return (listaProductos);
        }
    
    //METODO PARA GRABAR Productos
    public boolean guardarProducto(){
    
        //CONEXION A BD  
        ConexionBD miconexion = new ConexionBD();
        // CREO EL SCRIPT SQL PARA LA TRANSACCION
        String SQL = "INSERT INTO Producto(id,nombre,temperatura,valorBase) VALUES('"+this.id+"','"+this.nombre+"','"+this.temperatura+"','"+this.valorBase+"');"; 
                              
        if(miconexion.setAutoCommitBD(false)== true)
        {
                if(miconexion.insertarBD(SQL)== true)
                {
                    miconexion.commitBD();//Ejecuta el cambio preparado en el script
                    miconexion.cerrarConexion();
                    return (true);
                }
                else 
                {
                   miconexion.rollbackBD(); // DESHACER EL CAMBIO QUE SE HABIA PREPARADO
                   miconexion.cerrarConexion();
                   return (false);
                }
                
        }
        else 
        {
            miconexion.cerrarConexion();
            return (false);
        }
    }
     //METODO PARA ACTALIZAR PRODUCTOS
    public boolean actualizarProductos(){
        //CONEXION A BD  
        ConexionBD miconexion = new ConexionBD();
        // CREO EL SCRIPT SQL PARA LA TRANSACCION
                
        String SQL = "UPDATE Productos SET nombre='"+this.nombre+"', temperatura='"+this.temperatura+"', valorbase='" +this.valorBase +"' WHERE id='"+this.id+"';";
               
        if(miconexion.setAutoCommitBD(false)== true){
                if(miconexion.actualizarBD(SQL)== true){
                    miconexion.commitBD();//Ejecuta el cambio preparado en el script 
                    miconexion.cerrarConexion();
                    return (true);
                }
                else {
                   miconexion.rollbackBD(); // DESHACER EL CAMBIO QUE SE HABIA PREPARADO
                   miconexion.cerrarConexion();
                   return (false);
                      }
        
            }
        else {
            miconexion.cerrarConexion();
            return (false);
        }
    
}
    //METODO PARA BORRAR PRODUCTOS
    public boolean borrarProducto()
    {
        //Me conecto a la base de datos
        ConexionBD miconexion = new ConexionBD();
        //Creo el script SQL para la transacción
        String SQL = "DELETE FROM Producto WHERE id='"+this.id+"; "; 
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
