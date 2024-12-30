package Poo;

public class PruebaGato {
    public static void main(String[] args) {
        Gato silvestre = new Gato("macho", "negro y blanco", "Chusco", 15, 28.5);
        Gato gardfield = new Gato("macho", "anaranjado", "Empachao y Chusco", 12, 50.0);
        Gato kyty = new Gato("hembra", "rosado", "peli corta", 15, 30.0);

        System.out.println("Hola gatito");
        silvestre.maullar();
        System.out.println("Toma tu comida gatito");
        silvestre.come("pescado");

        System.out.println("Gatito te presento a tu amiguito");
        silvestre.peleaCon(gardfield);
    }
}
