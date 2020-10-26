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
public class SumaNumerosPrimos {
    public static void main(String[] args) {
		int inicio, fin, contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el inicio:");
		inicio = sc.nextInt();
		System.out.println("Escribe el fin:");
		fin = sc.nextInt();
                int resultado = 0;
                
		for (int x = inicio; x <= fin; x++) {
			if (esPrimo(x)) {
				contador++;
				System.out.print(String.valueOf(x) + ",");
                                resultado = resultado + x;
			}
		}
		sc.close();
                System.out.println(" La suma de todos los números primos comprendidos es: " + resultado);
	}

	public static boolean esPrimo(int numero) {
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			if (numero % x == 0)
				return false;
		}
		return true;
	}
}

