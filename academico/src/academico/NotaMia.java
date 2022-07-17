package academico;

//Nombre de la Clase
public class NotaMia 
{
    // Atributos
    private String nombre;
    private float valor;
    //Métodos CONSTRUCTOR
    public NotaMia (String nombre, float valor)
    {
        this.nombre = nombre;
        this.valor = valor;        
    }
    //Método SET permite modificación a atributo nombre
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    //Método GET permite retornar el atributo nombre
    public String getNombre()
    {
        return (this.nombre);
    }
    //Método SET permite modificación a atributo valor
    public void setValor(float valor)
    {
        this.valor = valor;
    }
    // Método GET permite retornar el atributo valor
    public float getValor()
    {
        return (this.valor);
    }
    //Método
    public void verinfo()
    {
        System.out.println(this.nombre + " : " + this.valor);
    }     
}
