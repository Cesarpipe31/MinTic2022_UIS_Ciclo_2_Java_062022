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
        
/*
        Scanner leer = new Scanner(System.in);
        int numero;

        String palabra;
        System.out.print("Escriba un número: ");
        numero = leer.nextInt();
        System.out.println("El número es: ");
        palabra = leer.next();
        
        System.out.println("El númerpo es: " + numero + " y la palabra es: " + palabra);
       
//  Bucle if
        
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
*/

//  Bucle for

/*)
        
        int numero;
        for (numero = 1; numero <= 10; numero = numero + 1)
        {
            System.out.println ("Imprimiendo número con for " + numero);
        }
    }
}

*/

/*        
//  Bucle while
        
    int numero;
    numero = 1;
    while (numero <= 10)
    {
        System.out.println("Imprimiento con while numero " + numero);
        numero = numero + 2;
    }
*/

/*        
//  Bucle do while
    
        int numero;
        numero = 1;
        do
        {
            System.out.println("Imprimiento con do while numero " + numero);
            numero = numero + 7;
        }
        while (numero <= 30);
*/
        
//  Bucle Estructura Condicional de Selección
        
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.print("Escriba un número: ");
        numero = leer.nextInt();
        
        switch (numero)
        {
            case 1: System.out.println("Seleccionó la opción 1");
                    break;
            case 2: System.out.println("Seleccionó la opción 2");
                    break;
            case 3: System.out.println("Seleccionó la opción 3");
                    break;
            default: System.out.println("No seleccionó una opción válida");
                    break;                    
        }
    }
}