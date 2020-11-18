//Creación de secuencias
package Ej16;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Elige una opción entre 1 y 5");
        int opcion = lector.nextInt();
        
        if (opcion < 1 || opcion > 5) {
            System.out.println("La opción elegida no es válida");
        }
        
        String secPrim = "";
        String secSeg = "";
        String secTerc = "";
        String secCuar = "";
        String secQuint = "";
        
        switch (opcion) {
            case 1:
                for (int i = 1; i < 20; i++) {
                    secPrim += i + " ";
                }
                System.out.println(secPrim);
                break;
            case 2: 
                int val1 = 1;
                int valor1;
                secSeg += val1 + " ";
                for (int i = 1; i <= 9; i++) {
                    valor1 = 2*i+1;
                    secSeg += valor1 + " ";
                }
                System.out.println(secSeg);
                break;
            case 3:
                int valor2;
                for (int i = 1; i < 11; i++) {
                    valor2 = i*5;
                    secTerc += valor2 + " ";   
                }
                System.out.println(secTerc);
                break;
            case 4:
                int val3 = 100;
                int valor3;
                secCuar = val3 + " ";
                for (int i = 1; i <= 10; i++) {
                    valor3 = val3 - i*10;
                    secCuar += valor3 + " ";
                }
                System.out.println(secCuar);
                break;
            case 5:
                int val4 = 2;
                int valor4;
                for (int i = 1; i <=13; i++) {
                    valor4 = val4 *i;
                    secQuint += valor4 + " ";
                }
                System.out.println(secQuint);    
        }
    }
}
