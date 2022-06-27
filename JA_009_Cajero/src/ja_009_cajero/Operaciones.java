package ja_009_cajero;

//import java.util.Scanner;

public class Operaciones
{
    public int saldoactual;
    
    public void asignarSaldo(int saldoasigado)
    {
        this.saldoactual=saldoasigado;
    }
    
    public void consultarSaldo()
    {
        System.out.println("El saldo actual es: " + this.saldoactual);
    }
    
    public static void limpiarPantalla()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println();
        }
    }
    
}
