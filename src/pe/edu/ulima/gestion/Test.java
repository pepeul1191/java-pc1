
package pe.edu.ulima.gestion;

import pe.edu.ulima.beans.Alumno;

public class Test {

    public static void main(String[] args) {
        Gestion g = new Gestion();
        
        //Pregunta 1 : Cargar el arreglo "alumnos" de la clase Gestion con el archivo de texto
        
        g.cargar("C:\\Documentos\\NetBeansProjects\\PracticaCalificada1\\src\\pe\\edu\\ulima\\gestion\\data.txt");
        
        //Pregunta 2 : Mostrar la lista de los alumnos, mostrando la fecha de nacimiento en el formato dd/mm/yyyy
        
        Alumno[] lista = g.lista();
        
        for(Alumno a : lista){
            if(a != null){
                System.out.println(a);
            }
        }
        
        //Pregunta 3 : Agregar un nuevo alumno mediante input scanner
        
        g.agregarAlumno();
        
        //Pregunta 4 : Mostrar la lista actualizada de los alumnos, mostrando la fecha de nacimiento en el formato dd/mm/yyyy
        
        Alumno[] lista2 = g.lista();
        
        for(Alumno a : lista2){
            if(a != null){
                System.out.println(a);
            }
        }
        
        //Pregunta 5 : Mostrar el alumno de mayor edad
        
        System.out.println("El mayor alumno es : ");
        System.out.println(g.mayor());
        
        //Pregunta 6 : Mostrar el alumno de menor edad
        
        System.out.println("El menor alumno es : ");
        System.out.println(g.menor());
    }
    
}
