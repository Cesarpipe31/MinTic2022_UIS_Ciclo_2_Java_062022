package ja_028_supermercado_futuro;

public class Producto {
    private int id;
    private String nombre;
    private int cantidad;
    private String categoria;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, String categoria, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public boolean guardarProducto(){
        Conexion conexion = new Conexion();
        String Sentencia = "INSERT INTO productos(nombre, cantidad, categoria, precio) " + " VALUES ('" + this.nombre + "'," + this.cantidad + ",'" + this.categoria + "'," + this.precio + ");";
            if(conexion.setAutoCommitBD(false)){
                if (conexion.insertarBD(Sentencia)){
                    conexion.commitBD();
        conexion.cerrarConexion();
            return true;
                } else {
                    conexion.rollbackBD();
                    conexion.cerrarConexion(); 
                    return false;
                }
                } else{
                conexion.cerrarConexion();
                return false;
            }
            }
        
    public boolean actualizarProducto (int id){
        Conexion conexion = new ConexionBD();
        String Sentencia = "UPDATE `productos` SET nombre= '" + this.nombre + "',cantidad='" + this.cantidad + "',categoria = '" + this.categoria + "',precio=" +this.precio + "WHERE id=" + id + ";";
            if(conexion.setAutoCommitBD(false)){
                if(conexion.actualizarBD(Sentencia)){
                    conexion.commitBD();
                    conexion.cerrarConexion(); 
                    return true;
                }else{
                    conexion.rollbackebed();
                    conexion.cerrarConexion();
                    return false;
                }                   
            }else {
                conexion.cerrarConexion();
                return false;
            }        
    }
    
    public boolean borrarProducto(int id){
        String Sentencia ="DELETE FROM `productos` WHERE `id`='" + id + "'";
        Conexion conexion = new Conexion();
        if (conexion.setAutoCommitBD(false)){
            if (conexion.actualizarBD(Sentencia)){
            conexion.commitBD();
            conexion.cerrarConexion();
            return true;            
        } else {
            conexion.rollbackBD();
            conexion.cerrarConexion();
            return false;
        }
    } else {
    conexion.cerrarConexion();
    return false;
}
    
}
    public Producto getProducto(int id){
        Conexion conexion = new ConexionBD();
        String sql = "SELECT * from productos where id=" + id + "";
        ResultSet rs = conexion.consultarBD(sql);
        try{
            if (rs.next()){
                this.id = rs.getInt("id");
                this.nombre = rs.getString("nombre");
                this.categoria = rs.getString("categoria");
                this.cantidad = rs.getInt("cantidad");
                this.precio = rs.getDouble("precio");
                conexion.cerrarConexion();
            } else {
                conexion.cerrarConexion();
                return null;
            }
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return this;
    }
    
    public List<Producto> listarProductos() throws SQLException{
        Conexion conexion = new ConexionBD();
        List<Producto> listaProductos = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        ResultSet rs = conexion.consultarBD(sql);
        Producto p;
        while (rs.next()){
            p = new Producto();
            p.setId(rs.getInt("id"));
            p.setNombre(rs.getString("nombre"));
            p.setCategoria(rs.getString("categoria"));
            p.setCantidad(rs.getInt("Cantidad"));
            p.setPrecio(rs.getDouble("precio"));
            listaProductos.add(p);
        }
        conexion.cerrar.Conexion();
        return listaProductos;        
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", categoria=" + categoria + ", precio=" + precio + '}';
    }
    
    
    
}
