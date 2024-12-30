package Poo;

public class PruebaCaballo {
    public static void main(String[] args) {
        Caballo caballo1 = new Caballo("Spirit", "bayo", "Criollo", "macho", 6) ;
        Caballo caballo2 = new Caballo("Rayo", "blanco", "Pura sangre", "macho", 8) ;

        System.out.println("Hola amiguitos este es mi caballo y se llama: "+caballo1.getNombre());
        System.out.println("Hola amiguitos este es mi otro caballo y se llama: "+caballo2.nombre);

        System.out.println("cabalga!!!!" + caballo1.getNombre());
        caballo1.cabalga();
        caballo1.relincha();
        caballo1.rumia();
    }
}
