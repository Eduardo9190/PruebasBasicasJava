/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactos;

/**
 *
 * @author CES
 */
public class Contacto {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
    private String telefono;
    
    
    public Contacto () {
    
    }    
    
    public Contacto(String apellidos, String nombre, int edad, String email, String telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }
    
    
    public void setNombre (String n) {
        nombre=n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido (String a) {
        apellidos=a;
    }
    
    public String getApellido(){
        return apellidos;
    }
    
    public void setEdad (int e) {
        edad=e;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEmail (String b) {
        email=b;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setTelefono (String t) {
        telefono=t;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    
    
    public void imprimeDatos() {
        System.out.println("Nombre: " + nombre "\n" 
            + "Apellidos: " + apellidos + "\n" + "Edad: " 
            + edad + "\n" + "Email: " + email + "\n" 
            + "Teléfono: " + telefono + "\n");
    }
    
    
}
