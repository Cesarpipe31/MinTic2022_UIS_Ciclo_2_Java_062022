package User;


public class User {
    String name;
    String email;
    int id;
    int age;
    public User(){}
    public User (String name, String email, int id, int age){
        this.name = name; 
        this.email = email;
        this.id = id;
        this.age = age;
    }
    
    public void info(){
        System.out.println("-----------------------");
        System.out.println("--------USUARIO------");
        System.out.println("-----------------------");
        System.out.println("Full name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("ID: " + this.id);
        System.out.println("Age: " + this.age);
        System.out.println("-----------------------");
    }
    
}
