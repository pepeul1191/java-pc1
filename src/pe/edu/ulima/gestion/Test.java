
package pe.edu.ulima.gestion;

import pe.edu.ulima.beans.Alumno;

public class Test {

    public static void main(String[] args) {
        Gestion g = new Gestion();
        
        g.cargar("C:\\Documentos\\NetBeansProjects\\PracticaCalificada1\\src\\pe\\edu\\ulima\\gestion\\data.txt");
        
        Alumno[] lista = g.lista();
        
        for(Alumno a : lista){
            if(a != null){
                System.out.println(a);
            }
        }
        
        g.agregarAlumno();
        
        Alumno[] lista2 = g.lista();
        
        for(Alumno a : lista2){
            if(a != null){
                System.out.println(a);
            }
        }
    }
    
}
