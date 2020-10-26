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
public class CalificacionesNuméricas {

    public static void main(String[] args) {

        //Objeto para leer del teclado
        Scanner leer = new Scanner(System.in);
        //Imprime en la consola de salida
        System.out.println("Indique la nota");
        //Leemos del teclado
        int nota = leer.nextInt();

        if ((nota >= 1) && (nota <= 20)) {
            switch (nota) {
                case 1:
                    System.out.println("E");
                    break;

                case 2:
                    System.out.println("E");
                    break;

                case 3:
                    System.out.println("E");
                    break;

                case 4:
                    System.out.println("E");
                    break;

                case 5:
                    System.out.println("E");
                    break;

                case 6:
                    System.out.println("E");
                    break;

                case 7:
                    System.out.println("E");
                    break;

                case 8:
                    System.out.println("E");
                    break;

                case 9:
                    System.out.println("E");
                    break;

                case 10:
                    System.out.println("D");
                    break;

                case 11:
                    System.out.println("D");
                    break;

                case 12:
                    System.out.println("D");
                    break;

                case 13:
                    System.out.println("C");
                    break;

                case 14:
                    System.out.println("C");
                    break;

                case 15:
                    System.out.println("C");
                    break;

                case 16:
                    System.out.println("B");
                    break;

                case 17:
                    System.out.println("B");
                    break;

                case 18:
                    System.out.println("B");
                    break;

                case 19:
                    System.out.println("A");
                    break;

                case 20:
                    System.out.println("A");
                    break;
            }
        } else {
            System.out.println("El valor introducido no está comprendido entre los valores disponibles");
        }
    }
}
