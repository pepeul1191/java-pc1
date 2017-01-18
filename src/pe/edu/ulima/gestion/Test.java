
package pe.edu.ulima.gestion;

import pe.edu.ulima.beans.Alumno;

public class Test {

    public static void main(String[] args) {
        Gestion g = new Gestion();
        
        //Pregunta 1
        
        g.cargar("C:\\Documentos\\PP\\java-pc1solucion\\src\\pe\\edu\\ulima\\gestion\\data.txt");
        
        Alumno[] lista = g.lista();
        
        for(Alumno a : lista){
            if(a != null){
                System.out.println(a);
            }
        }
        
        //Pregunta 2
        
        g.agregarAlumno();
        
        Alumno[] lista2 = g.lista();
        
        for(Alumno a : lista2){
            if(a != null){
                System.out.println(a);
            }
        }
        
        //Pregunta 3
        
        Alumno[] mayorYMenor = g.mayorYMenor();
        System.out.println("El mayor alumno es : " + mayorYMenor[1]);
        System.out.println("El menor alumno es : " + mayorYMenor[0]);
        
        //Pregunta 4
        
        int[] vocalesCantidad = g.cantidadVocales();
        String[] vocalesValores = {"A", "E", "I", "O", "U"};
        
        for(int k = 0; k < vocalesCantidad.length; k++){
            System.out.println("Vocal : " + vocalesValores[k] + " - Cantidad : " + vocalesCantidad[k]);
        }
    }
    
}
