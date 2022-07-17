package humano;

public class Empleado extends Persona
{
    public String empresa;
    public float salario;    
    public String cargo;
    public boolean directivo;
    
    public Empleado(String empresa, float salario, String cargo, boolean directivo)
    {
       this.empresa = empresa;
       this.salario = salario;      
       this.cargo = cargo;        
       this.directivo = directivo;          
    }
    
    public float CalcularSueldo()
    {
       float sueldo;
       sueldo = this.salario;  
       if (this.directivo==true)
       {
           sueldo = sueldo*1.3f; //INCREMENTA EL SUELO UN 30% SI ES DIRECTIVO
       }
       return(sueldo); 
    }
    
    //POLIMORFISMO
    @Override
    public void correr()
    {
        System.out.println("El empleado corre para llegar a tiempo");
    }
    
    
    
    
}
