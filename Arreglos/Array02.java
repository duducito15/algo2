package Arreglos;

public class Array02 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[0] = 8;
        numeros[1] = 33;
        numeros[2] = 200;
        numeros[3] = -100;
        numeros[4] = 150;
        numeros[5] = 11;
        numeros[6] = 81;
        numeros[7] = 18;
        numeros[8] = 45;
        numeros[9] = -8;

        System.out.println("El array tiene 10 elementos ¿cuál de ellos quiere ver?");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        System.out.println("ingrese un valor del 0 al 9");

        int indice = Integer.parseInt(System.console().readLine());
        System.out.println("El elemento que se encuentra en la posición " + indice);
        System.out.println("es el " + numeros[indice]);

    }
}
