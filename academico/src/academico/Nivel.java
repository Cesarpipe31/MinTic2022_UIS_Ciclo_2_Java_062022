package academico;

import java.util.ArrayList;
import java.util.List;

public class Nivel
{
    private String nombre;
    private int creditos;
    public List<Materia> materias = new ArrayList<>();
    
    public Nivel(String nombre, int creditos)
    {
        this.nombre = nombre;
        this.creditos = creditos;
        this.materias = new ArrayList<Materia>();
    }
    public List<Materia> getMateria()
    {
        return(this.materias);
    }
    public void setMateria(List<Materia> materias)
    {
       this.materias=materias;
    }    
    //En la relación de agregación, los objetos agregados se crean dinamicamente mediante metodos
    public void agregarMateria(Materia mimateria)
    {
        this.materias.add(mimateria);
    }
    public void borrarMateria(Materia mimateria)
    {
        this.materias.remove(mimateria);
    }
    public void agregarMaterias(List<Materia> materias)
    {
        for(Materia mimateria : materias)
        {
            this.materias.add(mimateria);
        }
    }    
    public void verMaterias()
    {
        for(Materia mimateria : this.materias)
        {
            mimateria.verInfo();
        }
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
    public int getCreditos()
    {
        System.out.println(this.creditos);
        return(this.creditos);
    }
    public void setCreditos(int credito)
    {
        this.creditos=creditos;
        System.out.println(this.creditos);
    }
    public void verInfo()
    {
        System.out.println(this.nombre + " - " + this.creditos + " creditos");
    }    
}

