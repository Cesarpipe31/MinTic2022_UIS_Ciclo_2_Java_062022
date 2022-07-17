package academico;

public class Materia
{
    private String codigo;
    private String nombre;
    private int creditos;
    private int horasteoricas;
    private int horaspracticas;
    
    public Materia(String codigo, String nombre, int creditos, int horasteoricas, int horaspracticas)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.creditos=creditos;
        this.horasteoricas=horasteoricas;        
        this.horaspracticas=horaspracticas;        
    }
    public void verInfo()
    {
        System.out.println(this.codigo + " - " + this.nombre + " - " + this.creditos + " - " + this.horasteoricas + " - " + this.horaspracticas);
    }
    public String getCodigo()
    {
        return(this.codigo);
    }
    public void setCodigo(String codigo)
    {
        this.codigo=codigo;
    }     
    public String getNombre()
    {
        return(this.nombre);
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }    
    public int getCreditos()
    {
        return(this.creditos);
    }
    public void setCreditos(int creditos)
    {
        this.creditos=creditos;
    }
    public int getHorasPracticas()
    {
        return(this.horaspracticas);
    }
    public void setHorasPracticas(int horaspracticas)
    {
        this.horaspracticas=horaspracticas;
    }
    public int getHorasTeoricas()
    {
        return(this.horasteoricas);
    }
    public void setHorasTeoricas(int horasteoricas)
    {
        this.horasteoricas=horasteoricas;
    }    
}
