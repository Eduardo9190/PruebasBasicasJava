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
public class TresValores {
    public static void main(String[] args) {
        
//Objeto para leer del teclado
        Scanner leer = new Scanner(System.in);
        //Imprime en la consola de salida
        System.out.println("Indique un número");
        //Leemos del teclado
        int numero1 = leer.nextInt();
        
        System.out.println("Indique otro número");
        //Leemos del teclado
        int numero2 = leer.nextInt();

        System.out.println("Indique otro número");
        //Leemos del teclado
        int numero3 = leer.nextInt();
        
        
        if ((numero1 == numero2) || (numero2 == numero3) || (numero1 == numero3)) {
            System.out.println("Alguno de los numeros son iguales");
        } else {
            if ((numero1 > numero2) && (numero1 > numero3)) {
                System.out.println("El número " + numero1 + " es el mayor");
            } else {
                if ((numero2 > numero1) && (numero2 > numero3)) {
                    System.out.println("El número " + numero2 + " es el mayor");
                } else {
                    if ((numero3 > numero1) && (numero3 > numero2)) {
                        System.out.println("El número " + numero3 + " es el mayor");
                    }
                }
            }
        }
    }
}
