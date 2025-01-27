package Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fichero02 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\40160915\\Desktop\\algo2\\Ficheros\\notas.txt"));
            String linea = "0";
            int i = 0;
            double suma = 0;

            while (linea != null) {
                i++;
                //suma = suma + Double.parseDouble(linea);
                suma +=  Double.parseDouble(linea);
                linea = br.readLine();
            }
            i--;
            br.close();
            System.out.println("El promedio es "+suma/(double)i);
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
