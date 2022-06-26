/*
Reto tema 1
Abrió: Monday, 13 de June de 2022, 00:00
Cierra: Sunday, 24 de July de 2022, 23:59
Hecho: Ver Por hacer: Recibir una calificación
Planteamiento de la situación

Dentro de las actividades de desarrollo de software de la 
compañía donde trabajas se utiliza tecnología Java, en 
uno de los proyectos surge la situación de agregar productos 
a un lote. El scrum master de tu equipo de desarrollo te 
asigna la incidencia para implementar una función que permita 
calcular el costo de almacenamiento dentro del módulo de 
productos.

Planteamiento del reto

Generar una función llamada 
calcularCostoAlmacenamiento(boolean refrigerado, float valorBase) 
que reciba dos parámetros, uno de tipo boolean que indica  
si un medicamento es refrigerado o no refrigerado y otro de 
tipo float que indique el valorBaseDeAlmacenamiento del 
medicamento y retorne un valor float con el precio de 
almacenamiento teniendo en cuenta lo siguiente: 

Condiciones

Si un medicamento  es refrigerado la variable booleana 
será true. 
Si un medicamento es refrigerado su costo de almacenamiento 
tendrá un 30% adicional al valor base, si no un costo 
adicional del 15%;
Tenga en cuenta el orden de los parámetros 

 Acciones de aprendizaje

Analizar la situación problema
Seleccionar el tipo estructura/s de control que permitirán 
dar solución a la situación planteada
*/

package ja_006_est_ctrl_reto_001;

import java.util.Scanner;

public class JA_006_Est_Ctrl_Reto_001 
{
    public static void main(String[] args)
    {
        //calcularCostoAlmacenamiento(true,1000f);
        //calcularCostoAlmacenamiento(false,1000f);
        
        boolean refrigerado;
        float valorBase;
        Scanner leer = new Scanner(System.in);
                   
        System.out.print("Escriba el valor base del producto: ");
        valorBase = leer.nextFloat();
        
        System.out.print("Está refrigerado? (true or false): ");
        refrigerado = leer.nextBoolean();
        
        calcularCostoAlmacenamiento(refrigerado, valorBase);
    }
        
    public static float calcularCostoAlmacenamiento(boolean refrigerado, float valorBase)
    {
        float costoAlmacenamiento;
        if (refrigerado == true)
            {
                costoAlmacenamiento = valorBase * 1.3f;
                System.out.println(costoAlmacenamiento);
            }
        else
            {
                costoAlmacenamiento = valorBase * 1.15f;
                System.out.println(costoAlmacenamiento);
            }
        return costoAlmacenamiento;   
    }    
}

/*
Respuesta publicada en la página de la UIS

public static float calcularCostoAlmacenamiento(boolean refrigerado, float valorBase)
    {
        float costoAlmacenamiento;
        if (refrigerado == true)
            {
                costoAlmacenamiento = valorBase * 1.3f;
            }
        else
            {
                costoAlmacenamiento = valorBase * 1.15f;                
            }
        return costoAlmacenamiento;   
    }    

*/