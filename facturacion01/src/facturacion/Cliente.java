package logica;

public class Cliente
{
    // Completa el codigo
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
    
  
    // No borres lo de abajo
    @Override
    public String toString()
    {
        return this.getClass().getName() + "{" + "Tipo ID=" + codtipoid + ", id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }
}
