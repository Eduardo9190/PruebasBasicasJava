/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author CES
 */
public class Factorial {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //Imprime en la consola de salida
        System.out.println("Indique el número entero: ");
        //Leemos del teclado
        int numero = leer.nextInt();
        
        if (numero > 0) {
            int i = 1;
            int factorial = numero;
            while (i < numero){
                factorial = factorial * (i+1);
                i++;
                System.out.println(factorial);
            } 
            System.out.println("El factorial del número introducido es: " + factorial);
        } else {
            System.out.println("El número introducido no es entero o positivo");
        }
    }
    
    
}
