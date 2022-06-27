package vida;

public class Humano extends SeresVivos
{
    //ATRIBUTOS
    public int cedula;    
    public int edad;     
    public float altura;        
    public String tiposangre;
    public boolean discapacidad;
    
    
    
    //METODOS
    public void asignarNombre(String nuevonombre)
    {
        nombre = nuevonombre;
        System.out.println("El humano se llama " + nombre);
    }
    
    public void caminar(int distancia, String direccion)
    {
       String micolor = color;
       
       System.out.println(nombre + " camina " + distancia + " kilometros en direccion " + direccion);
    }
    
    public void estudiar(String carrera)
    {
       System.out.println(nombre + " estudia " + carrera);
    }    
  
}
