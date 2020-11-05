
package Ej1;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce un número para conocer su cuadrado");
        int numero = lector.nextInt();
        
        int cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        
    }
}
