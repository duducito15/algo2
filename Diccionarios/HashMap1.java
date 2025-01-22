package Diccionarios;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> miDicc = new HashMap<Integer, String>();

        miDicc.put(52, "Gonzalo");
        miDicc.put(2, "Miguel");
        miDicc.put(13, "Rafael");
        miDicc.put(8, "Donatelo");
        miDicc.put(4, "Jhon");

        System.out.println("Los elemetos de miDicc son: "+miDicc);

        System.out.println(miDicc.get(13));

        System.out.println(miDicc.values());

        System.out.println("Entradas del diccionario");
        for(Map.Entry pareja: miDicc.entrySet()){
            System.out.println(pareja.getValue());
        }

        System.out.println("Introduzaca un código (clave): ");
        int codigoIngresado = Integer.parseInt(System.console().readLine());

        if (miDicc.containsKey(codigoIngresado)) {
            System.out.println("El codigo: "+codigoIngresado+" corresponde a ");
            System.out.println(miDicc.get(codigoIngresado));
        } else {
            System.out.println("El codigo ingresado no existe. Boludo!!!!!");
        }

    }
}
