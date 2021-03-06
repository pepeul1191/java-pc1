
package pe.edu.ulima.gestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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
    
    public Alumno[] mayorYMenor(){
        Alumno[] rpta = new Alumno[2];
        rpta[0] = this.menor();
        rpta[1] = this.mayor();
        
        return rpta;
    }
    
    public Alumno menor(){
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Alumno alumnoMenor = null;
        String string = "July 22, 1900";
        Date dateMenor = null;
        
        try {
            dateMenor = format.parse(string);
        } catch (ParseException ex) {
            Logger.getLogger(Gestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Alumno a : alumnos){
            if(a != null){
                if(a.getNacimiento().after(dateMenor)){
                    dateMenor = a.getNacimiento();
                    alumnoMenor = a;
                }
            }
        }
        
        return alumnoMenor;
    }
    
    public Alumno mayor(){
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Alumno alumnoMayor = null;
        String string = "July 22, 2050";
        Date dateMayor = null;
        
        try {
            dateMayor = format.parse(string); 
        } catch (ParseException ex) {
            Logger.getLogger(Gestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Alumno a : alumnos){
            if(a != null){
                if(a.getNacimiento().before(dateMayor)){
                    dateMayor = a.getNacimiento();
                    alumnoMayor = a;
                }
            }
        }
        
        return alumnoMayor;
    }
    
    public int[] cantidadVocales(){
        int[] rpta = new int[5];
        for(Alumno a : alumnos){
            if(a != null){
                String nombre = a.getNombres() + a.getApellidoPaterno() + a.getApellidoMaterno();
                for(int k = 0; k < nombre.length(); k++){
                    char caracter = nombre.charAt(k);
                    switch(caracter) {
                        case 'a' :
                           int tA = rpta[0];
                           tA = tA + 1;
                           rpta[0] = tA;
                           break;
                        case 'e' :
                           int tE = rpta[1];
                           tE = tE + 1;
                           rpta[1] = tE;
                           break;
                        case 'i' :
                           int tI = rpta[2];
                           tI = tI + 1;
                           rpta[2] = tI;
                           break;
                        case 'o' :
                           int tO = rpta[3];
                           tO = tO + 1;
                           rpta[3] = tO;
                           break;
                        case 'u' :
                           int tU = rpta[4];
                           tU = tU + 1;
                           rpta[4] = tU;
                           break;
                     }
                }
            }
        }
        
        return rpta;
    }
}
