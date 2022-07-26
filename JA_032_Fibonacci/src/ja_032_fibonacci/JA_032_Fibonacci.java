package ja_032_fibonacci;

public class JA_032_Fibonacci {

    public static void main(String[] args) 
    {
        
        System.out.println(fibonaccir(7));
        //System.out.println(fibonaccir(8));
        //System.out.println("Fibonacci iterativo de (" + 8 + ")=" + fibonaccii(8);
        
        //System.out.println("Fibonacci recursivo de (" + 8 + ")=" + fibonaccir(8);
    }
    
    // Fibonacci iterativo
    public static long fibonaccii(int n)
    {
        long f = 0, fsig =1;
        for (int i = 0; 1 < n; i++)
        {
            long aux = fsig;
            fsig += f;
            f = aux;
        }
        return(f);        
    }
    
    // Fibonacci recursivo
    public static long fibonaccir (int n)
    {
        // si n es menor que 0 devuelve -1 como señal de error
        if (n < 0)
            return -1;
        // especificar else no es necesario, ya que cuando se ejecuta return se retorna
        // a la sentencia llamadora y la sigueinte instrucción ya no se ejecuta
        
        if (n == 0)
            return 0;
        else
            if (n == 1)
                return 1;
        else
                return (fibonaccir (n - 1) + fibonaccir (n - 2));
    }    
}
