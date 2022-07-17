package humano;

public class Deportista extends Persona
{
    
    public String equipo;
    
    public Deportista(String nombre)
    {
        this.nombre=nombre;
    }
    
    //METODOS SET Y GET PARA CADA ATRIBUTO
    public String getEquipo()
    {
        return(equipo);
    }
    public void setEquipo(String equipo)
    {
        this.equipo=equipo;
    }
    
    @Override
    public void correr()
    {
        System.out.println("El deportista corre para llegar primero");
    }
    
    public String verInfo()
    {
        String informacion;
        informacion = "El nombre es: " + nombre + " el telefono es: " + telefono + " el equipo es: " + equipo;
        return(informacion);
    }   
    
    
    
}
