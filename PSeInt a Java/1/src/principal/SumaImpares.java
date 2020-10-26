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
public class SumaImpares {
    public static void main(String[] args) {
      
        //Objeto para leer del teclado
        Scanner leer = new Scanner (System.in);
        //Imprime en la consola de salida
        System.out.println("Indique un número");
        //Leemos del teclado
        int numero1 = leer.nextInt();
        
        
        int r;
        int resultado = 0;
        int i = 1;
        
        r = numero1%2;
        if (r == 0) {
            do {
                resultado = resultado + i;
                i = i + 2;
            } while (i != numero1 - 1);
            System.out.println("El resultado de la suma es " + resultado);
        } else {
            do {
                resultado = resultado + i;
                i = i + 2;
            } while (i != numero1);
            System.out.println("El resultado de la suma es " + resultado);
        }
        
    }
}
