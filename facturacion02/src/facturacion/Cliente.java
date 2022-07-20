package logica;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;
import persistencia.ConexionBD;

public class Cliente
{
    private String codtipoid;
    private int id;
    private String nombres;
    private String apellidos; //Agregar direccion, telefono, correo, fechanacimiento
    public Cliente()
    {
        this.codtipoid = codtipoid;
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;        
    }
    public String getCodTipoId()
    {
        return(this.codtipoid);
    }
    public void setCodTipoId(String codtipoid)
    {
        this.codtipoid=codtipoid;
    }
    public int getId()
    {
        return(this.id);
    }
    public void setId(int id)
    {
        this.id=id;
    }    
    public String getNombres()
    {
        return(this.nombres);
    }
    public void setNombres(String nombres)
    {
        this.nombres=nombres;
    }
    public String getApellidos()
    {
        return(this.apellidos);
    }
    public void setApellidos(String apellidos)
    {
        this.apellidos=apellidos;
    }    
    @Override
    public String toString()
    {
        return this.getClass().getName() + "{" + "Tipo ID=" + codtipoid + ", id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }

    public List<Cliente> listarClientes()
    {
        List<Cliente> listaClientes = new ArrayList<>();
        ConexionBD miconexion = new ConexionBD();
        String SentenciaSQL = "SELECT * FROM clientes";
        try
        {
           ResultSet miconsulta = miconexion.consultarBD(SentenciaSQL);
           Cliente micliente;
           while(miconsulta.next())
           {
                micliente = new Cliente();
                micliente.setId(miconsulta.getInt(id));
                micliente.setCodTipoId(miconsulta.getString(codtipoid));                
                micliente.setNombres(miconsulta.getString(nombres));                
                micliente.setNombres(miconsulta.getString(apellidos));          
           }
        }
        catch(SQLException ex)
        {
            System.out.println("Error al ver los clientes: " + ex.getMessage());
        }
        finally
        {
            miconexion.cerrarConexion();
        }
        return(listaClientes);
    }
    
}
