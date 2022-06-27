package vida;

public class Planta extends SeresVivos
{
    //ATRIBUTOS
    public String familia;    
    public String nombre_cientifico;
    public String tipo;    
    public String pisotermico;    
    public boolean frutal;    
    
    public int fotosintesis(int cantidadagua, int intensidadluz)
    {
    
        System.out.println("La planta se llama " + nombre);
        
        
        
        int nutrientes = intensidadluz*cantidadagua;
        return nutrientes;
    }
    
    public int producir(int cantidadabono)
    {
        int frutos = 233*cantidadabono;
        return frutos; 
    }
    
    
    
}
