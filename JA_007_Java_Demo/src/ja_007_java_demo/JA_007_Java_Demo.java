/*
 Tomado de la página https://guru99.es/java-static-variable-methods/
 */
package ja_007_java_demo;

public class JA_007_Java_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

public class Demo {  
    public static void main(String args[]) {    
        Estudiante s1 = nuevo Estudiante();    
        s1.showData();    
        Estudiante s2 = nuevo Estudiante();    
        s2.showData();    

        //Student.b++;   
        //s1.showData ();
    }
} 
clase Estudiante {
    int a; // inicializado a cero
    static int b; // inicializado a cero solo cuando la clase no está cargada para cada objeto creado.   

    Estudiante() {  
        // Constructor incrementa la variable estática b  
        b++; 
    }   
    public void showData() {     
            System.out.println("Valor de a =" + a);     
            System.out.println("Valor de b =" + b);  
        }
        // public void increment () {
        // a ++;
        //} }
}