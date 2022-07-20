package ejerciciopractico;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Cliente
{
    private String codtipoid;
    private int cedula;
    private String nombres;
    /*
    private String apellidos;    
    private String direccion;
    private String telefono;
    private String correo;
    private String fechanacimiento;
    */
    
    //public Cliente(String codtipoid, int cedula, String nombres, String apellidos, String direccion, String telefono, String correo, String fechanacimiento)
    public Cliente(String codtipoid, int cedula, String nombres)
    {
        this.codtipoid = codtipoid;
        this.cedula = cedula;
        this.nombres = nombres;
    }
    public Cliente()
    {
    }
    
    public int getCedula()
    {
        return (this.cedula);
    }
    public void setCedula(int cedula)
    {
        this.cedula = cedula;
    }
    public String getNombres()
    {
        return(nombres);
    }
    public void setNombres(String nombres)
    {
        this.nombres = nombres;
    }
    public String getCodTipoID()
    {
        return(this.codtipoid);
    }
    public void setCodTipoID(String codtipoid)
    {
        this.codtipoid = codtipoid;
    }
    @Override
    public String toString()
    {
        return("TipoID :" + codtipoid + " Cedula: " + this.cedula + " Nombres: " + this.nombres);
    }
    
    public List<Cliente> listarCliente()
    {
        List<Cliente> listaClientes = new ArrayList<>();
        ConexionBD conexion = new ConexionBD();
        String sql = "SELECT * FROM clientes;";
        try
        {
            ResultSet rs = conexion.consultarBD(sql);
            Cliente micliente;
            while(rs.next())
            {
                micliente = new Cliente();
                micliente.setCedula(rs.getInt("cedula"));
                micliente.setNombres(rs.getString("nombres"));
                micliente.setCodTipoID(rs.getString("codtipoid"));
                listaClientes.add(micliente);
            }
        }
        catch (SQLException ex)
        {
            System.out.println("Error al listar productos:" + ex.getMessage());
        }
        finally
        {
            conexion.cerrarConexion();
        }
        return listaClientes;
    }

    public boolean guardarCliente()
    {
        ConexionBD conexion = new ConexionBD();
        String sql = "INSERT INTO clientes(codtipoid,cedula,nombres) VALUES('" + this.codtipoid + "'," + this.cedula + ",'" + this.nombres+"');";
        if(conexion.setAutoCommitBD(false))
        {//Para que la bd no confirme automaticamente el cambio
            if (conexion.insertarBD(sql))
            {
                conexion.commitBD();//confirma el cambio a la BD
                conexion.cerrarConexion();
                return true;
            }
            else
            {
                conexion.rollbackBD();
                conexion.cerrarConexion();
                return false;
            }
        }
        else
        {
            conexion.cerrarConexion();
            return false;
        }
    }

    public boolean actualizarCliente()
    {
        ConexionBD conexion = new ConexionBD();
        String sql = "UPDATE clientes SET nombres='" + this.nombres + "' WHERE codtipoid='" + this.codtipoid + "' AND cedula=" + this.cedula + ";";
        if (conexion.setAutoCommitBD(false))
        {
            if (conexion.actualizarBD(sql))
            {
                conexion.commitBD();
                conexion.cerrarConexion();
                return true;
            }
            else
            {
                conexion.rollbackBD();
                conexion.cerrarConexion();
                return false;
            }
        }
        else
        {
            conexion.cerrarConexion();
            return false;
        }
    }

    public boolean eliminarCliente()
    {
        ConexionBD conexion = new ConexionBD();
        String sql = "DELETE FROM clientes WHERE cedula=" + this.cedula + ";";
        if (conexion.setAutoCommitBD(false))
        {
            if (conexion.actualizarBD(sql))
            {
                conexion.commitBD();
                conexion.cerrarConexion();
                return true;
            }
            else
            {
                conexion.rollbackBD();
                conexion.cerrarConexion();
                return false;
            }
        }
        else
        {
            conexion.cerrarConexion();
            return false;
        }
    }

}

