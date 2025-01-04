package Poo;

public class Cuadrado {
    int lado;
    
    public Cuadrado(int l){
        this.lado = l;
    }

    //Implemetar el metodo toString
    public String toString(){
        int i, espacios;
        String resultado = "";

        for (i = 0; i < this.lado; i++) {
            resultado = resultado + "&&";
        }
        resultado = resultado + "\n";

        for (i = 1; i < this.lado - 1; i++) {
            resultado = resultado + "&&";
            for (espacios = 1; espacios < this.lado; espacios++) {
                resultado = resultado + "  ";
            }
            resultado = resultado + "&&\n";
        }

        for (i = 0; i < this.lado; i++) {
            resultado = resultado + "&&";
        }
        resultado = resultado + "\n";

        return resultado;

    }
}
