package Listas;

import java.util.ArrayList;

import Poo.Gato;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Gato> g = new ArrayList<Gato>();

        System.out.println("Nro gatos: "+g.size());

        g.add(new Gato("Garfield","macho", "negrito","siames", 5,12.5 ));
        g.add(new Gato("Michifus","hembra", "amarrillo","angora", 15,12.5 ));
        g.add(new Gato("Pancho","macho", "moteado","siames", 7,12.5 ));
        g.add(new Gato("Roro","hembra", "rubia","siames", 8,12.5 ));
        g.add(new Gato("Chalo","macho", "puerta","pelo corto", 10,12.5 ));

        for(Gato miGato: g){
            System.out.println(miGato.getNombre()+", "+miGato.maullar());
        }
    }
}
