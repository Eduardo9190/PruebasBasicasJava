/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Eduardo Herencias Paco
 */
public class DosNumeros {
    
    public static void main(String[] args) {
        //Objeto para leer del teclado
        Scanner leer = new Scanner (System.in);
        //Imprime en la consola de salida
        System.out.println("Indique el primer número");
        //Leemos del teclado
        int numero1 = leer.nextInt();
        
        //Imprime en la consola de salida
        System.out.println("Indique el segundo número");
        //Leemos del teclado
        int numero2 = leer.nextInt();
        
        //Comparación de los números
        if (numero1 != numero2) {
            if (numero1 > numero2) {
                System.out.println("El número " + numero1 + " es mayor que el número " + numero2);
            } else {
                System.out.println("El número " + numero2 + " es mayor que el número " + numero1);
            }
        } else {
            System.out.println("Los números introducidos son iguales");
        }
                
    }
    
    
}
