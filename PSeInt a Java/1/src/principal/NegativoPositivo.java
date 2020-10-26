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
public class NegativoPositivo {
    public static void main(String[] args) {
        
        //Objeto para leer del teclado
        Scanner leer = new Scanner (System.in);
        //Imprime en la consola de salida
        System.out.println("Indique un número");
        //Leemos del teclado
        int numero1 = leer.nextInt();
        
        if (numero1 == 0) {
            System.out.println("El número introducido es 0");
        } else {
            if (numero1 > 0) {
                System.out.println("El número es positivo");
            } else {
                System.out.println("El número es negativo");
            }
        }
    }
}
