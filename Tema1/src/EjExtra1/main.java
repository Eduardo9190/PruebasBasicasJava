//Programa para hacer triangulos segun en tamaño de fila máximo indicado por el usuario
package EjExtra1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el tamaño del triángulo");
        int nFilas = lector.nextInt();
        String asterisco = "";
        
        //Parte superior
        for (int i = 0; i < nFilas; i++){
            asterisco +="*";
            System.out.println(asterisco);
        }
        
        //Parte inferior
        for (int j = nFilas-1; j > 0; j--){
            asterisco = asterisco.substring(0,j); //Acortamiento del String
            System.out.println(asterisco);
        }
    }
}
