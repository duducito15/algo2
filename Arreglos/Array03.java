package Arreglos;

public class Array03 {
    public static void main(String[] args) {
        int[] numeros = new int[20];

        // System.out.println(numeros.length);
        // Llenado del array
        for (int i = 0; i < numeros.length; i++) {
            // numeros[i] = Integer.parseInt(System.console().readLine());
            //numeros[i] = (int) (Math.random() * 10 + 1);
            numeros[i] = (int) ((Math.random() * 11) + 50);
        }

        // Mostrando los elementos del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
    }
}
