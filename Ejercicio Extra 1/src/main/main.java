/* Ejercicio extra de hacer un menu de una agenda electronica
* 3 apartados, introducir contacto, listarlos y salir.
* Añadir contactos icluye nombre, apellidos y email.
 */
package main;

// Imports necesarios 
import java.util.*;

public class main {

    public static void main(String[] args) {

        String mainMenu = ("Elija una opción: \n"
                + "1.- Añadir contacto nuevo \n"
                + "2.- Mostrar lista de contacto \n"
                + "3.- Salir");

        ArrayList<String> listado = new ArrayList<>();

        System.out.println(mainMenu);
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();

        while (opcion < 1 || opcion > 3) {
            System.out.print("\nError! Opción no válida.\n");
            System.out.println(mainMenu);
            opcion = leer.nextInt();
        }

        while (opcion != 3) {

            System.out.println(mainMenu);
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("Para crear un nuevo contacto, introduzca los siguientes datos: ");
                    
                    System.out.println("Nombre: ");
                    String nombre = leer.nextLine();
                    
                    System.out.println("Apellidos: ");
                    String apellidos = leer.nextLine();
                    
                    System.out.println("Email: ");
                    String email = leer.nextLine();

                    listado.add(nombre + " " + apellidos + " " + email);

                    break;

                case 2:

                    System.out.println(listado);

                    break;

                case 3:
                    break;
            }
        }
    }
}
