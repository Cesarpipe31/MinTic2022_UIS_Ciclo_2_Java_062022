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
    public Producto(String nombre, String id, double temperatura,double valorBase){
        this.nombre=nombre;
        this.id=id;
        this.temperatura=temperatura;
        this.valorBase=valorBase;}
    public Producto(){
    }
    public String getNombre(){
        return(this.nombre);}
    public void setNombre(String nombre){
        this.nombre=nombre;}
    public String getId(){
        return(this.id);}
    public void setId(String id){
        this.id=id;}
    public double getTemperatura(){
        return(this.temperatura);}
    public void setTemperatura(double temperatura){
        this.temperatura=temperatura;}
    public double getValorBase(){
        return(this.valorBase);}
    public void setValorBase(double valorBase){
        this.valorBase=valorBase;}
    
    @Override
    public String toString(){
         return this.getClass().getName() + "{" + "nombre=" + this.nombre + ", id=" + this.id + ", temperatura=" + this.temperatura + ", valorBase=" + this.valorBase + '}';
    }
    public List<Producto> listarProductos(){
        List<Producto> milistaproductos = new ArrayList<>();
        ConexionBD miconexion = new ConexionBD();
        String SQL = "SELECT * FROM producto;";
        try{ 
            ResultSet miconsulta = miconexion.consultarBD(SQL);
            Producto miproducto;
            while(miconsulta.next()){
                miproducto = new Producto();
                miproducto.setNombre(miconsulta.getString("nombre"));
                miproducto.setId(miconsulta.getString("id"));
                miproducto.setTemperatura(miconsulta.getDouble("temperatura"));
                miproducto.setValorBase(miconsulta.getDouble("valorbase"));
                milistaproductos.add(miproducto);
            }
        }
        catch(SQLException ex){
            System.out.println("Error al listar productos:" + ex.getMessage());
        }
        finally{
            miconexion.cerrarConexion();
        }
        return milistaproductos;
    }
    public boolean guardarProducto()
    {
       
        ConexionBD miconexion = new ConexionBD();
        
        String SQL = "INSERT INTO producto(id,nombre,temperatura,valorbase) VALUES('"+this.id+"','"+this.nombre+"','"+this.temperatura+"','"+this.valorBase+"');";
        if(miconexion.setAutoCommitBD(false)==true){
            if(miconexion.insertarBD(SQL)==true){
                miconexion.commitBD(); 
                miconexion.cerrarConexion();
                return(true);
            }
            else{
                miconexion.rollbackBD(); 
                miconexion.cerrarConexion();
                return(false);
            }
        }
        else{
            miconexion.cerrarConexion();
            return(false);  
        }
    } 
    public boolean actualizarProducto(){
        
        ConexionBD miconexion = new ConexionBD();
        
        String SQL = "UPDATE producto SET nombre='"+this.nombre+"', temperatura='"+this.temperatura+"', valorbase='" +this.valorBase +"' WHERE id='"+this.id+"';";
        
        if(miconexion.setAutoCommitBD(false)==true){
            if(miconexion.actualizarBD(SQL)==true){
                miconexion.commitBD(); 
                miconexion.cerrarConexion();
                return(true);
            }
            else{
                miconexion.rollbackBD(); 
                miconexion.cerrarConexion();
                return(false);
            }
        }
        else{
            miconexion.cerrarConexion();
            return(false);  
        }
    }
    public boolean borrarProducto(){
       
        ConexionBD miconexion = new ConexionBD();
        String SQL = "DELETE FROM producto WHERE id="+this.id+";";
        if(miconexion.setAutoCommitBD(false)==true){
            if(miconexion.borrarBD(SQL)==true){
                miconexion.commitBD(); 
                miconexion.cerrarConexion();
                return(true);
            }
            else{
                miconexion.rollbackBD(); 
                miconexion.cerrarConexion();
                return(false);
            }
        }
        else{
            miconexion.cerrarConexion();
            return(false);  
        }
    }  
}
    


