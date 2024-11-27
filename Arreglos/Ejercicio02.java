package Arreglos;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*Ejercicio 2. Escribe un programa que lea 15 numeros por teclado y que los almacene
          en un array, rota los elementos de ese array, es decir, el elemento de la posicion 0 debe pasar 
a la posición 1, el de la 1 a la 2, etc. el numero que se encuentra en la ultima posicion
debe pasar a la posicion 0. Finalmente muestre el contenido del array.
         * 
         */
        int[] numeros = new int[5];

        int i;

        System.out.println("Ingrese numeros enteros y presione ENTER: ");
        for ( i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Array Original: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+"|");
        }

        //Rotamos el array
        int aux = numeros[4];
        for ( i = 4; i > 0; i--) {
            numeros[i] = numeros[i-1];
        }
        numeros[0] = aux;
        System.out.println();
        System.out.println("Array Rotado: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+"|");
        }

    }
}
