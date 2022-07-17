package ja_020_maquinadecafe;

public class JA_020_MaquinaDeCafe {
        public int nivelDeCafe;
        public int valorDeLaOnza;
        public int dineroActual;
        public int dineroRecibido;
        public int cantidadDeOnzasAVender;
        
        public JA_020_MaquinaDeCafe(){
            nivelDeCafe = 1000;
            dineroActual = 20000;
            valorDeLaOnza = 100;
        }
        
        public int calcularCambio(){
            return dineroRecibido - precioDeVenta();
        }
        
        public int precioDeVenta(){
            return valorDeLaOnza * cantidadDeOnzasAVender;
        }
        
        public void recibirDinero(int dinero){
            dineroRecibido += dinero;
        }
        
        public void recibirCantidadDeOnzas(int cantidad){
            cantidadDeOnzasAVender += cantidad;
        }
        
        public void cerrarVenta(){
            nivelDeCafe -= cantidadDeOnzasAVender;
            dineroActual += precioDeVenta();
            cantidadDeOnzasAVender = 0;
            dineroRecibido = 0;
        }
        
    }
    

