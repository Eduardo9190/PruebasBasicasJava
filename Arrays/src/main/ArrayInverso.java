package main;

import java.util.Scanner;


public class ArrayInverso {
    
    public static void main(String[] args) {
        
        int [] numeros = {23,6,54,3,4,5,78,9};
        
        int [] inverso = new int [numeros.length];
        
        int j = numeros.length-1;
        
        for (int i = 0; i < 8; i++) {
            inverso [j] = numeros [i];
            j--;
        }
        
        for (int i = 0; i < 8; i++){
            numeros [i] = inverso [i];
            System.out.println("Posición " + i + " valor " + numeros[i]);
        }
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un valor");
        int valor = leer.nextInt();
        
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros [i] == valor) {
                System.out.println("Se ha encontrado su valor en la posición: " + i);
            } else {
                System.out.println("No se ha encontrado su valor");
            }
        }
        
        
        
    }
}
