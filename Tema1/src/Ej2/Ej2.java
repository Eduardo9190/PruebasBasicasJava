
package Ej2;

import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número para conocer si es par o impar");
        int numero = lector.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
    }
}
