package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalabrasEnMayuscula {

    public List <String> pasarPalabrasAMayusculas(List<String>palabrasMinusculas){

        palabrasMinusculas.forEach(cadena -> {
            int index = palabrasMinusculas.indexOf(cadena);
            palabrasMinusculas.set(index, Transformadora.pasarAMayusculas(cadena, x->x.toUpperCase() ));
        });

        return palabrasMinusculas; // palabras minusculas pasadas a mayusculas


    }
}

