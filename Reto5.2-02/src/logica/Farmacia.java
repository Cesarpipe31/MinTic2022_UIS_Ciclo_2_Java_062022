package logica;

import persistencia.ConexionBD;

public class Farmacia {

   
    public static void main(String[] args) {
        Producto productos = new Producto();
       for (Producto miproducto :productos.listarProductos())
       {
           System.out.println(miproducto);
       }
    }
    
}
