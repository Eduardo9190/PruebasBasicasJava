
package Ej4;

import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce un número para calcular su factorial");
        int numero = lector.nextInt();
        
        
        if (numero <0) {
            System.out.println("No existe el factorial de un número negativo");
        } else {
            int i = 0;
            int factorial = 0;
            do {
                factorial = factorial + i;
                i++;
            } while (i < numero);
            System.out.println("El factorial del número es: " + factorial);
        }
        
    }
}
