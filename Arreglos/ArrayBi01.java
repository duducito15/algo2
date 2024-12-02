package Arreglos;

public class ArrayBi01 {

    public static void main(String[] args) {
        // Un array bidimensional es una estructura que usa dos indices para localizar
        // un elemento.

        // Declarar un arrays de 3 filas por 2 columnas
        int[][] numeros = new int[3][2];

        numeros[0][0] = 20;
        numeros[0][1] = 15;
        numeros[1][0] = 6;
        numeros[1][1] = 11;
        numeros[2][0] = 32;
        numeros[2][1] = 3;

        int fila, columna;

        for (fila = 0; fila < 3; fila++) {
            System.out.print("Fila: "+fila);
            for (columna = 0; columna < 2; columna++) {
                System.out.printf("%10d",numeros[fila][columna]);
            }
            System.out.println();
        }
    }
}