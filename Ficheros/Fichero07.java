package Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fichero07 {
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Calcula promedio de fichero");
            System.exit(-1);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String linea = "0";
            int i = 0;
            double suma = 0;

            while (linea != null) {
                i++;
                suma = suma + Double.parseDouble(linea);
                linea = br.readLine();
            }
            i--;
            br.close();
            System.out.println("El promedio es "+suma/i);
        } catch (IOException e) {
            // TODO: handle exception
             System.out.println("Se ha producido un error:");
            System.out.println(e.getMessage());
        }
    }
}
