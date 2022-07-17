package ja_013_reto3;

public class ProductoRefrigerado extends Producto{

    public ProductoRefrigerado(String nombre, String id, double temperatura, double valorBase) {
        super(nombre, id, temperatura, valorBase);
    }  
   
    public double calcularCostoDeAlmacenamiento(){
        return getValorBase()*1.2;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado:"+"Nombre:"+getNombre()+" id:"+getId()+" Temperatura:"+getTemperatura()+"Costo:"+calcularCostoDeAlmacenamiento();
    }
}
