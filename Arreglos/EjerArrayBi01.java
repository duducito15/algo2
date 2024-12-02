package Arreglos;

public class EjerArrayBi01 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][6];

        numeros[0][0] = 0;
        numeros[0][1] = 30;
        numeros[0][2] = 2;
        numeros[0][5] = 5;
        numeros[1][0] = 75;
        numeros[1][4] = 0;
        numeros[2][2] = -2;
        numeros[2][3] = 9;
        numeros[2][5] = 11;

        int fila, columna;
        System.out.print("        ");
        for (columna = 0; columna < 6; columna++) {
            System.out.print("   Columna " + columna);
        }
        for (fila = 0; fila < 3; fila++) {
            System.out.print("\nFila: " + fila);
            for (columna = 0; columna < 6; columna++) {
                System.out.printf("%9d   ", numeros[fila][columna]);
            }
            System.out.println();
        }
    }
}
