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
        
        /*
        sumar(numero1, numero2);
        restar(numero1, numero2);
        multiplicar(numero1, numero2);
        dividir(numero1, numero2);
        */
        
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        numero = leernumero.nextInt();
        switch(numero)
                {
                    case 1: sumar(numero1, numero2);
                            break;
                    case 2: restar(numero1, numero2);
                            break;
                    case 3: multiplicar(numero1, numero2);
                            break;
                    case 4: dividir(numero1, numero2);
                            break;
                    default: System.out.println("no seleccionó una opción válidad");
                            break;
                }
        
                
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
    
    public static float multiplicar(float numero1, float numero2)
    {
        float respuesta;
        respuesta = numero1 * numero2;
        System.out.println("La multiplicación de " + numero1 + "  P O R  " + numero2 + " es igual a " + respuesta);
        return respuesta;
    }
    
    public static float dividir (float numero1, float numero2)
    {
        float respuesta;
        
        if(numero2 != 0)
        {
            respuesta = numero1 / numero2;
            System.out.println ("La división de " + numero1 + " DIVIDIDO " + numero2 + " es igual a " + respuesta);            
        }
        else
        {
            respuesta = 0;
            System.out.println("La división por cero no existe!");
        }
        return respuesta;
}       
}