package ja_026_facturación;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JA_026_Facturación {
    
    static int op;
    static Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        do{
            System.out.println("***************************");
            System.out.println("     Menú");
            System.out.println("1. Listar");
            System.out.println("2. Guardar");
            System.out.println("3. Eliminar");
            System.out.println("4. Editar");
            System.out.println("5. Salir");
            
            System.out.println("");
            System.out.print("Ingrese su opción: ");
            op = teclado.nextInt();
            
            switch(op){
                case 1: listar(); break;
                case 2: guardar(); break;
                case 3: eliminar(); break;
                case 4: editar(); break;            
                }
            }while (op!=5); 
    }
    
    public static void guardar(){        
             
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            PreparedStatement ps = cn.prepareStatement("INSERT INTO mascotas VALUES(?,?,?,?);");
            
            System.out.print("Ingrese el código: ");
            int codigo = teclado.nextInt();
            System.out.print("Ingrese el nombre: ");
            String nombre = teclado.next();
            System.out.print("Ingrese la raza:   ");
            String raza = teclado.next();
            System.out.print("Ingrese el color:  ");
            String color = teclado.next();
            
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, raza);
            ps.setString(4, color);
            
            ps.executeUpdate();
                    
                    } catch (SQLException ex) {
            Logger.getLogger(JA_026_Facturación.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public static void eliminar(){
                
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            PreparedStatement ps = cn.prepareStatement("DELETE FROM mascotas WHERE codigo = ?;");
            
            System.out.print("Ingrese el código de la mascota a eliminar: ");
            int codigo = teclado.nextInt();
                        
            ps.setInt(1, codigo);
                        
            ps.executeUpdate();
                    
                    } catch (SQLException ex) {
            Logger.getLogger(JA_026_Facturación.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        public static void editar(){           
        
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            PreparedStatement ps = cn.prepareStatement("UPDATE mascotas SET nombre = ?, raza = ?, color = ? WHERE codigo = ?;");
            
            System.out.print("Ingrese el código a editar: ");
            int codigo = teclado.nextInt();
            System.out.print("Ingrese el nombre a editar: ");
            String nombre = teclado.next();
            System.out.print("Ingrese la raza a editar:   ");
            String raza = teclado.next();
            System.out.print("Ingrese el color a editar:  ");
            String color = teclado.next();
            
            ps.setString(1, nombre);
            ps.setString(2, raza);
            ps.setString(3, color);
            ps.setInt(4, codigo);
            
            ps.executeUpdate();
                    
                    } catch (SQLException ex) {
            Logger.getLogger(JA_026_Facturación.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        public static void listar(){
                        
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM mascotas");
            
            while (rs.next()){
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
                
            }
                    } catch (SQLException ex) {
            Logger.getLogger(JA_026_Facturación.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
}
