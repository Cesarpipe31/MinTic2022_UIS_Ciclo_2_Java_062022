package ja_004_vida;

public class Humano 
{
    // Atributos... variables de la clase
    public int cedula;
    public String nombre;
    public String apellido;
    public int edad;
    public float altura;
    public String tiposangre;
    public boolean discapacidad;    
    
    // Métodos o "Funciones"
    public void caminar(int distancia, String direccion)
    {
        System.out.println(nombre + " camina " + distancia + " kilomentros en dirección " + direccion);
    }
    
    public void comer(String tipocomida, int cantidaddecomida)
    {
        System.out.println(nombre + " está comiendo " + cantidaddecomida + " " + tipocomida);
    }
    
    public static void respirar(boolean respira)
    {
        if (respira==true)
        {
            System.out.println("Está vivo");
        }
        else
        {
            System.out.println("Fallecio");
        }            
    }     
}

