package Ej5s4;

import java.util.Scanner;

public class Ej5s4 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int arraySize; //Variable para el tamaño de la array
        int sumaTotal = 0;

        System.out.println("Introduce el tamaño de la array:");
        arraySize = lector.nextInt(); // Guardamos el tamaño de la array

        int array[] = new int[arraySize]; //Definimos la array con la variable del tamaño

        System.out.println("Procedemos a rellenar la array");
        for (int i = 0; i < array.length; i++) {
            array[i] = lector.nextInt();  //Guardamos cada valor en su posicion
            sumaTotal += array[i];  //Sumamos todos los valores

        }

        System.out.println("Suma:" + sumaTotal);
    }
}
