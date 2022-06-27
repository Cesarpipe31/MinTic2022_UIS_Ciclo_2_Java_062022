public class Vida
{
    public static void main(String[] args)
    {
        Humano persona1 = new Humano();
        persona1.asignarNombre("Juan Carlos");
        System.out.println("La persona 1 se llama: " + persona1.verNombre());
        persona1.asignarApellido("Delgado Alvarado");
        System.out.println("La persona 1 tiene por apellido: " + persona1.verApellido());
    }
   
}
