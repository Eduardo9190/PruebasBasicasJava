//Pedir una frase al usuario y devolverla escrita en orden inverso
package EjExtra2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String fraseOriginal = lector.nextLine();
        String fraseInvertida = "";
        
        for (int x = fraseOriginal.length() - 1; x >= 0; x--) {
            fraseInvertida = fraseInvertida + fraseOriginal.charAt(x);
        }
        System.out.println(fraseInvertida);
    }
}
