package ja_001_prueba;

import java.util.Scanner;

public class JA_001_Prueba 
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Hola Mundo \t tabulacion \n");
        System.out.println("Hola Pepe \t tabulacion \n");
        System.out.println("Hola César \t tabulacion \n");
        int numero;
        float decimal;
        boolean verdaderofalso;
        String texto;
        
        numero = 12345;
        texto = "Mision Tic 2022";
        
        System.out.println("El número es: " + numero + " y el texto es: " + texto);
        
        System.out.println("Escrita un numero: ");
        numero = leer.nextInt();
        
        System.out.println("Escrita un texto: ");
        texto = leer.next();
        
        System.out.println("Nuevo Numero " + numero + " el nuevo texto es " + texto);
    }
}
