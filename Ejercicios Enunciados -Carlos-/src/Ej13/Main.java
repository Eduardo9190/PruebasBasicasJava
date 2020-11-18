//Notas y numero de alumnos
package Ej13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int numero = 0;
        
        do {
            System.out.println("Introduce el número de alumnos de la clase: ");
            numero = lector.nextInt();
        } while (numero < 5 || numero > 30);
        
        int aprobados = 0;
        int suspensos = 0;
        double auxMedia = 0;
        double media;
        int[] notasAlumnos = new int[numero];


        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.println("Introduzca las notas de los alumnos: ");
            int nota = lector.nextInt();
            if (nota > 10 || nota < 0) {
                System.out.println("La nota introducida es erronea");
            } else {
                notasAlumnos[i] = nota;
            }
        }

        for (int j = 0; j < notasAlumnos.length; j++) {
            if (notasAlumnos[j] >= 5) {
                aprobados += 1;
            } else {
                suspensos += 1;
            }
        }
        System.out.println("Hay " + aprobados + " alumnos aprobados y " + suspensos + " alumnos suspensos");

        for (int k = 0; k < notasAlumnos.length; k++) {
            auxMedia += notasAlumnos[k];
        }
        media = auxMedia / notasAlumnos.length;
        System.out.println("La nota media de la clase es: " + (double) Math.round(media * 100d) / 100d);

    }
}
