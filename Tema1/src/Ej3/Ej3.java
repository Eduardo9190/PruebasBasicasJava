
package Ej3;

import java.util.Calendar;


public class Ej3 {
    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        
        if ((hora > 21) && (hora < 6)) {
            System.out.println("Buenas noches");
        } else {
            if ((hora >= 6) && (hora <= 12)) {
                System.out.println("Buenos días");
            } else {
                System.out.println("Buenas tardes");
            }
        }
        
    }
}
