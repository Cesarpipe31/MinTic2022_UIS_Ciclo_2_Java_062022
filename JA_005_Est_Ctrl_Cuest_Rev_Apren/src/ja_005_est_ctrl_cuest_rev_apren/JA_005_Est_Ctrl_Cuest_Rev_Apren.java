/*
Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:

●     Si trabaja 40 horas o menos se le paga el 0.015 del SMLV por hora laborada.

●     Si trabaja más de 40 horas se le paga a 0.02 del SMLV por hora laborada.

Realice una función que se llame salario que reciba como parámetro la cantidad de horas 
del obrero y retorne un valor double con el salario devengado para dar solución al problema.

El SMLV es 1000000
*/

package ja_005_est_ctrl_cuest_rev_apren;

import java.util.Scanner;

public class JA_005_Est_Ctrl_Cuest_Rev_Apren 
{

    public static void main(String[] args) 
    {
        float horas;
        Scanner leernumero = new Scanner(System.in);
        
        System.out.print("Escriba la cantidad de horas: ");
        horas = leernumero.nextFloat();
        salario(horas);
    }
    
    public static double salario (float horas)
    {
        double respuesta;
        int smlv = 1000000;
        
        if(horas <= 40)
        {
            respuesta = smlv * 0.015 * horas;
            System.out.println(respuesta);
        }
        else
        {
            respuesta = smlv * 0.02 * horas;
            System.out.println(respuesta);
        }
        return respuesta;
    }
}
