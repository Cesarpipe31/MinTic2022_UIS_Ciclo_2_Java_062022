package ja_025_animalherencia;

public class JA_025_AnimalHerencia {

 
    public static void main(String[] args) {
        Gato gatito = new Gato(30, true, 4, 60);
        Perro perrito = new Perro (42, true, 4, false);
        System.out.println(gatito.getNDientes());        
        System.out.println(perrito.getNDientes());        
    }    
}
