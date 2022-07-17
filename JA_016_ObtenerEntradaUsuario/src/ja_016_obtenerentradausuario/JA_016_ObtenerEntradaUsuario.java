package ja_016_obtenerentradausuario;

import java.util.Scanner;

public class JA_016_ObtenerEntradaUsuario {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("usted ha ingresado la cadena: " + s);
        
        int a = in.nextInt();
        System.out.println("Uste ha ingresado un entero: " + a);
        
        float b = in.nextFloat();
        System.out.println("Usted ha ingresado un float: " + b);
    }    
}
