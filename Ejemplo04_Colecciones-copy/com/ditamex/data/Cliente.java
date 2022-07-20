package com.ditamex.data;

import java.lang.Comparable;

public class Cliente implements Comparable
{
    private Integer numCliente;
    private String nombre;
    private String email;
    
    public int compareTo(Object obj){
        return 0;
    }
    
    public Cliente (Integer numCliente, String nombre, String email) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.email = email;
    }
    
    public Integer getNumCliente(){
        return numCliente;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getEmail(){
        return email;
    }
    
    @Override
    public String toString(){
        return "No. Cliente: " + numCliente + ", Nombre: " + nombre + ", Email: " + email;        
    }
    
    
    
    
}
