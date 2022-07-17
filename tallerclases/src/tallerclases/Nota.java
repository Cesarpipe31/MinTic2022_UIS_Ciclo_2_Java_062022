package tallerclases;

public class Nota
{
    private String nombre;
    private float porcentaje;
    private float valor;
    public Nota(String nombre, float porcentaje)
    {
        this.nombre=nombre;
        this.porcentaje=porcentaje;
        this.valor=0.0f;
    }
    public String getNombre()
    {
        return(this.nombre);
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public float getPorcentaje()
    {
        return(this.porcentaje);
    }
    public void setPorcentaje(float porcentaje)
    {
        this.porcentaje=porcentaje;
    }
    public float getValor()
    {
        return(this.valor);
    }
    public void setValor(float valor)
    {
        this.valor=valor;
    }
    public void verInfo()
    {
        System.out.println(this.nombre + " - " + this.valor + " - " + this.porcentaje + "%");
    }
}
