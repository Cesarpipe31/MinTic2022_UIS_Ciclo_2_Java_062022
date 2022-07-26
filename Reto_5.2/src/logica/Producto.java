package logica;
//JESUS//
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import persistencia.ConexionBD;

public class Producto{
    private String nombre;
    private String id;
    private double temperatura;
    private double valorBase;
    
    public Producto(String nombre,String id,double temperatura,double valorBase){
        this.nombre=nombre;
        this.id=id;
        this.temperatura=temperatura;
        this.valorBase=valorBase;
    }
    public Producto(){
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

    @Override
    public String toString() {
        return this.getClass().getName() + "{" + "id=" + id + ", nombre=" + nombre + ", temperatura=" + temperatura + ", valorBase=" + valorBase + '}';
    }
    public List<Producto> consultarProducto(){
        List<Producto> listProducto = new ArrayList<>();
        ConexionBD miconexion = new ConexionBD();
        try{
            String SQL = "SELECT * FROM producto";
            ResultSet miconsulta = miconexion.consultarBD(SQL);
            Producto oneproduct;
            while(miconsulta.next()){
                oneproduct = new Producto();
                oneproduct.setId(miconsulta.getString("Id"));
                oneproduct.setNombre(miconsulta.getString("Nombre"));
                oneproduct.setTemperatura(miconsulta.getDouble("Temperatura"));
                oneproduct.setValorBase(miconsulta.getDouble("valorBase"));
                listProducto.add(oneproduct);
            }
        }catch(SQLException ex){
            System.out.println("Error al listar productos:" + ex.getMessage());
        }finally{
            miconexion.cerrarConexion();
        }
        return (listProducto);
    }
    public boolean guardarProducto(){
        ConexionBD miconexion = new ConexionBD();
        String SQL = "INSERT INTO producto(id,nombre,temperatura,valorbase) VALUES('"+this.id+"','"+this.nombre+"','"+this.temperatura+"','"+this.valorBase+"');";
        if(miconexion.setAutoCommitBD(false)==true){
            if(miconexion.insertarBD(SQL)==true){
                miconexion.commitBD();
                miconexion.cerrarConexion();
                return(true);
            }else{
                miconexion.rollbackBD();
                miconexion.cerrarConexion();
                return(false);
            }
        }else{
            miconexion.cerrarConexion();
            return(false);  
        }
    }
    public boolean actualizarProducto(){
        ConexionBD miconexion = new ConexionBD();
        String SQL = "UPDATE producto SET nombre='"+this.nombre+"', temperatura='"+this.temperatura+"', valorBase='"+this.valorBase+"' WHERE id='"+this.id+"';";
        if(miconexion.setAutoCommitBD(false)==true)
        {
            if(miconexion.actualizarBD(SQL)==true){
                miconexion.commitBD(); 
                miconexion.cerrarConexion();
                return(true);
            }else{
                miconexion.rollbackBD();
                miconexion.cerrarConexion();
                return(false);
            }
        }else{
            miconexion.cerrarConexion();
            return(false);  
        }
    }
    public boolean borrarCliente(){
        ConexionBD miconexion = new ConexionBD();
        String SQL = "DELETE FROM producto WHERE id='"+this.id+"';";
        if(miconexion.setAutoCommitBD(false)==true){
            if(miconexion.borrarBD(SQL)==true){
                miconexion.commitBD(); 
                miconexion.cerrarConexion();
                return(true);
            }else{
                miconexion.rollbackBD();
                miconexion.cerrarConexion();
                return(false);
            }
        }else{
            miconexion.cerrarConexion();
            return(false);  
        }
    }
}
