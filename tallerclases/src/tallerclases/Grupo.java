package tallerclases;

import java.util.ArrayList;
import java.util.List;

public class Grupo
{
    private String codigo;
    private String nombre;
    public List<Estudiante> estudiantes = new ArrayList<>();
    public Grupo(String codigo, String nombre)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
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
    public List<Estudiante> getEstudiantes()
    {
        return(this.estudiantes);
    }
    public void setEstudiantes(List<Estudiante> estudiantes)
    {
        this.estudiantes=estudiantes;
    }
    public void agregarEstudiante(Estudiante estudiante)
    {
        estudiantes.add(estudiante);
    }
    public void borrarEstudiante(Estudiante estudiante)
    {
        estudiantes.remove(estudiante);
    }
    public void verInfo()
    {
        System.out.println(this.codigo + " - " + this.nombre);
    }
    public void verEstudiantes()
    {
        for(Estudiante miestudiante : estudiantes)
        {
            miestudiante.verInfo();
        }
    }
}
