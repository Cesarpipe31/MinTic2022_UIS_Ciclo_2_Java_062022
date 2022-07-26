package pesoconstante;

public class PesoConstante {

    public static void main(String[] args) 
    {
        Indice_masa_corporal(200,176);        
    }            
    
    static void Indice_masa_corporal(float peso, float estatura)
        {
            String Resultado;
            float IMC;
            IMC = peso / (estatura * estatura);
            if(IMC < 18.5f)
                {
                Resultado = "Por debajo de lo normal";
                }
                else if(IMC >= 18.5f || IMC <= 25f)
                {
                Resultado = "Normal";
                }
                else if(IMC > 25.0f || IMC <= 30.0f)
                {
                Resultado = "Peso superior a lo normal";
                }
                else
                {                
                Resultado = "Obesidad";
                }
                System.out.println(Resultado);
        }        
}