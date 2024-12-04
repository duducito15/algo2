package Arreglos;

public class EjerArrayBi02 {
    public static void main(String[] args) {
        int[][] num = new int[4][5];

        int f, c;
        System.out.println("Ingrese los numeros (enteros) en el array");
        for (f = 0; f < 4; f++) {
            for (c = 0; c < 5; c++) {
                //System.out.print("Fila " + f + ", Columna " + c + ": ");
                num[f][c] = (int) ((Math.random()*50)+1);//Integer.parseInt(System.console().readLine());
            }
        }

        // Suma de las filas
        int sumaFila;
        for (f = 0; f < 4; f++) {
            sumaFila = 0;
            for (c = 0; c < 5; c++) {
                System.out.printf("%7d  ", num[f][c]);
                sumaFila = sumaFila + num[f][c];
            }
            System.out.printf("|%7d\n", sumaFila);
        }
    }
}
