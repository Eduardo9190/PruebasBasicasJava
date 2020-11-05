//Dado un string por el usuario, ordenar los caracteres por su valor ASCII
package EjExtra3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String fraseObtenida = lector.nextLine();
        

        for (int i = 0; i < fraseObtenida.length(); i++) {
            char letra = fraseObtenida.charAt(i);
            int valorAscii = (int) letra;
            System.out.print(valorAscii+", ");
        }
        System.out.println("");
    }
}
