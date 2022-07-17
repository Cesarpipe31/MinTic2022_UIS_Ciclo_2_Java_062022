package tallerclases;

public class Tallerclases
{

    public static void main(String[] args)
    {
        Estudiante estudiante1 = new Estudiante("2022-2-24","Yudy Alexandra");
        Estudiante estudiante2 = new Estudiante("2022-2-65","Juan Francisco");
        Estudiante estudiante3 = new Estudiante("2022-2-83","Cesar Delgado");
        
        Grupo grupo1 = new Grupo("H29","Grupo H29 Mision TIC 2022");
        
        grupo1.agregarEstudiante(estudiante1);
        grupo1.agregarEstudiante(estudiante2);
        grupo1.agregarEstudiante(estudiante3);
        
        estudiante1.notas.get(0).setValor(4.5f);
        estudiante1.notas.get(1).setValor(4.7f);
        estudiante1.notas.get(2).setValor(5.0f);
        estudiante1.notas.get(3).setValor(4.6f); 
        estudiante1.notas.get(4).setValor(4.5f);
        
        grupo1.verInfo();
        grupo1.verEstudiantes();
        
        estudiante1.verNotas();
        
        /*
        for(int i=0;i<this.niveles.size();i++)
        {
            //IMPRIME EN CONSOLA EL OBJETO LISTA NIVEL QUE CONTIENE
            this.niveles.get(i).verInfo();
            //IMPRIME EN CONSOLA EL OBJETO LISTA MATERIAS QUE CONTIENE EL OBJETO NIVEL
            this.niveles.get(i).verMaterias();
        }
        */
        
    }
  
}
