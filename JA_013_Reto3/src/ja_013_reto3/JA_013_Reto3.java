package ja_013_reto3;

public class JA_013_Reto3{

  
    public static void main(String[] args) {

        Farmacia farmacia1 = new Farmacia("934567-4", "Farmacia la Rebaja", "Crea 23#12-45");

        Almacen almacen1 = new Almacen("2315", "Almacen la esquina");
        Almacen almacen2 = new Almacen("4568", "Almacen el centro");

        farmacia1.agregarAlmacen(almacen1);
        farmacia1.agregarAlmacen(almacen2);

        Producto p1 = new Producto("Suero", "14589", 25, 1500);
        Producto p2 = new Producto("Antibiotico en pastilla", "57896", 30, 1000);
        Producto p3 = new Producto("Vacunas", "32658", 10, 2000);

        farmacia1.agregarProducto("2315", p1);
        farmacia1.agregarProducto("2315", p2);
        farmacia1.agregarProducto("4568", p3);
        
        System.out.println(farmacia1);
        
    }

}
