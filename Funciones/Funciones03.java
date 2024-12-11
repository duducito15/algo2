package Funciones;
import Funciones.Librerias.Geometria;

public class Funciones03 {
    public static void main(String[] args) {
        System.out.println("Operaciones del circulo");
        System.out.println("Ingrese el radio en metros: ");
        double radio = Double.parseDouble(System.console().readLine());

        System.out.println("El area de un circulo con Radio "+radio+" es: "+Geometria.areaCirculo(radio));
        System.out.println("El perimetro de un circulo con Radio "+radio+" es: "+Geometria.perimetroCirculo(radio));
    }
}
