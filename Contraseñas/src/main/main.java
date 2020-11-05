package main;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String password = "123456789";
        String passwordExterna = "";
        int i = 0;


        do {
            System.out.println("Introduzca la contraseña para acceder:");
            passwordExterna = lector.nextLine();
            if (password.contentEquals(passwordExterna)) {
                System.out.println("Bienvenido al sistema");
                i = 3;
            } else {
                System.out.println("Contraseña erronea");
                i++;
                if (i == 3){
                    System.out.println("Cuenta bloqueada");
                }
            }
        } while (i != 3);
    }
}