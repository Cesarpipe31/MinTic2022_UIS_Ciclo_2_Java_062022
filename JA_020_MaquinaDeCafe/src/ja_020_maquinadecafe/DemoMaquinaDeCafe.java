package ja_020_maquinadecafe;

public class DemoMaquinaDeCafe {
    
    public static void main(String[] args){
        JA_020_MaquinaDeCafe m1 = new JA_020_MaquinaDeCafe();
        while (m1.nivelDeCafe>0){
            m1.recibirDinero(2000);
            m1.recibirCantidadDeOnzas(10);
            System.out.println("*************");
            System.out.println("Su cambio es: " +m1.calcularCambio());
            System.out.println("El valor del café es de : " + m1.precioDeVenta());
            m1.cerrarVenta();
            System.out.println("Nivel de cafe actual: " + m1.nivelDeCafe);
            System.out.println("Dinero actual: " + m1.dineroActual);
        }
    }    
}
