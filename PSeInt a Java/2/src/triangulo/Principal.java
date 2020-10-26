/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

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
        System.out.println("Indique otro lado: ");
        double l3 = lector.nextDouble();
        //Creacion de triangulo
        Triangulo triangulo = new Triangulo (l1,l2,l3);
        //Uso el objeto para el calculo de area y perimetro
        double area = triangulo.getArea();
        double perimetro = triangulo.getPerimetro();
        //Imprimir resultados
        System.out.println("El área del triángulo es: " + area);
        System.out.println("El perímetro del triángulo es: " + perimetro);
    }  
}

