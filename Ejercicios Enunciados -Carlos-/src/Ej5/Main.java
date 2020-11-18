//Nº de camas por habitación y planta de la misma
package Ej5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        
        int nHab = 0;
        String planta = "";
        String color = "";
        
        System.out.println("Listado de habitaciones:");
        System.out.println("1.- Azul");
        System.out.println("2.- Roja");
        System.out.println("3.- Verde");
        System.out.println("4.- Rosa");
        System.out.println("5.- Gris");
        System.out.println("Introduzca el número de habitación:");
        int numero = lector.nextInt();
        
        if (numero > 5 || numero < 1){
            System.out.println("ERROR: " + numero + " no está asociado a ninguna habitación");
        } else {
            switch (numero) {
                case 1: 
                    planta = "Primera";
                    nHab = 2;
                    color = "Azul";
                    break;
                case 2:
                    planta = "Primera";
                    nHab = 1;
                    color = "Roja";
                    break;
                case 3:
                    planta = "Segunda";
                    nHab = 3;
                    color = "Verde";
                    break;
                case 4:
                    planta = "Segunda";
                    nHab = 2;
                    color = "Rosa";
                    break;
                case 5:
                    planta = "Tercera";
                    nHab = 1;
                    color = "Gris";
            }
            System.out.println("La habitación " + numero + " " + color + ", tiene " + nHab + " cama/s y está en el piso " + planta);
        }
        
        
    }
}
