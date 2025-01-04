package Poo;

public class PruebaCubo {
    public static void main(String[] args) {
        Cubo miCubito = new Cubo(2);
        Cubo miCubote = new Cubo(7);

        System.out.println("Cubito \n");
        miCubito.pintaCubo();

        System.out.println("Cubote \n");
        miCubote.pintaCubo();

        System.out.println("Llena Cubito \n");
        miCubito.llena();
        miCubito.pintaCubo();

        System.out.println("Llena Cubote \n");
        miCubote.llena();
        miCubote.pintaCubo();
    }
}
