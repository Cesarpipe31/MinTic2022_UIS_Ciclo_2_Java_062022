package ja_018_funcion;

public class JA_018_Funcion {    
    public static void main(String[] args) {
     int retornoSuma = 0;
     retornoSuma = JA_018_Funcion.suma(5,8);
     System.out.println(retornoSuma);
    }
    
    public static int suma(int numero1, int numero2){
        int resultado;
        resultado = numero1 + numero2;
        return resultado;        
    }
    
}
