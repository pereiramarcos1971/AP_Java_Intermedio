package AP_Java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<String> CadenaAConvertir = new ArrayList<>();
        CadenaAConvertir.add("Cadena_1");
        CadenaAConvertir.add("Cadena_21");
        CadenaAConvertir.add("Cadena_22233");
        CadenaAConvertir.add("Cadena1");
        CadenaAConvertir.add("Cadena_21");

        Cadena CadenaMayusculas = new Cadena();

        System.out.println(CadenaMayusculas.pasarAMayusculas(CadenaAConvertir));
        System.out.println(CadenaMayusculas.concatenarPalabras(CadenaAConvertir, 8));

        ;
    }
}