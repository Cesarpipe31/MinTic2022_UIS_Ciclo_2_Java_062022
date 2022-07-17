package humano;

public class Medico extends Persona
{
    public static void Medico(String[] args)
    {
       
    }
    
    //POLIMORFISMO
    @Override
    public void correr()
    {
        System.out.println("El medico corre para llegar a tiempo a la cirugia");
    }
   
}
