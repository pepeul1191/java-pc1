package pe.edu.ulima.beans;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Alumno {
    private int codigo;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String dni;
    private Date nacimiento;

    public Alumno(int codigo, String nombres, String apellidoPaterno, String apellidoMaterno, String dni, String nacimiento) {

    }

    @Override
    public String toString() {

    }

    public Date getNacimiento() {
        return nacimiento;
    }
}
