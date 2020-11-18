//Caras de un dado
package Ej4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el valor de una de las caras de un dado de 6 caras:");
        int numero = lector.nextInt();

        if (numero < 1 || numero > 6) {
            System.out.println("ERROR: Número incorrecto");
        } else {
            switch (numero) {
                case 1:
                    System.out.println("La cara opuesta es el seis");
                    break;
                case 2:
                    System.out.println("La cara opuesta es el cinco");
                    break;
                case 3:
                    System.out.println("La cara opuesta es el cuatro");
                    break;
                case 4:
                    System.out.println("La cara opuesta es el tres");
                    break;
                case 5:
                    System.out.println("La cara opuesta es el dos");
                    break;
                case 6:
                    System.out.println("La cara opuesta es el uno");
                    break;
            }
        }
    }
}
