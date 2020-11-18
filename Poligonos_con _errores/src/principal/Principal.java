
package principal;

import java.util.ArrayList;
import poligonos.*;


public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList <Poligono> listaPoligonos;
        
        // Creamos varios polígonos
        
        Poligono circulo1 = new Circulo(3);
        Poligono circulo2 = new Circulo(4.5);
        Rectangulo rectangulo1 = new Rectangulo (3,5);
        Poligono rectangulo2 = new Rectangulo (2.4,5);
        Triangulo triangulo1 = new Triangulo (3,7);
        
        listaPoligonos=new ArrayList();
        listaPoligonos.add(circulo1);       
        listaPoligonos.add(circulo2);       
        listaPoligonos.add(rectangulo1);       
        listaPoligonos.add(rectangulo2);       
        listaPoligonos.add(triangulo1); 
        
        double sumaArea = 0,sumaPerimetro = 0;
        for (Poligono p: listaPoligonos){
            sumaArea += p.area();
            sumaPerimetro += p.perimetro();
        }
        
        System.out.println("El total de area es: " 
                + sumaArea);
        System.out.println("El total de perimetro es: "
                + sumaPerimetro);
        
    }
    
}
