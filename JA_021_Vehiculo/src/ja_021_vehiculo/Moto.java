package ja_021_vehiculo;

public class Moto extends Vehiculo {
    private int cilindraje;
    
    public Moto(int cilindraje, String placa){
        super(placa)
        this.cilindraje = cilindraje;
     }
    
     public int calcularImpuesto{
        if(this.cilindraje > 150){
            return 90000;
        } else
        {
            return 45000;
        }
}

