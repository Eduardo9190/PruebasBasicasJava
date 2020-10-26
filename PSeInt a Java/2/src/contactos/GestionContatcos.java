/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactos;


import contactos.Contacto;
import java.util.Scanner;

/**
 *
 * @author CES
 */
public class GestionContatcos {
    
    public static void main(String[] args) {
        
        //Leer nombre del contacto nuevo
        Scanner lector = new Scanner (System.in);
        System.out.println("Indique el nombre del contacto: ");
        String n = lector.nextLine();
        System.out.println("Indique los apellidos del contacto: ");
        String a = lector.nextLine();
        System.out.println("Indique la edad del contacto: ");
        int e = lector.nextInt();
                lector.nextLine();
        System.out.println("Indique el email del contacto: ");
        String b = lector.nextLine();
        System.out.println("Indique el teléfono del contacto: ");
        String t = lector.nextLine();
        
        
        //Crear contacto y darle nombre
        Contacto contacto1 = new Contacto();
            contacto1.setNombre(n);
            contacto1.setApellido(a);
            contacto1.setEdad(e);
            contacto1.setEmail(b);
            contacto1.setTelefono(t);

            
        Contacto contacto2 = new Contacto();
            contacto2.setNombre(n);
            contacto1.setApellido(a);
            contacto1.setEdad(e);
            contacto1.setEmail(b);
            contacto1.setTelefono(t);
        
            
        contacto1.imprimeDatos();
        
        contacto2.imprimeDatos();
        
    }
    
    
    
}
