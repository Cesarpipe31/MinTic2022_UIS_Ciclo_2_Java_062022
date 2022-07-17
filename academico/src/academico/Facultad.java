package academico;

public class Facultad
{
    private String nombre;
    public Facultad(String nombre)
    {
        this.nombre=nombre;        
    }
    public void verInfo()
    {
        System.out.println(this.nombre);
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
