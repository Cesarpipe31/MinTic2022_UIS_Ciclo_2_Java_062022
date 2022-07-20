package com.ditamex.data;


public class Cliente
{
    private Integer numCliente;
    private String nombre;
    private String email;
    
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
