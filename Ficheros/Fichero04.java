package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero04 {
    public static void main(String[] args) {
        try {
            BufferedReader br1 = new BufferedReader(
                    new FileReader("C:\\Users\\40160915\\Desktop\\algo2\\Ficheros\\abancay.txt"));
            BufferedReader br2 = new BufferedReader(
                    new FileReader("C:\\Users\\40160915\\Desktop\\algo2\\Ficheros\\andahuaylas.txt"));
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\40160915\\Desktop\\algo2\\Ficheros\\apurimac.txt"));

            String linea1 = "";
            String linea2 = "";

            while ((linea1 != null) || (linea2 != null)) {
                linea1 = br1.readLine();
                linea2 = br2.readLine();
                if (linea1 != null) {
                    bw.write(linea1 + "\n");
                }
                if (linea2 != null) {
                    bw.write(linea2 + "\n");
                }
            }
            br1.close();
            br2.close();
            bw.close();
            System.out.println("Archivo apurimac.txt creado satisfactoriamente.");

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Se ha producido un error:");
            System.out.println(e.getMessage());
        }
    }
}
