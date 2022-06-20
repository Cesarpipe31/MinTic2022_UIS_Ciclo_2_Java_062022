package ja_003_calculadora;

import java.util.Scanner;

public class JA_003_Calculadora 
{
    public static void main(String[] args)
    {
        int numero;
        Scanner leernumero = new Scanner(System.in);
        sumar(4,5);
    }
    
    public static float sumar(float numero1, float numero2) 
    {
        float respuesta;
        respuesta = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + respuesta);
        return respuesta;
    }   
}
