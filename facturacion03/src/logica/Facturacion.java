package logica;

import java.util.ArrayList;
import java.util.List;
import persistencia.ConexionBD;

public class Facturacion
{
    public static void main(String[] args)
    {
        Cliente micliente = new Cliente();
        List<Cliente> lista = micliente.listarCliente();
        for (Cliente clienteactual : lista)
        {
            System.out.println(clienteactual);
        }
    }
}
