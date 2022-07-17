package humano;

public class Main
{

    public static void main(String[] args)
    {
        //ESTANDAR PARA INSTANCIAR OBJETOS
        Deportista juan = new Deportista("Juan");
        Empleado pedro = new Empleado("Oracle", 9000000, "Desarrollador", false);
        Estudiante carlos = new Estudiante();
        Medico cesar = new Medico();
        Militar luis = new Militar();
        
        //POLIMORFISMO: LAS MULTIPLES FORMAS QUE PUEDE TOMAR UN OBJETO
        Persona maria = new Deportista("Maria");
        Persona ruben = new Empleado("Microsoft", 10000000, "Auditor", false);
        Persona sergio = new Estudiante();
        Persona alfredo = new Medico();
        Persona sandra = new Militar();       
        
        maria.correr();
        alfredo.correr();
        
        juan.nombre="Juan";
        juan.telefono="3165280654";
        juan.setEquipo("Colombia");
        juan.correr();
        System.out.println(juan.getEquipo());
        
        maria.telefono = "3207544778";
        //juan.setEquipo("Colombia");
        maria.correr();
        System.out.println(maria.verInfo());
  
        Persona misPersonas[] = new Persona[5];
        misPersonas[0] = new Deportista("Carlos");
        misPersonas[1] = new Empleado("MinTIC", 25000000, "Ministro", true);
        misPersonas[2] = new Estudiante();
        misPersonas[3] = new Medico();
        misPersonas[4] = new Militar();

        misPersonas[0].correr();
        misPersonas[1].correr();
        misPersonas[2].correr();       
        misPersonas[3].correr();       
        misPersonas[4].correr();       
  
        for(Persona personas: misPersonas)
        {
            System.out.println(personas.verInfo());
        }

        
        
        Empleado francisco = new Empleado("UIS", 2000000, "Gerente", false);
        System.out.println(francisco.CalcularSueldo());
        
    }

    
}
