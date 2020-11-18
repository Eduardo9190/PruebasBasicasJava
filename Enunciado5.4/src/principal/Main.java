package principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaración de las variables a usar
        Scanner teclado;
        String [] listaNumeros;
        String numerosTeclado;
        int suma=0;
        // Inicialización de las variables
        teclado = new Scanner (System.in);
        System.out.println("Indique varios número separados por coma, no deje espacios");
        numerosTeclado = teclado.nextLine();
        listaNumeros = numerosTeclado.split(",");
        // Sumo los números 
        for (String n : listaNumeros) {             
            System.out.println("n vale en esta vuelta: "+ n);
            System.out.print("La suma de n a "+ suma + " es: ");
            System.out.print(suma += Integer.parseInt(n));
            System.out.println("\n");
        }
        // Imprimo la suma en pantalla
        System.out.println("La suma es: "
                + suma);
        
        
    }

}
