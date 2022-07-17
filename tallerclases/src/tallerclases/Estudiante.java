package tallerclases;

import java.util.ArrayList;
import java.util.List;

public class Estudiante
{
    private String codigo;
    private String nombre;
    public List<Nota> notas = new ArrayList<>();
    public Estudiante(String codigo, String nombre)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.notas = new ArrayList<>();
        Nota parcial1 = new Nota("Parcial 1",15f);
        Nota parcial2 = new Nota("Parcial 2",15f);
        Nota parcial3 = new Nota("Parcial 3",20f);
        Nota quices = new Nota("Quices",15f);
        Nota trabajos = new Nota("Trabajos",35f);
        this.notas.add(parcial1);
        this.notas.add(parcial2);
        this.notas.add(parcial3);
        this.notas.add(quices);       
        this.notas.add(trabajos);
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
    public List<Nota> getNotas()
    {
        return(this.notas);
    }
    public void setNotas(List<Nota> notas)
    {
        this.notas=notas;
    }    
    public void verInfo()
    {
        System.out.println(this.codigo + " - " + this.nombre);
    }
    public void verNotas()
    {
        for(Nota minota : notas)
        {
            minota.verInfo();
        }
    }
}
