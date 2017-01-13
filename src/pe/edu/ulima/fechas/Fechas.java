
package pe.edu.ulima.fechas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fechas {

    public static void main(String[] args){
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Calendar cal = Calendar.getInstance();
        
        String string = "July 22, 1988";
        Date date1 = null;
        try {
            date1 = format.parse(string);
        } catch (ParseException ex) {
            Logger.getLogger(Fechas.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        String string2 = "February 22, 2010";
        Date date2 = null;
        try {
            date2 = format.parse(string2);
        } catch (ParseException ex) {
            Logger.getLogger(Fechas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(date1.before(date2)){
            System.out.println(date2.toString());
            cal.setTime(date2);
            System.out.println(cal.get(Calendar.MONTH));
            System.out.println(cal.get(Calendar.YEAR));
            System.out.println(cal.get(Calendar.DATE));
        }
    }
    
}
