/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author profe tardes
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] listadoNumeros = new int[5];
        Scanner teclado = new Scanner(System.in);
        int j = 0;//Se usa para recorrer el Array en el while y sacar el número de leidos

        //Lectura por teclado de los números para construir primeo el Array
        for(int i=0; i<5 ; i++){
            System.out.println("Introduzca el número "+(i+1)+" de 5");
            listadoNumeros[i]=teclado.nextInt();
        }
        System.out.println("***************************************");
        //Recorremos el Array hasta encontrar un número negativo o el final
        //La condicion de seguir es que j sea menor que el tamaño del Array
        // y que el númeo en la posición j sea positivo
        while (j<listadoNumeros.length && listadoNumeros[j]>=0){
            System.out.println(listadoNumeros[j]);
            j=j+1;
        }
        
        System.out.println("El total de números impresos es: "+j);
    }
    
}
