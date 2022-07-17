package academico;

public class Carrera
{
    private String nombre;
    private Pensum pensum;
            
    public Carrera(String nombre, Pensum pensum)
    {
        this.nombre=nombre;
        this.pensum=pensum;
    }
    public void verInfo()
    {
        System.out.println("Nombre: " + this.nombre);
    }
    public String getNombre()
    {
        System.out.println(this.nombre);
        return(this.nombre);
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
        System.out.println(this.nombre);
    }    
}
