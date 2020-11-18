package contactos;

import java.util.Scanner;


public class principal {
    
public static void main(String[] args) {
        //Array de 50 contactos
        Contacto [] listadoContactos = new Contacto [50];
        //Lector de consola
        Scanner lector = new Scanner (System.in);
        
        int opcion = 0;
        int posicion = 0;
        do {
        do {
            System.out.println("1.- Crear contacto");
            System.out.println("2.- Imprimir lista de contactos");
            System.out.println("3.- Salir");
            System.out.println("Indique la opción elegida: ");
            opcion = lector.nextInt();
            lector.nextLine();
        } while (opcion < 1 || opcion > 3);
        switch (opcion) {
            case 1: { 
                if (posicion <= 49){
                System.out.println("Introduce el nombre del contacto:");
                String nombre = lector.nextLine ();
                System.out.println("Introduce el teléfono del contacto: ");
                String telefono = lector.nextLine ();
                System.out.println("Introduce el email del contacto: ");
                String email = lector.nextLine ();
                
                
                //Crear el objeto contacto
                Contacto contacto = new Contacto (nombre,telefono,email);
                //Añado el contacto al Array y aumento la posición de escritura del Array
                listadoContactos[posicion] = contacto;
                posicion++;
                } else {
                    System.out.println("La lista de contactos esta llena");
                } 
                break;
            }
            case 2: {
                System.out.println(posicion);
                if (posicion > 0) {
                    for (int i = 0; i < posicion; i++) {
                        System.out.println(listadoContactos[i].toString());
                    }
                } else {
                    System.out.println("No hay contactos en la lista");
                }
            }  
        }
    } while (opcion > 0 && opcion < 3);
}
}
