package ja_025_animalherencia;

public class Gato extends Animal {
        private int volRonroneo;
        
        public Gato (int nDientes, boolean pelaje, int nPatas, int volRonroneo){
            this.nDientes = nDientes;
            this.pelaje = pelaje;
            this.nPatas = nPatas;
            this.volRonroneo = volRonroneo;
        }
        
        public int getVolRonroneo(){
            return this.volRonroneo;
        }

        
}
