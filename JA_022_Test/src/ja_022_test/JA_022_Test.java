package ja_022_test;
import Usuario.Usuario;
import Usuario.UsuarioAdmin;

public class JA_022_Test {
  
    public static void main(String[] args) {
        Usuario usuario = new Usuario ("César", "cesarpipe31@gmail.com", 46);
        usuario.info();
        
        Usuario admin = new UsuarioAdmin ("César", "cesarpipe31@gmail.com", 46);
        admin.info();
        
        
    }
    
}
