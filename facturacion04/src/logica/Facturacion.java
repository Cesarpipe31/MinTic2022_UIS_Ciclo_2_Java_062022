package logica;

import java.util.ArrayList;
import java.util.List;
import persistencia.ConexionBD;

public class Facturacion
{
    /*
    public static void main(String[] args)
    {
        Cliente micliente = new Cliente();
        
        //PRUEBA DE LA FUNCION PARA INSERTAR CLIENTES
        micliente.setCodTipoId("CC");
        micliente.setId(1098525636);
        micliente.setNombres("FRANCISCO");
        micliente.setApellidos("MATURANA");        
        if(micliente.guardarCliente()==true);
        {
            verClientes();
        }
        
        //PRUEBA DE LA FUNCION PARA ACTUALIZAR CLIENTES
        micliente.setCodTipoId("CC");
        micliente.setId(1098525636);
        micliente.setNombres("CARLOS");
        micliente.setApellidos("VALDERRAMA"); 
        if(micliente.actualizarCliente()==true);
        {
            verClientes();
        }       
        
        //PRUEBA DE LA FUNCION PARA BORRAR CLIENTES
        micliente.setCodTipoId("CC");
        micliente.setId(1098525636);
        if(micliente.borrarCliente()==true);
        {
            verClientes();
        }
        
    }
    */
    
    public static void verClientes()
    {
        //PRUEBA DE LA FUNCION PARA LISTAR CLIENTES
        Cliente micliente = new Cliente();
        List<Cliente> lista = micliente.listarCliente();
        for (Cliente clienteactual : lista)
        {
            System.out.println(clienteactual);
        } 
    }
    
}
