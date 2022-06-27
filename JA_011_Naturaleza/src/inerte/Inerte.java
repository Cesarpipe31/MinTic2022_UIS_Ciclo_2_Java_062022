package inerte;

import vida.SeresVivos;
import vida.Animal;

public class Inerte
{
    String nombre;
    boolean proviene_espacio;
  
    public static void prueba()
    {
        
        SeresVivos prueba = new SeresVivos();
        //SI EL ATRIBUTO PROTEGIDO nombre o color NO APARECEN AQUI    
        prueba.nombre="Pedro";
        prueba.color="Rojo";
   
    }    

}
