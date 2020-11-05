
package Ej5s2;


public class Ej5s2 {
    public static void main(String[] args) {
        
        String[] listado = new String[]{"Ana","Esther","Eduardo","May","Aleksander","Emma"};
        int numero;
        int max = 0;
        String valor;
        
        for (int x=0; x<listado.length; x++) {
            valor = listado[x];
            numero = valor.length();
            if (numero > max) {
                max = numero;
            }
        }
        System.out.println("El String más largo tiene " + max + " caracteres");
    }
}
