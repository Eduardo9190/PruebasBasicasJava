/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author CES
 */
public class Principal {
    public static void main(String[] args) {
        //Lectura de datos
        Scanner lector = new Scanner (System.in);
        System.out.println("Indique un lado: ");
        double l1 = lector.nextDouble();
        System.out.println("Indique el otro lado: ");
        double l2 = lector.nextDouble();
        //Creacion de rectangulo
        Rectangulo rectangulo = new Rectangulo (l1,l2);
        //Uso el objeto para el calculo de area y perimetro
        double area = rectangulo.getArea();
        double perimetro = rectangulo.getPerimetro();
        //Imprimir resultados
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }  
}
