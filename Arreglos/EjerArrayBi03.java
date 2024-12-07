package Arreglos;

public class EjerArrayBi03 {
    public static void main(String[] args) {
        int[][] num = new int[6][10];
        int f, c;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        int fMin = 0;
        int cMin = 0;
        int fMax = 0;
        int cMax = 0;

        for (f = 0; f < 6; f++) {
            for (c = 0; c < 10; c++) {
                num[f][c] = (int) (Math.random() * 1001);
                System.out.printf("%5d", num[f][c]);
                // Calcular el minimo
                if (num[f][c] < minimo) {
                    minimo = num[f][c];
                    fMin = f;
                    cMin = c;
                }
                // Calcular el maximo
                if (num[f][c] > maximo) {
                    maximo = num[f][c];
                    fMax = f;
                    cMax = c;
                }
            }
            System.out.println();
        }
        System.out.println("\n el mínimo valor es: " + minimo + " y esta en la posición " + fMin + ", " + cMin);
        System.out.println("\n el maximo valor es: " + maximo + " y esta en la posición " + fMax + ", " + cMax);
    }

}
