package ja_010_vida;

//CLASE PRINCIPAL
public class JA_010_Vida
{
   
    //CONSTRUCTOR -> FUNCION O METODO INICIAL
    public static void main(String[] args)
    {
       
        //INSTANCIAR UNA CLASE - CREAR OBJETO
        Humano persona1 = new Humano();
        Humano persona2 = new Humano();
       
        persona1.asignarNombre("Juan Carlos");
        System.out.println(persona1.verNombre());
        
        //ATRIBUTOS PERSONA 1
        //persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.cedula = 1053562356;
        persona1.edad = 29;       
        persona1.altura = 1.80f;
        persona1.tiposangre = "O+";
        persona1.discapacidad = false;  
        
        //ATRIBUTOS PERSONA 2        
        persona2.nombre = "Maria";
        persona2.apellido = "Rojas";
        persona2.cedula = 1098254456;
        persona2.edad = 23;       
        persona2.altura = 170;
        persona2.tiposangre = "A-";
        persona2.discapacidad = true;         
        
        //METODOS USADOS POR LOS OBJETOS
        persona1.caminar(5, "norte");
        persona1.comer("hamburguesas", 2);
        Humano.respirar(true);
        
        Humano.limpiarPantalla();
        
        persona2.caminar(6, "oriente");
        persona2.comer("manzanas", 5);       
        Humano.respirar(false);       
        
               
        
   }
    
}
