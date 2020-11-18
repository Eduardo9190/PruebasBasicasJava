package Ej3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int suma = 0;
        
        
        do {
            System.out.println("Introduce un número:");
            int numero = lector.nextInt();

            if (numero > 30) {
                System.out.println("El número introducido ya es mayor que 30");
            } else {
                suma += numero;
                System.out.println("La suma total es: " + suma);
            }
        } while (suma <= 30);
        
        System.out.println("Se ha llegado al valor límite (30)");
    }
}
