package Ficheros;

public class Fichero06 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 0; i < args.length; i++) {
            suma = suma + Integer.parseInt(args[i]);
        }
        System.out.println("La suma de los argumentos es: "+suma);

    }
}
