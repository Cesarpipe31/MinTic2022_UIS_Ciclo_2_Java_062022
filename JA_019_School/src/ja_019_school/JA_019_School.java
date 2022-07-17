package ja_019_school;

import User.User;
import java.util.ArrayList;
import java.util.List;

public class JA_019_School {
    public String school_name;
    public int total_students;
    List<User> users = new ArrayList();
    public School(String name){
        this.school_name = name;
        this.total_students = 0;
    }
    
    public void Welcome(){
    System.out.println("Welcome: " + this.school_name + "\n");
    }
    
    public void save_user(User user){
        this.users.add(user);
        this.total_students += 1;
        System.out.print("new user save \n");
    }
    
    public void students_list(){
        System.out.println("-----------------------");
        System.out.println("--------- USERS LIST --------------");
        System.out.println("-----------------------");
        User.forEach(user -> {
            user.info();
        });
        System.out.println("-----------------------");
    }    
}
