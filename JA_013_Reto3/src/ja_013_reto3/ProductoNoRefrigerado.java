package ja_013_reto3;

public class ProductoNoRefrigerado extends Producto {

    public ProductoNoRefrigerado(String nombre, String id, double temperatura, double valorBase) {
        super(nombre, id, temperatura, valorBase);
    }

    public double calcularCostoDeAlmacenamiento(){
        return getValorBase()*1.1;
    }

    @Override
    public String toString() {
        return "ProductoNoRefrigerado:"+"Nombre:"+getNombre()+" id:"+getId()+" Temperatura:"+getTemperatura()+"Costo:"+calcularCostoDeAlmacenamiento();
    }
    
    
    
    
}
