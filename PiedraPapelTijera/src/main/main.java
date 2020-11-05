
package main;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        int usuario;
        int maquina;
        String jmaquina;
        String jusuario;
        int i = 0;
        int j = 0;
        int k = 0;
        
        System.out.println("Bienvenido a Piedra, Papel o Tijera:");
        
        do  {
        
            System.out.println("Elige tu opción:");
            System.out.println("1.- Piedra");
            System.out.println("2.- Papel");
            System.out.println("3.- Tijeras");
            usuario = lector.nextInt();
            
            if (usuario < 1 || usuario > 3) {
                System.out.println("Valor erroneo");
            }
        
        maquina = (int) (Math.random()*3);
        if (maquina == 0) {
            jmaquina = "piedra";
        } else {
            if (maquina == 1){
                jmaquina = "papel";
            }  else  {
                jmaquina = "tijera";
            }
        }
        
        if (usuario == 1) {
            jusuario = "piedra";
        } else {
            if (usuario == 2) {
                jusuario = "papel";
            } else {
                jusuario = "tijera";
            }
        }
        
        if (jmaquina.contentEquals(jusuario)) {
            System.out.println("Has empatado");
            k++;
        } else {
            if ((usuario == 1) && (maquina == 2)) {
                System.out.println("Piedra gana a tijeras");
                System.out.println("Usuario gana");
                i++;
            } else {
                if ((usuario == 1) && (maquina == 1)){
                    System.out.println("Papel gana a piedra");
                    System.out.println("La máquina gana");
                    j++;
                }
            }
            if ((usuario == 2) && (maquina == 1)) {
                System.out.println("Papel gana a pidra");
                System.out.println("El usuario gana");
                i++;
            } else {
                if ((usuario == 2) && (maquina == 2)) {
                    System.out.println("Tijeras ganan a papel");
                    System.out.println("La máquina gana");
                    j++;
                }
            }
            if ((usuario == 3) && (maquina == 0)) {
                System.out.println("Piedra gana a tijeras");
                System.out.println("La máquina gana");
                j++;
            } else {
                if ((usuario == 3) && (maquina == 1)) {
                    System.out.println("Tijeras ganan a papel");
                    System.out.println("El usuario gana");
                    i++;
                }
            }
            
        }
        } while ((i <= 5) || (j <= 5));
        
        if (i == 5){
            System.out.println("El usuario ha ganado, felicidades");
            System.out.println("Has jugado " + (i+j+k) + " partidas");
            System.out.println(i + " victorias");
            System.out.println(j + " derrotas");
            System.out.println(k + "empates");
        } else {
            System.out.println("El usuario ha perdido, qué lástima");
            System.out.println("Has jugado " + (i+j+k) + " partidas");
            System.out.println(i + " victorias");
            System.out.println(j + " derrotas");
            System.out.println(k + "empates");  
        }
        
    }
}
