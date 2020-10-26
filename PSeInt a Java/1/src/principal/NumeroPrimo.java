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
public class NumeroPrimo {

    public static void main(String[] args) {

        //Objeto para leer del teclado
        Scanner leer = new Scanner(System.in);
        //Imprime en la consola de salida
        System.out.println("Indique un número");
        //Leemos del teclado
        int numero1 = leer.nextInt();

        int contador = 2;
        boolean primo = true;

        while ((primo) && (contador != numero1)) {
            if (numero1 % contador == 0) {
                primo = false;
            }
            contador++;
        } 
        if (primo == false) {
            System.out.println("El número no es primo");
        } else {
            System.out.println("El número es primo");
        }
    }
}