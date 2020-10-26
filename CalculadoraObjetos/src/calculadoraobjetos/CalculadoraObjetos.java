package calculadoraobjetos;

import java.util.Scanner;
import principal.Operaciones;


public class CalculadoraObjetos {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int operando1, operando2;
        int opcion;
        Operaciones operacion = new Operaciones();
        //Bucle del programa principal
        do {
            //Mostrar el menu
            do {
                System.out.println("1.- Suma");
                System.out.println("2.- Resta");
                System.out.println("3.- Multiplicación");
                System.out.println("4.- División");
                System.out.println("5.- Salir");
                System.out.println("Indique la opción que desee: ");
                opcion = lector.nextInt();
                System.out.println("Indique el primer número: ");
                operando1 = lector.nextInt();
                System.out.println("Indique el segundo número: ");
                operando2 = lector.nextInt();
                
                switch (opcion) {
                    case 1: 
                        System.out.println("La suma es: " + operacion.suma(operando1,operando2));
                        break;
                    case 2:
                        System.out.println("La resta es: " + operacion.resta(operando1,operando2));
                        break;
                    case 3:
                        System.out.println("La multiplicación es: " + operacion.multiplica(operando1,operando2));
                        break;
                    case 4:
                        System.out.println("La división es: " + operacion.divide(operando1,operando2));
                        break;
                }
            } while (opcion != 5);
        } while (opcion != 5);
        
    }
}
