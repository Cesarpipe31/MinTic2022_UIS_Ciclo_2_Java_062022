package vida;

public class Animal extends SeresVivos
{
    //ATRIBUTOS
    public String tipo;     
    public String raza;     
    public String tipoalimientacion;   
    public String locomocion;
    public boolean domestico;
    public boolean sangrefria;
    public boolean vertebrado;
    public int patas;
    
    public void caminar(int distancia, String direccion)
    {
       System.out.println(nombre + " camina " + distancia + " kilometros en direccion " + direccion);
    }

    public void cazar(String presa)
    {
       System.out.println(nombre + " esta canzando " + presa);
    }   
    
    
}
