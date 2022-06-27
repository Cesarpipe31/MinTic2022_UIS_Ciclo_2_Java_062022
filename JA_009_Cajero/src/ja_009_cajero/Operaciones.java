package ja_009_cajero;

import java.util.Scanner;

public class Operaciones 
{
    public float saldo = 100000;
    
    public float consultar(float saldo)
    {
        System.out.println("El Saldo actual es " + this.saldo);
        return this.saldo;
    }
    public static float sumar(float numero1, float numero2)
    {
        float respuesta;
        respuesta = numero1 + numero2;
        //System.out.println("La suma de " + numero1 + " más " + numero2 + " es igual a: " + respuesta);
        return respuesta;             
    }
    
    public static float restar(float numero1, float numero2)
    {
        float respuesta;
        respuesta = numero1 - numero2;
        //System.out.println("La resta de " + numero1 + " menos " + numero2 + " es igual a: " + respuesta);
        return respuesta;
    }
    
    public static float multiplicar(float numero1, float numero2)
    {
        float respuesta;
        respuesta = numero1 * numero2;        
        //System.out.println("La multiplicación de " + numero1 + " por " + numero2 + " es igual a: " + respuesta);
        return respuesta;        
    }
    
    public static float dividir(float numero1, float numero2)
    {
        float respuesta;
        if(numero2 != 0)
        {
            respuesta = numero1 / numero2;
            //System.out.println("La división de " + numero1 + " entre " + numero2 + "es igual a: " + respuesta);            
        }
        else
        {
            respuesta = 0;
            //System.out.println("La división por cero no existe!");
        }
        return respuesta;
    }
    
    
    public static void menu()
    {
        int numero;
        do
        {
            Scanner leernumero = new Scanner (System.in);
            
            System.out.println("*** MENÚ ***");
            System.out.println("Escriba una opción: ");
            System.out.println("1.  Consultar Saldo");
            System.out.println("2.  Retirar dinero");
            System.out.println("3.  Consignar");
            System.out.println("4.  Salir");
            numero = leernumero.nextInt();
            switch(numero)
                   {
                       case 1:  System.out.println("Selecciono la opción 1");
                                break;
                       case 2:  System.out.println("Selecciono la opción 2");
                                break;
                       case 3:  System.out.println("Selecciono la opción 3");
                                break;
                       case 4:  break;
                       default: System.out.println("No se seleccionó una opción válida");
                                break;
                   }            
        }
        while(numero!=4);           
    }    
}
