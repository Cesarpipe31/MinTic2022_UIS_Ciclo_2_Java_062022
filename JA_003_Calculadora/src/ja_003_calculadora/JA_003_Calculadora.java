package ja_003_calculadora;

import java.util.Scanner;

public class JA_003_Calculadora 
{
    public static void main(String[] args)
    {
        int numero;
        Scanner leernumero = new Scanner(System.in);
        float numero1;
        float numero2;

        System.out.print("Escriba el numero 1: ");
        numero1 = leernumero.nextFloat();
        
        System.out.print("Escriba el numero 2: ");
        numero2 = leernumero.nextFloat();
        
        sumar(numero1, numero2);
        restar(numero1, numero2);
                
    }
    
    public static float sumar(float numero1, float numero2) 
    {
        float respuesta;
        respuesta = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " MÁS " + numero2 + " es igual a " + respuesta);
        return respuesta;
    }   
    
    public static float restar(float numero1, float numero2)
    {
        float respuesta;
        respuesta = numero1 - numero2;
        System.out.println("La resta de " + numero1 + " MENOS " + numero2 + " es igual a " + respuesta);
        return respuesta;
    }
}
