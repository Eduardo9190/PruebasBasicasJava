//Tirar dos dados y que el programa supere el resultado el jugador
package Ej21;

public class Main {

    public static void main(String[] args) {

        final String cara1 = ".....\n" + ".....\n" + "..*..\n" + ".....\n" + ".....";
        final String cara2 = ".....\n" + "...*.\n" + ".....\n" + ".*...\n" + ".....";
        final String cara3 = ".....\n" + "...*.\n" + "..*..\n" + ".*...\n" + ".....";
        final String cara4 = ".....\n" + ".*.*.\n" + ".....\n" + ".*.*.\n" + ".....";
        final String cara5 = ".....\n" + ".*.*.\n" + "..*..\n" + ".*.*.\n" + ".....";
        final String cara6 = ".....\n" + ".*.*.\n" + ".*.*.\n" + ".*.*.\n" + ".....";
        
        String caraA = "";
        String caraB = "";
        
        int jugador1 = (int) (Math.random() * 6 + 1);
        int jugador2 = (int) (Math.random() * 6 + 1);
        int totalTiradaJ = jugador1 + jugador2;
        
        int totalTiradaM = 0;
        int contador = 0;
        int maquina1;
        int maquina2;
        // Numero aleatorios de tirada para el jugador 

        switch (jugador1) {
            case 1:
                caraA = cara1;
                break;
            case 2:
                caraA = cara2;
                break;
            case 3:
                caraA = cara3;
                break;
            case 4:
                caraA = cara4;
                break;
            case 5:
                caraA = cara5;
                break;
            case 6:
                caraA = cara6;
                break;
        }//Primer selector de cara
        
        switch (jugador2) {
            case 1:
                caraB = cara1;
                break;
            case 2:
                caraB = cara2;
                break;
            case 3:
                caraB = cara3;
                break;
            case 4:
                caraB = cara4;
                break;
            case 5:
                caraB = cara5;
                break;
            case 6:
                caraB = cara6;
                break;
        }// Segundo selector de cara
        
        System.out.println("Has sacado: ");
        System.out.println(caraA);
        System.out.println("  y  ");
        System.out.println(caraB);

        //Tiradas de la maquina
        do {
            maquina1 = (int) (Math.random() * 6 + 1);
            maquina2 = (int) (Math.random() * 6 + 1);
            totalTiradaM = maquina1 + maquina2;
            contador++;
        } while (totalTiradaJ > totalTiradaM);
        //Comparación
        
        switch (maquina1) {
            case 1:
                caraA = cara1;
                break;
            case 2:
                caraA = cara2;
                break;
            case 3:
                caraA = cara3;
                break;
            case 4:
                caraA = cara4;
                break;
            case 5:
                caraA = cara5;
                break;
            case 6:
                caraA = cara6;
                break;
        }//Primer selector de cara
        
        switch (maquina2) {
            case 1:
                caraB = cara1;
                break;
            case 2:
                caraB = cara2;
                break;
            case 3:
                caraB = cara3;
                break;
            case 4:
                caraB = cara4;
                break;
            case 5:
                caraB = cara5;
                break;
            case 6:
                caraB = cara6;
                break;
        }//Segundo selector de cara
        
        if (totalTiradaM == totalTiradaJ) {
            System.out.println("Has empatado");
            System.out.println("La máquina ha necesitado " + contador + " tiradas para sacar este resultado");
            System.out.println(caraA);
            System.out.println("  y  ");
            System.out.println(caraB);
        } 
        else if (totalTiradaM >= totalTiradaJ){
            System.out.println("La máquina ha ganado");
            System.out.println("La máquina ha necesitado " + contador + " tiradas para sacar este resultado");
            System.out.println(caraA);
            System.out.println("  y  ");
            System.out.println(caraB);
        }
    }
}
