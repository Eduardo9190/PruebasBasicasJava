/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author CES
 */
public class LadosTriangulos {
    public static void main(String[] args) {
        
        //Objeto para leer del teclado
        Scanner leer = new Scanner (System.in);
        //Imprime en la consola de salida
        System.out.println("Indique el primer número");
        //Leemos del teclado
        int lado1 = leer.nextInt();
        
        //Imprime en la consola de salida
        System.out.println("Indique el segundo número");
        //Leemos del teclado
        int lado2 = leer.nextInt();
        
        //Imprime en la consola de salida
        System.out.println("Indique el segundo número");
        //Leemos del teclado
        int lado3 = leer.nextInt();
        
        if ((lado1 == 0) || (lado2 == 0) || (lado3 == 0)) {
            System.out.println("La longitud de un lado no puede ser 0");
        }
        
        double s = (lado1 + lado2 + lado3)/2;
        
        double a = (s * (s - lado1) * (s - lado2) * (s - lado3));
        if (a < 0) {
            a = a * -1;
            System.out.println("El área del triángulo es: " + Math.sqrt(a));
        } else {
            System.out.println("El área del triángulo es: " + Math.sqrt(a));
        }
    }
}
