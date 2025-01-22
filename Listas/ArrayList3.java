package Listas;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(86);
        num.add(78);
        num.add(95);
        num.add(10);
        num.add(4);

        System.out.println("Numeros en orden original:");
        for(int numero: num){
            System.out.println(numero);
        }

        Collections.sort(num);//ordenar la lista

        System.out.println("Numeros en ordenados:");
        for(int numero: num){
            System.out.println(numero);
        }


    }
}
