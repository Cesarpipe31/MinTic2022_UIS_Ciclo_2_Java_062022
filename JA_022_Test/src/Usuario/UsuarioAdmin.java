package Usuario;

public class UsuarioAdmin extends Usuario{
    public UsuarioAdmin(String nombre, String email, int edad){
        super(nombre,email,edad);
        this.es_admin = true;
    }

    @Override
   public void info(){
        System.out.println("[usuario Admin]");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Edad: " + this.edad);
    }
    
    
    
    
}
