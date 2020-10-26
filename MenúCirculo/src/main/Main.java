
package main;

import java.util.Scanner;
import poligonos.Circulo;


public class Main {
    
    public static void main(String[] args) {
        //Variable de tipo Circulo que sirve para almacenar un objeto de ese tipo y poder preguntarle por su área y perímetro
        Circulo circulo = null;
        //Contiene la opción elegida por el usuario
        int opcion;
        //Se crea el menú y las opciones del mismo
        do {
            //Relleno la opción llamando al método que solicita una opción al usuario
            opcion = menu();
            switch (opcion) {
                case 1:
                    circulo = crearCirculo();
                    break;
                    
                case 2: 
                    if (circulo != null) {
                        System.out.println("El área es: " + circulo.getArea());
                    }else {
                        System.out.println("No hay ningún círculo creado");
                    }
                    break;
                    
                case 3:
                    if (circulo != null) {
                        System.out.println("El área es: " + circulo.getPerimetro());
                    }else {
                        System.out.println("No hay ningún círculo creado");
                    }
                    break;
                    
            }
        }while (true);
    }
    
    static Circulo crearCirculo(){
        Scanner lector = new Scanner (System.in);
        double radio;
        //Pregunta valor del radio y lo comprueba
        do {
            System.out.println("Indique el radio del círculo: ");
            radio = lector.nextDouble();
        } while (radio < 1);
        //Una vez obtenido el radio instancio un objeto Circulo para devolverselo a quien lo ha llamado 
       Circulo circulo = new Circulo(radio);
        //Constructor del circulo con el radio dado
        return circulo;
    }
    
    
    static int menu(){
        
        Scanner lector = new Scanner (System.in);
        int opcion;
        //Muestra el menú y comprueba que la opción sea válida
        do {
            System.out.println("1.- Crear círculo");
            System.out.println("2.- Ver el área");
            System.out.println("3.- Ver el perímetro");
            System.out.println("4.- Salir del menú");
            opcion = lector.nextInt();
            
        } while (opcion < 1 || opcion > 4);
        lector = null;
        return opcion;
    }
}
