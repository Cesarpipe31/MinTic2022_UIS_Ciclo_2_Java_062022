package academico;

import java.util.ArrayList;
import java.util.List;

public class Pensum
{
    private String nombre;
    public List<Nivel> niveles = new ArrayList<>();
        
    public Pensum(String nombre)
    {
        this.nombre = nombre;        
        this.niveles = new ArrayList<Nivel>(10);
        //En la relación de composición, los objetos componentes se crean en el constructor del objeto.
        Nivel nivel1 = new Nivel("Nivel I",19);
        Nivel nivel2 = new Nivel("Nivel II",17);
        Nivel nivel3 = new Nivel("Nivel III",21);
        Nivel nivel4 = new Nivel("Nivel IV",19);
        Nivel nivel5 = new Nivel("Nivel V",17);
        Nivel nivel6 = new Nivel("Nivel VI",18);
        Nivel nivel7 = new Nivel("Nivel VII",15);
        Nivel nivel8 = new Nivel("Nivel VIII",18);
        Nivel nivel9 = new Nivel("Nivel IX",15);
        Nivel nivel10 = new Nivel("Nivel X",13);
        this.niveles.add(nivel1);
        this.niveles.add(nivel2);
        this.niveles.add(nivel3);        
        this.niveles.add(nivel4);       
        this.niveles.add(nivel5);       
        this.niveles.add(nivel6);
        this.niveles.add(nivel7);         
        this.niveles.add(nivel8);       
        this.niveles.add(nivel9);
        this.niveles.add(nivel10);          
    }
    public void verInfo()
    {
        //IMPRIME EN CONSOLA EL OBJETO PENSUM
        System.out.println(this.nombre);
        for(int i=0;i<this.niveles.size();i++)
        {
            //IMPRIME EN CONSOLA EL OBJETO LISTA NIVEL QUE CONTIENE
            this.niveles.get(i).verInfo();
            //IMPRIME EN CONSOLA EL OBJETO LISTA MATERIAS QUE CONTIENE EL OBJETO NIVEL
            this.niveles.get(i).verMaterias();
        }
        
    }
    public void verNiveles()
    {
        for(Nivel minivel : niveles)
        {
            minivel.verInfo();
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
}
