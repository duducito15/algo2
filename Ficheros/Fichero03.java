package Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero03 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\40160915\\Desktop\\algo2\\Ficheros\\frutas.txt"));

            bw.write("Naranja\n");
            bw.write("Platano\n");
            bw.write("Platano beyaco\n");

            bw.close();

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
