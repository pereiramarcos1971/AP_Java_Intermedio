package AP_Java;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head",2002);

        System.out.println("Fecha y hora actual: " + ZonedDateTime.now());
        // Testeo 1

        ComponenteTendenciasMusicales cancionConTendencia = new ComponenteTendenciasMusicales
                (cancion, 100, 2,  900, ZonedDateTime.parse("2023-11-13T08:00:00Z"));

        cancionConTendencia.calcularTendencia();

        // Testeo 2

        cancionConTendencia.setCantLikes(1100);
        cancionConTendencia.setCantDislikes(50);
        cancionConTendencia.setCantReproducciones(1500);
        cancionConTendencia.setUltimaReproduccion(ZonedDateTime.parse("2023-11-13T08:30:00Z"));

        cancionConTendencia.calcularTendencia();

        //Testeo 3

        cancionConTendencia.setCantLikes(5200);
        cancionConTendencia.setCantDislikes(5000);
        cancionConTendencia.setCantReproducciones(7500);
        cancionConTendencia.setUltimaReproduccion(ZonedDateTime.parse("2023-11-13T08:55:00Z"));

        cancionConTendencia.calcularTendencia();

        //Testeo 4
        cancionConTendencia.setCantLikes(20001);
        cancionConTendencia.setCantDislikes(7500);
        cancionConTendencia.setCantReproducciones(50001);
        cancionConTendencia.setUltimaReproduccion(ZonedDateTime.parse("2023-11-13T09:10:00Z"));

        cancionConTendencia.calcularTendencia();

        //Testeo 5
        cancionConTendencia.setCantLikes(50000);
        cancionConTendencia.setCantDislikes(9000);
        cancionConTendencia.setCantReproducciones(125000);
        cancionConTendencia.setUltimaReproduccion(ZonedDateTime.parse("2023-11-11T09:10:00Z"));

        cancionConTendencia.calcularTendencia();


    }
}