/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producto;

/**
 *
 * @author cesar
 */
public class Producto {
    private String nombre;
    private String id;
    private double temperatura;
    private double valorBase;
    
     public static void main(String[] args) {
        Producto p = new Producto("Aceta","11", 25, 1000);
p.setTemperatura(27);
System.out.println(p.toString());
System.out.println(p.toString1());
    }

    public Producto(String nombre, String id, double temperatura, double valorBase) {
        this.nombre = nombre;
        this.id = id;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

        @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", id=" + id + ", temperatura=" + temperatura + ", valorBase=" + valorBase + '}';
    }

    
   
    public String toString1()
    {
            return this.getClass().getName() + "{" + "nombre=" + nombre + ", id=" + id + ", temperatura=" + temperatura + ", Valor Base=" + valorBase + '}';
    }


    
   
    
}
