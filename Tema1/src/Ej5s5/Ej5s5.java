package Ej5s5;

import java.util.Scanner;

public class Ej5s5 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce en tamaño del array");
        int arraySize = lector.nextInt();
        String listado[] = new String[arraySize+1];
        //lector.nextInt();
        System.out.println("Introduce los nombres");
        
        int contador = 0;
        int max = 0;
        
        for (int i = 0; i < listado.length; i++) {
            listado[i] = lector.nextLine();
            
            String sPalabra = listado[i];

            //Contar las vocales de la palabra en concreto
            for (int x = 0; x < sPalabra.length(); x++) {
                if ((sPalabra.charAt(x) == 'a') || (sPalabra.charAt(x) == 'e') || (sPalabra.charAt(x) == 'i') || (sPalabra.charAt(x) == 'o') || (sPalabra.charAt(x) == 'u')) {
                    contador++;
                }
                if (contador > max){
                    max = contador;
                }
            }
        }

        System.out.println("La palabra con más vocales tiene: " + max);
    }
}
