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
public class HorasDelDia {
    public static void main(String[] args) {
       
        //Objeto para leer del teclado
        Scanner leer = new Scanner (System.in);
        //Imprime en la consola de salida
        System.out.println("Indique un número");
        //Leemos del teclado
        int hora = leer.nextInt();
        
        
        if (hora > 6 && hora < 12) {
            System.out.println("Buenos días");
        } else {
            if (hora >= 12 && hora <= 20){
                System.out.println("Buenas tardes");
            } else {
                if ((hora > 20 && hora <= 24) || (hora >= 0 && hora < 6)) {
                    System.out.println("Buenas noches");
                } else {
                    System.out.println("Te has confundido al introducir la hora");
                }
            }        
        }
    }
}
