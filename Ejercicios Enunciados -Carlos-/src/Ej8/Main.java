//Descuentos en un almacen
package Ej8;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduzca el precio del artículo");
        double precio = lector.nextDouble();
        System.out.println("Introduzca el número de artículos");
        int cantidad = lector.nextInt();
        double suma;
        double total;
        double descuento;
        
        
        if (cantidad <= 0) {
            System.out.println("La cantidad introducida no es válida");
        }
        
        if (precio <= 0) {
            System.out.println("El precio introducido no es válido");
        }
        
        if (cantidad >= 10 && cantidad <= 24) {
            //Descuento 10%
            suma = cantidad * precio;
            descuento = (10 * suma) / 100;
            total = suma - descuento;
            System.out.println("El total sin descuento asciende a: " + (double)Math.round(suma * 100d) / 100d + " euros");
            System.out.println("Se le ha aplicado un descuento del 10%");
            System.out.println("El importe del descuento es de: " + (double)Math.round(descuento * 100d) / 100d + " euros");
            System.out.println("El total con el descuento asciende a: " + (double)Math.round(total * 100d) / 100d + " euros");
        }
        if (cantidad >= 25 && cantidad <= 100) {
            //Descuento 20%
            suma = cantidad * precio;
            descuento = (20 * suma) / 100;
            total = suma - descuento;
            System.out.println("El total sin descuento asciende a: " + (double)Math.round(suma * 100d) / 100d + " euros");
            System.out.println("Se le ha aplicado un descuento del 20%");
            System.out.println("El importe del descuento es de: " + (double)Math.round(descuento * 100d) / 100d + " euros");
            System.out.println("El total con el descuento asciende a: " + (double)Math.round(total * 100d) / 100d + " euros");
        }
        if (cantidad > 100) {
            //Descuento 40%
            suma = cantidad * precio;
            descuento = (40 * suma) / 100;
            total = suma - descuento;
            System.out.println("El total sin descuento asciende a: " + (double)Math.round(suma * 100d) / 100d + " euros");
            System.out.println("Se le ha aplicado un descuento del 40%");
            System.out.println("El importe del descuento es de: " + (double)Math.round(descuento * 100d) / 100d + " euros");
            System.out.println("El total con el descuento asciende a: " + (double)Math.round(total * 100d) / 100d + " euros");
        }
        
    }
}
