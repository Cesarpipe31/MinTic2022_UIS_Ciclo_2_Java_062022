package proyectoreto5.pkg2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO {
    private String url;
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    public ProductoDAO(){
        url = "DataBase.db";
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:"+url);
            if(con != null){
                System.out.println("Se ha conectado a la base de datos.");
            }
        } catch (Exception e) {
            System.out.println("No se ha conectado a la base de datos.");
        }
    }
    
    public List<Producto> listarProducto(){
        List<Producto> datos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM productos;");
            rs = stmt.executeQuery();
            while(rs.next()){
                Producto p = new Producto(rs.getString("id"),rs.getString("nombre"),rs.getDouble("temperatura"),rs.getDouble("valorBase"));
                datos.add(p);
            }
        } catch (Exception e) {
            System.out.println("No se han descargado los datos.");
            return null;
        }
        return datos;
    }
    
    public boolean guardarProducto(Producto p){
        try {
            stmt = con.prepareStatement("INSERT INTO productos(nombre,temperatura,valorBase) VALUES (?,?,?);");
            stmt.setString(1, p.getId());
            stmt.setString(2, p.getNombre());
            stmt.setDouble(3, p.getTemperatura());
            stmt.setDouble(4, p.getValorBase());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("No se ha podido hacer el insert.");
            return false;
        }
        return true;
    }
    
    public boolean eliminarProducto(String id){
        try {
            stmt = con.prepareStatement("DELETE FROM productos WHERE id = ?;");
            stmt.setString(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el producto.");
            return false;
        }
        return true;
    }
    
    public boolean actualizarProducto(Producto p){
        try {
            stmt = con.prepareStatement("UPDATE productos SET nombre = ?, temperatura = ?, valorBase = ? WHERE id = ?;");
            stmt.setString(1, p.getNombre());
            stmt.setDouble(2, p.getTemperatura());
            stmt.setDouble(3, p.getValorBase());
            stmt.setString(4, p.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("No se pudo actulziar el producto.");
            return false;
        }
        return true;
    }
    
    public Producto consultarProducto(String id){
        Producto producto;
        try { 
            stmt = con.prepareStatement("SELECT * FROM productos WHERE id = ?;");
            stmt.setString(1, id);
            rs = stmt.executeQuery();
            producto = new Producto(rs.getString("id"),rs.getString("nombre"),rs.getDouble("temperatura"),rs.getDouble("valorBase"));
        } catch (Exception e) {
            System.out.println("No se ha encontrado el producto.");
            return null;
        }
        return producto;
    }
    
}
