package com.ditamex.main;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest
{
    /*
     * Revisar la documentación de la Clase Collections
     * https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html
     * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
     */
    
    public static void main(String[] args){
        
        ArrayList colores = new ArrayList();
        
        colores.add("Rojo");
        colores.add("Blanco");
        colores.add("Amarillo");
        colores.add("Negro");
        colores.add("Azul");
        
        System.out.println("-Desordenado-");
        for (int x = 0; x < colores.size(); x++) {
            System.out.println("Color: " + colores.get(x));            
        }
        
        Collections.sort(colores);
        
        System.out.println("- ORDENADO -");
        for (int x = 0; x < colores.size(); x++) {
            System.out.println("Color: " + colores.get(x));            
        }
        
        Collections.reverse(colores);
        System.out.println("- Reversa, Descendente -");
        for (int x = 0; x < colores.size(); x++) {
            System.out.println("Color: " + colores.get(x));            
        }
        
        Collections.shuffle(colores);
        System.out.println("- ORDEN ALEATORIO -");
        for (int x = 0; x < colores.size(); x++) {
            System.out.println("Color: " + colores.get(x));            
        }
        
        
        
        
        
        
    }
    
    
    
   }
