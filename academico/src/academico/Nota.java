package academico;
//NOMBRE DE LA CLASE
public class Nota
{
    //ATRIBUTOS
    private String nombre;
    private float valor;
    //METODOS
    public Nota(String nombre, float valor)
    {
        this.nombre=nombre;
        this.valor=valor;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre()
    {
        return(this.nombre);
    }
    public void setValor(float valor)
    {
        this.valor=valor;
    }
    public float getValor()
    {
        return(this.valor);
    }
    public void verInfo()
    {
        System.out.println(this.nombre + " : " + this.valor);
    }
}
