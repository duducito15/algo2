package Funciones;

public class Funciones02 {
    public static void main(String[] args) {
        System.out.println("Ingrese el primer numero: ");
        int n1 = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el segundo numero: ");
        int n2 = Integer.parseInt(System.console().readLine());

        System.out.println("La suma: " + miSuma(n1, n2));
        System.out.println("La resta: " + miResta(n1, n2));
        System.out.println("La multiplicacion: " + miMulti(n1, n2));
        System.out.println("La division: " + miDivision(n1, n2));
    }

    public static int miSuma(int x, int y){
        return x + y;
    }
    public static int miResta(int x, int y){
        return x - y;
    }
    public static int miMulti(int x, int y){
        return x * y;
    }
    public static double miDivision(int x, int y){
        return (double)x / (double)y;
    }

}
