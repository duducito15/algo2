package Ficheros.Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            BufferedReader bf1 = new BufferedReader(new FileReader(".//Ficheros//Ejercicios//frutas_en.txt"));
            BufferedReader bf2 = new BufferedReader(new FileReader(".//Ficheros//Ejercicios//frutas_es.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(".//Ficheros//Ejercicios//frutas.txt"));

            String linea1 = "";
            String linea2 = "";

            while ((linea1 != null) || (linea2 != null)) {
                linea1 = bf1.readLine();
                linea2 = bf2.readLine();

                if (linea1 != null) {
                    bw.write(linea1 + "\n");
                }

                if (linea2 != null) {
                    bw.write(linea2 + "\n");
                }
            }

            bf1.close();
            bf2.close();
            bw.close();

        } catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
            System.err.println(ioe.getMessage());
        }
    }
}
