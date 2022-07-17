package ja_025_animalherencia;

public class Perro extends Animal {
    private boolean esAlpha;

public Perro(int nDientes, boolean pelaje, int nPatas, boolean esAlpha){
    this.nDientes=nDientes;
    this.pelaje = pelaje;
    this.nPatas = nPatas;
    this.esAlpha = esAlpha;
}    

public boolean esAlpha(){
    return this.esAlpha;
}
  
}
