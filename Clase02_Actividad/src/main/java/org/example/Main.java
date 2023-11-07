package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        TRANSFORMADOR
        Implemente un método que reciba como parámetro una lista de strings y una interfaz
        funcional que transforme cada String de la lista en mayúsculas. El método debe devolver un
        nuevo listado de String transformados.

         */

        List<String> ListaCadenaMinusculas = new ArrayList<>();

        ListaCadenaMinusculas.add("cadena_minusculas_1");
        ListaCadenaMinusculas.add("cadena_minusculas_2");
        ListaCadenaMinusculas.add("cadena_minusculas_3");
        ListaCadenaMinusculas.add("cadena_minusculas_4");
        ListaCadenaMinusculas.add("cadena_minusculas_5");
        ListaCadenaMinusculas.add("cadena_minusculas_6");

        PalabrasEnMayuscula ListaCadenaMayusculas = new PalabrasEnMayuscula();

        System.out.println(ListaCadenaMayusculas.pasarPalabrasAMayusculas(ListaCadenaMinusculas));
    }

}

