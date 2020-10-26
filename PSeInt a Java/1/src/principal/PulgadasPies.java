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
public class PulgadasPies {
    public static void main(String[] args) {
       
        //Objeto para leer del teclado
        Scanner leer = new Scanner (System.in);
        //Imprime en la consola de salida
        System.out.println("Indique la medida en centímetros");
        //Leemos del teclado
        int numero1 = leer.nextInt();
        
        float pulgadas;
        pulgadas = (float) 2.54;
        float pies;
        pies = (float) 12;
        
        float rpulgadas;
        float rpies;
        rpulgadas = numero1 / pulgadas;
        rpies = rpulgadas / pies;
        
        System.out.println("Son " + rpulgadas + " pulgadas y " + rpies + " pies");
        
    }
}
