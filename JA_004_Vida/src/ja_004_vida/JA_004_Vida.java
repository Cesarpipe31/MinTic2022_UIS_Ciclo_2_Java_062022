package ja_004_vida;

// Clase Principal
public class JA_004_Vida 
{
    
    // Constructor que es la función o método inicial
    public static void main(String[] args)  
    {
        // Instanciar una clase
        
        Humano persona1 = new Humano();
        Humano persona2 = new Humano();
                
        // Atributos Persona 1
        persona1.nombre = "Juan";
        persona1.apellido = "Pérez";
        persona1.cedula = 105555555;
        persona1.edad = 29;
        persona1.altura = 180;
        persona1.tiposangre = "O+";
        persona1.discapacidad =  false;
        
        // Atributos Persona 2
        persona2.nombre = "María";
        persona2.apellido = "Rojas";
        persona2.cedula = 587889;
        persona2.edad = 49;
        persona2.altura = 176;
        persona2.tiposangre = "A+";
        persona2.discapacidad =  false;
        
        // Métodos usados por los objetos
        
        persona1.caminar(5, "Norte");
        persona1.comer("Hamburguesas", 2);
        Humano.respirar(true);
        persona1.estudiar("Ingenieria de Sistemas", 4);
        
        persona2.caminar(7, "Oriente");
        persona2.comer("Sancocho", 12);
        Humano.respirar(false);
        persona2.estudiar("Contaduria", 4);
     //Prueba para subir a github   
    }
}
