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
public class ParImpar {
    
    public static void main(String[] args) {
 
        //Objeto para leer del teclado
        Scanner leer = new Scanner (System.in);
        //Imprime en la consola de salida
        System.out.println("Indique el primer número");
        //Leemos del teclado
        int numero1 = leer.nextInt();
        int r;
        
        r = numero1%2;
        if (r == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}