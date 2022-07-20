package com.ditamex.main;

import java.util.ArrayList;

public class ArrayListTest
{
    /*
     * Revisar la documentación de la clase ArrayList
     * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
     */
    
    public static void main(String[] args){
        
        // Crear una instancia de ArrayList con "cero" elementos
        ArrayList colores = new ArrayList();
        
               
        // Se agregar valores iniciales al vector
        colores.add("Rojo");
        colores.add("Blanco");
        colores.add("Amarillo");
        colores.add("Negro");
        colores.add("Azul");
        
        // Imprimir el contenido del vector
        System.out.println("Colores :" + colores);
        
        colores.add("Rosa");
        
        System.out.println("Colores :" + colores);
        
        colores.set(3, "Verde");
        
        System.out.println("Colores :" + colores);
        
        colores.remove(1);
        System.out.println("Colores :" + colores);
        
        String color = (String) colores.get(4);
        System.out.println("Colores :" + colores);
        System.out.println("Color :" + color);
        
        
    }
   
    
}
