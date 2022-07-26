
package proyectoreto5.pkg2;

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

    public Producto() {
    }

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
    
    public double calcularCostoAlmacenamiento(){
        if(temperatura > 25){
            return valorBase*1.1;
        }else{
            return valorBase*1.2;
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", temperatura=" + temperatura + ", valorBase=" + valorBase + '}';
    }

    
}
