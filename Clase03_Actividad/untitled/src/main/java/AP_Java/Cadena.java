package AP_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cadena {

    public List<String> pasarAMayusculas (List<String> ListaMinusculas){

        return ListaMinusculas.stream().map(cadena->cadena.toUpperCase()).collect(Collectors.toList());

    }

    public String concatenarPalabras (List<String> ListaPalabras, int cantCaracteres){

        return ListaPalabras.stream().filter(x->x.length()>cantCaracteres).collect(Collectors.joining(", "));

    }
}
