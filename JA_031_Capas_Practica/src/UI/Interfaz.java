package UI;

import Data.Contacto;
import ja_031_capas_practica.JA_031_Capas_Practica;
import java.util.Scanner;

public class Interfaz {
    
    static Scanner entrada = new Scanner(System.in);
    static JA_031_Capas_Practica libro = new JA_031_Capas_Practica();
    
    
    
    public static void lectura(){
        System.out.println("Bienvenido");        
        // Por implementar
        imprimirMenu();        
    }
    
    private static void validad(){
        System.out.println("Ingresar un nuevo contacto");
        System.out.println("Por favor, ingrese la información del contacto ");
        System.out.println("El nombre debe contener entre 3 y 10 caracteres");
        System.out.println("y el número celular debe contener exactamente");
        System.out.println("10 números");
        Contacto contacto = new Contacto();
        System.out.println("Nombre: ");
        contacto.setNombre(entrada.next());
        System.out.println("Teléfono móvil");
        contacto.setCelular(entrada.nextLong());
        if(libro.add(contacto) == true){
            System.out.println("Su contacto ha sido agregado");
        } else {
            System.out.println("Error en el ingreso de los datos.");
            System.out.println("Si desea agregar nuevamente un contacto");
            System.out.println("Seleccione la opción 1.");
        }
        imprimirMenu();
    }
    
    private static void mostrarContactos(){
        System.out.println(libro);
        imprimirMenu();
    }
    
    private static void salir(){
        System.out.println("Usted ha finalizado la ejecucción");
        System.out.println("del programa");
        System.exit(0);
    }
    
    private static void imprimirMenu(){
        System.out.println();
        System.out.println("Por favor, escoja una de las siguientes opciones");
        System.out.println("Paraacceder a la opción, escriba el´número correspondiente");
        System.out.println("1. Ingresar un nuevo contacto");
        System.out.println("2. Mostrar contactos");
        System.out.println("3. Salir del Programa");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1: validad(); break;
            case 2: mostrarContactos(); break;
            case 3: salir(); break;
            default: System.out.println("Opción Invalida");break;
        }
    }
}
