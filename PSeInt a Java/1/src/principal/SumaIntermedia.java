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
public class SumaIntermedia {
    
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
        int suma = 0;
        
        if (numero1 != numero2) {
            if (numero1 > numero2) {
                int i = numero2;
                do{
                    suma = suma + i;
                    i=i+1;
                }while(i<numero1);  
                System.out.println("El resultado es " + suma);
            } else {
                int i = numero1;
                do{
                    suma = suma + i;
                    i=i+1;
                }while(i<numero2);  
                System.out.println("El resultado es " + suma);
            } 
            } else {
            System.out.println("Los números son iguales");
        }
        
        
        
    }
}
