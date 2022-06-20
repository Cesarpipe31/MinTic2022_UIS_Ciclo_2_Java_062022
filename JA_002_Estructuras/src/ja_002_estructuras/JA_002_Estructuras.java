/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ja_002_estructuras;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class JA_002_Estructuras 
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        String palabra;
        System.out.print("Escriba un número: ");
        numero = leer.nextInt();
        System.out.println("El número es: ");
        palabra = leer.next();
        
        System.out.println("El númerpo es: " + numero + " y la palabra es: " + palabra);
        
        if(numero > 100)
        {
            System.out.println("El número es mayor que 100");
        }
        else if (numero == 100)
        {
            System.out.println("El número es igual a 100");          
        }
        else
        {
            System.out.println ("El número es menor que 100");
        }
    }
}
