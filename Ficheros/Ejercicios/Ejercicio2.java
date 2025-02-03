package Ficheros.Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(".//Ficheros//Ejercicios//primos.dat"));

            String linea = "";
            while (linea != null) { 
                System.out.print(linea + "\n");
                linea = br.readLine();
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Se ha producido un error:");
            System.out.println(e.getMessage());
        }
    }
}
