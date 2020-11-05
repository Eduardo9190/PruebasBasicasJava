
package Ej5;


public class Ej5 {
    public static void main(String[] args) {
        
        int[] intListado = new int[]{ 10,6,7,9,2,1,8 };
        
        int resultado = 0;
        int media;
        int i = 0;
        do {
            resultado += intListado[i];
            i++;
        } while (i < intListado.length);
        System.out.println("La suma total del array es: " + resultado);
        
        media = resultado / intListado.length;
        System.out.println("La media de los números del array es: " + media);
    }
}
