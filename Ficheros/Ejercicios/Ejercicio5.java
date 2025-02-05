package Ficheros.Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    public static void main(String[] args) {
       try {
        BufferedReader br = new BufferedReader(new FileReader(".//Ficheros//Ejercicios//palabras.txt"));
        //String palabra =
       } catch (IOException ioe) {
        // TODO: handle exception
        System.err.println(ioe.getMessage());
       }
    }
}
