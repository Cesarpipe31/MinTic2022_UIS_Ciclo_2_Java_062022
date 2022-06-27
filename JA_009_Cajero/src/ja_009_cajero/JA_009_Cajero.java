package ja_009_cajero;

import java.util.Scanner;

public class JA_009_Cajero 
{
    public static void main(String[] args)
    {
        Cajero.menu();
    }
    private static void menu()
    {
        int opcion;

        Scanner leernumero = new Scanner(System.in);
        Operaciones usuariocajero = new Operaciones();
        usuariocajero.asignarSaldo(1000000);
        
        do
        {
            //Operaciones.limpiarPantalla();
            System.out.println("*** MENU PRINCIPAL ***");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");           
            System.out.println("3. Consignar dinero");           
            System.out.println("4. Salir");           
            System.out.print("Seleccione una opcion: ");
            opcion = leernumero.nextInt();
            switch(opcion)
            {
                case 1: 
                        usuariocajero.consultarSaldo();
                        break;
                case 2: 

                        break;                
                case 3: 

                        break;
                case 4: break;
                default: opcion=4; break;
            }
        }
        while(opcion!=4);
    }
}
