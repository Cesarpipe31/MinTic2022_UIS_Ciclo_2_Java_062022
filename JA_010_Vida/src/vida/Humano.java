package ja_010_vida;

public class Humano
{
    //ATRIBUTOS
    public int cedula;    
    public String nombre;
    public String apellido;   
    public int edad;     
    public float altura;        
    public String tiposangre;
    public boolean discapacidad;
    
    //METODOS
    public void caminar(int distancia, String direccion)
    {
        System.out.println(nombre + " camina " + distancia + " kilometros en direccion " + direccion);
    }
    
    public void comer(String tipocomida, int cantidaddecomida)
    {
        System.out.println(nombre + " esta comiendo " + cantidaddecomida + " " + tipocomida);
    }
    
    public static void respirar(boolean respira)
    {
        if(respira==true)
        {
            System.out.println("Esta vivo");
        }
        else
        {
            System.out.println("Falleció");
        }
    }
 
    public void asignarNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String verNombre()
    {
        return nombre;
    }
    
    public static void limpiarPantalla()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println();
        }
    }

    
}
