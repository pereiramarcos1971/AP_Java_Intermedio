package org.example;

import java.util.ArrayList;
import java.util.List;

public class Transformadora {
    public static String pasarAMayusculas(String palabraMinuscula){
        Palabra palabraMayuscula = palabra -> palabra.toUpperCase();
        return  palabraMayuscula.devolverMayusculas(palabraMinuscula);

    }
}