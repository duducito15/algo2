package Arreglos;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
         * Ejercicio 3. Escribe un programa que genere 100 numeros aleatorios del 0 al
         * 20 y que los muestre en pantalla seperados por espacios. El programa pedira entonces
         * por teclado dos valores y a continuacion cambiara cambiara todas las ocurrencias del primer
         * valor por el segundo en la lista generada anteriormente. los numeros que se han cambiado deben
         * aparecer entre comillas.
         */

        int[] numeros = new int[100];
        int i;

        //rellenar el array con 100 numeros aleatorios
        for ( i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*21);
            System.out.print(numeros[i] + " ");
        }

    }
}
