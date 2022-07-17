package Usuario;


public class Usuario {
    String nombre;
    String email;
    int edad;
    boolean es_admin = false;
    
    public Usuario (String nombre, String email, int edad){
    this.nombre = nombre;
    this.email = email;
    this.edad = edad;    
}
    public void info(){
        System.out.println("[usuario Común]");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Edad: " + this.edad);
    }
    
}
