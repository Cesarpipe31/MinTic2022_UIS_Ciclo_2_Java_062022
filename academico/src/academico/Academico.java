package academico;

import java.util.ArrayList;
import java.util.List;

public class Academico
{
   
    static List<Materia> materias = new ArrayList<Materia>();
    
    public static void main(String[] args)
    {
        /*
        Universidad miuniversidad1 = new Universidad("800245132-2", "UIS", "Calle 9 con 26 Bucaramanga", "6312445", "info@uis.edu.co", "www.uis.edu.co");
        Universidad miuniversidad2 = new Universidad("800356235-4", "UNAL", "Calle 45 No. 30-06 Bogota", "3255666", "info@unal.edu.co", "www.unal.edu.co");
        miuniversidad1.getNombre();
        miuniversidad2.getNombre();
        miuniversidad1.setNombre("Universidad Industrial de Santander");
        miuniversidad2.setNombre("Universidad Nacional");        
        miuniversidad1.verInfo();
        miuniversidad2.verInfo(); 
        
        Pensum pensum1 = new Pensum("Pensum de Ing. de Sistemas");
        Pensum pensum2 = new Pensum("Pensum de Ing. Industrial");
        
        Materia materia1 = new Materia("Calculo I",4);
        Materia materia2 = new Materia("Ecuaciones diferenciales",5);
        Materia materia3 = new Materia("Programación",4);
        Materia materia4 = new Materia("Quimica",3);
        Materia materia5 = new Materia("Humanidades I",2);

        pensum1.materias = new Materia[5];
        pensum1.materias[0] = materia1;
        pensum1.materias[1] = materia2;       
        pensum1.materias[2] = materia3;
        pensum1.materias[3] = materia4;       
        pensum1.materias[4] = materia5;
        
        //ESTILOS DE IMPRESION
        pensum1.getNombre();
        for(inti= 0;i<pensum1.materias.length;i++)
        {
            pensum1.materias[i].getNombre();
        }
        pensum1.getNombre();
        for(Materia materiaactual : pensum1.materias)
        {
            materiaactual.getNombre();
        }
        */
        //CREAR PENSUM
        Pensum pensum1 = new Pensum("Pensum de Ingenieria Industrial");
        //CREAR MATERIAS
        Materia materia1 = new Materia("24948","VIDA Y CULTURA UNIVERSITARIA",0,1,0);
        Materia materia2 = new Materia("23427","TALLER DE LENGUAJE",3,4,0);
        Materia materia3 = new Materia("23015","GEOMETRIA DESCRIPTIVA",3,4,0);
        Materia materia4 = new Materia("22979","ALGEBRA LINEAL I",3,4,0);
        Materia materia5 = new Materia("22949","QUIMICA BASICA",3,4,0);
        Materia materia6 = new Materia("20252","CALCULO I",3,4,0);
        Materia materia7 = new Materia("28998","INTRODUCCION A LA INGENIERIA INDUSTRIAL",3,4,0);
        Materia materia8 = new Materia("28997","ESTRUCTURAS COMPUTACIONALES",3,5,0);
        Materia materia9 = new Materia("23423","CULTURA FISICA Y DEPORTIVA",1,0,2);
        Materia materia10 = new Materia("22952","BIOLOGIA PARA INGENIEROS",2,3,0);
        Materia materia11 = new Materia("22950","FISICA I",4,5,2);
        Materia materia12 = new Materia("20253","CALCULO II",4,4,0);
        //METODO 1 PARA AGREGAR MATERIAS AL NIVEL
        /*
        pensum1.niveles.get(0).agregarMateria(materia1);
        pensum1.niveles.get(0).agregarMateria(materia2);
        pensum1.niveles.get(0).agregarMateria(materia3);
        pensum1.niveles.get(0).agregarMateria(materia4);
        pensum1.niveles.get(0).agregarMateria(materia5);
        pensum1.niveles.get(0).agregarMateria(materia6);
        pensum1.niveles.get(1).agregarMateria(materia7);
        pensum1.niveles.get(1).agregarMateria(materia8);
        pensum1.niveles.get(1).agregarMateria(materia9);
        pensum1.niveles.get(1).agregarMateria(materia10);
        pensum1.niveles.get(1).agregarMateria(materia11);
        pensum1.niveles.get(1).agregarMateria(materia12);        
        */
        //METODO 2 PARA AGREGAR MATERIAS AL NIVEL
        materias.add(materia1);
        materias.add(materia2);        
        materias.add(materia3);
        materias.add(materia4);  
        materias.add(materia5);
        materias.add(materia6);         
        pensum1.niveles.get(0).agregarMaterias(materias);
        materias.clear();
        materias.add(materia7);
        materias.add(materia8);        
        materias.add(materia9);
        materias.add(materia10);  
        materias.add(materia11);
        materias.add(materia12);         
        pensum1.niveles.get(1).agregarMaterias(materias);
        
        //IMPRIME EN CONSOLA EL OBJETO PENSUM
        pensum1.verInfo();
        
        Carrera carrera1 = new Carrera("Ingenieria Industrial",pensum1);
        carrera1.verInfo();
        
    }
}
