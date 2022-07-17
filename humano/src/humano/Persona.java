package humano;

//COMO ESTA REPRESENTADA ASI: <<Persona>> ES ABSTRACTA
public abstract class Persona
{
    
    public String nombre;
    private int edad;
    protected String telefono;
    //public date fechaNacimiento;
    
    public static String comer(String tipo)
    {
        return "a";
    }
 
    public static int dormir(String tipo)
    {
       return 0;
    }  
    
    public static void Persona(String[] args)
    {
       
    }
    
    //POLIMORFISMO
    //SI HAY UN METODO ABSTRACTO NO SE DEFINE EN LA CLASE PADRE, SOLO EN LAS HIJAS
    public abstract void correr();

    public String verInfo()
    {
        String informacion;
        informacion = "El nombre es: " + nombre + " el telefono es: " + telefono;
        return(informacion);
    }
    
}
