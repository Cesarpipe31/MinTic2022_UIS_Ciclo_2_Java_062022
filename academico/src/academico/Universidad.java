//NOMBRE DEL PAQUETE
package academico;
//NOMBRE DE LA CLASE
public class Universidad
{
    //ATRIBUTOS
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String sitioweb;
    //METODO CONSTRUCTOR (Debe llamarse igual que la clase)
    public Universidad(String nit, String nombre, String direccion, String telefono, String correo, String sitioweb)
    {
        this.nit=nit;
        this.nombre=nombre;        
        this.direccion=direccion;         
        this.telefono=telefono; 
        this.correo=correo; 
        this.sitioweb=sitioweb;
    }
    //METODOS
    public void verInfo()
    {
        System.out.println("Nit: " + this.nit);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Direcion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Correo: " + this.correo);
        System.out.println("Sitio Web: " + this.sitioweb);       
    }
    //METODO GET PARA EL ATRIBUTO NOMBRE
    public String getNombre()
    {
        System.out.println(this.nombre);
        return(this.nombre);
    }
    //METODO SET PARA EL ATRIBUTO NOMBRE
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
        System.out.println(this.nombre);
    }    
 
}
