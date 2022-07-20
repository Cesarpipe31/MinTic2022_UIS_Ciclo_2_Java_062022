package logica;

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
}
