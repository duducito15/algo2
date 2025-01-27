package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero01 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\40160915\\Desktop\\algo2\\Ficheros\\abancay.txt"));

            String linea = "";

            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }

            br.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero abancay.txt");
        } catch (IOException ioe) {
            System.out.println("No se puede leer el fichero abancay.txt");
        }
    }
}
