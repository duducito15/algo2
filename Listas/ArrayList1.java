package Listas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<String>();
        ArrayList<Integer> myListNumbers = new ArrayList<Integer>();

        System.out.println("Nro elementos: "+myList.size());

        myList.add("rojo");
        myList.add("verde");
        myList.add("morado");
        myList.add("azul");

        System.out.println("Nro elementos: "+myList.size());
        System.out.println("el elemento que hay en la posicion 1 es: "+myList.get(1));

        System.out.println("Contenido de la lista");
        //for (int i = 0; i < myList.size(); i++) {
        //    System.out.println(myList.get(i));
        //}
        for(String color: myList ){
            System.out.println(color);
        }



    }
}
