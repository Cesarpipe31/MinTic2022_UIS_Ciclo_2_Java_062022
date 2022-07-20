package com.ditamex.controller;

import com.ditamex.data.Cliente;
import java.util.ArrayList;

public class ClienteController
{
    public ClienteController(){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        clientes.add(new Cliente(101340, "César0", "Cesar@gmail.com"));
        clientes.add(new Cliente(101341, "César1", "Cesar@gmail.com"));
        clientes.add(new Cliente(101342, "César2", "Cesar@gmail.com"));
        clientes.add(new Cliente(101343, "César3", "Cesar@gmail.com"));
        clientes.add(new Cliente(101344, "César4", "Cesar@gmail.com"));
        clientes.add(new Cliente(101345, "César5", "Cesar@gmail.com"));
        clientes.add(new Cliente(101346, "César6", "Cesar@gmail.com"));
        
        /*
        for (int x = 0; x < clientes.size(); x++) {
            Cliente cliente = (Cliente) clientes.get(x);
            System.out.println(cliente);
        }
        */
            
        for (Cliente cliente: clientes){
            System.out.println(cliente);            
        }
        
    }
    
    public static void main(String[] args) {
        new ClienteController();
    }
    
    
}
