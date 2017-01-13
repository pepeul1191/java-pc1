
package pe.edu.ulima.gestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.ulima.beans.Alumno;

public class Gestion {
    private int indice = 0;
    private Alumno[] alumnos = new Alumno[20];
    
    public void cargar(String ruta){
        Scanner sc = null;
        File f = new File(ruta);
        
        try {
            sc = new Scanner(f);
            while(sc.hasNext()){
                String linea = sc.nextLine();
                String[] datos = linea.split("::");
                int codigo = Integer.parseInt(datos[0]); 
                String nombres = datos[1];
                String apellidoPaterno = datos[2];
                String apellidoMaterno = datos[3]; 
                String dni = datos[4];
                String nacimiento = datos[5];
                
                Alumno a = new Alumno(codigo, nombres, apellidoPaterno, apellidoMaterno, dni, nacimiento);
                alumnos[indice] = a;
                indice++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger("El archivo no existe");
        } finally {
            sc.close();
        }
    }
    
    public Alumno[] lista(){
        return alumnos;
    }
    
    public void agregarAlumno(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Código : ");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.println("Nombres : ");
        String nombres = sc.nextLine();
        System.out.println("Apellido Paterno : ");
        String apellidoPaterno = sc.nextLine();
        System.out.println("Apellido Materno: ");
        String apellidoMaterno = sc.nextLine(); 
        System.out.println("DNI : ");
        String dni = sc.nextLine();
        System.out.println("Fecha de Nacimiento : ");
        String nacimiento = sc.nextLine();
        
        Alumno a = new Alumno(codigo, nombres, apellidoPaterno, apellidoMaterno, dni, nacimiento);
        System.out.println(a);
        alumnos[indice] = a;
        indice++;
    }
}
