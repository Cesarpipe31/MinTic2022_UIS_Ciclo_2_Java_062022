package vida;

public class SeresVivos
{
    //SE VISUALIZAN DESDE TODO EL PROYECTO
    //public String nombre;
    //public String color;
    
    //SE VISUALIZAN DESDE EL MISMO PAQUETE O DESDE LAS SUBCLASES
    //public String nombre;
    //public String color;
    
    //SE VISUALIZAN SOLO DENTRO DE LA MISMA CLASE
    //private String nombre;
    //private String color;
    
    //ATRIBUTOS/PROPIEDADES/VARIABLES/CUALIDADES
    public String nombre;
    public String color;
    
    //METODOS/FUNCIONES/PROCEDIMIENTOS
    protected void alimentar(String tipocomida, int cantidaddecomida)
    {
        System.out.println(nombre + " esta comiendo " + cantidaddecomida + " " + tipocomida);
    }
    
    public String verNombre()
    {
        return nombre;
    }
    
    public static void respirar(boolean respira)
    {
        if(respira==true)
        {
            System.out.println("Esta vivo");
        }
        else
        {
            System.out.println("Falleció");
        }
    } 

}
