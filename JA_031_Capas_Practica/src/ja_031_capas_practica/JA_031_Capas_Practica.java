package ja_031_capas_practica;

import Data.Contacto;
import UI.Interfaz;
import java.util.LinkedList;


public class JA_031_Capas_Practica {

    public static void main(String[] args) {
        Interfaz i1 = new Interfaz();  
        i1.lectura();
    }
    
    LinkedList<Contacto> lista = new LinkedList<Contacto>();
    
    public boolean add(Contacto contacto){
        char[] letras = contacto.getNombre().toCharArray();
        if (letras.length >= 3 && letras.length <= 10){
            String enteroString = Long.toString(contacto.getCelular());
            letras = enteroString.toCharArray();
            if(letras.length == 10){
                lista.add(contacto);
                return true;
            }
        }
        return false;
    }

    public LinkedList<Contacto> getLista() {
        return lista;
    }

    public void setLista(LinkedList<Contacto> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "JA_031_Capas_Practica{" + "lista=" + lista + '}';
    }
}
