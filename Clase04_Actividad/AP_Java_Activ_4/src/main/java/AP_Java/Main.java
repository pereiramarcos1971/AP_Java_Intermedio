package AP_Java;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head",2002);

        System.out.println("Fecha y hora actual: " + ZonedDateTime.now());
        // Testeo 1

        ComponenteTendenciasMusicales calcularTendencia = new ComponenteTendenciasMusicales
                (cancion, 100, 2,  900, ZonedDateTime.parse("2023-11-13T08:00:00Z"));

        calcularTendencia.mostrarIconoYLeyenda();

        // Testeo 2

        ComponenteTendenciasMusicales calcularTendencia2 = new ComponenteTendenciasMusicales
                (cancion, 1100, 50,  1500, ZonedDateTime.parse("2023-11-13T08:30:00Z"));

        calcularTendencia2.mostrarIconoYLeyenda();

        // Testeo 3

        ComponenteTendenciasMusicales calcularTendencia3 = new ComponenteTendenciasMusicales
                (cancion, 5200, 5000,  7500, ZonedDateTime.parse("2023-11-13T08:55:00Z"));

        calcularTendencia3.mostrarIconoYLeyenda();

        // Testeo 4

        ComponenteTendenciasMusicales calcularTendencia4 = new ComponenteTendenciasMusicales
                (cancion, 20001, 7500,  50001, ZonedDateTime.parse("2023-11-13T09:10:00Z"));

        calcularTendencia4.mostrarIconoYLeyenda();

        // Testeo 5

        ComponenteTendenciasMusicales calcularTendencia5 = new ComponenteTendenciasMusicales
                (cancion, 50000, 9000,  125000, ZonedDateTime.parse("2023-11-11T09:10:00Z"));

        calcularTendencia5.mostrarIconoYLeyenda();


    }
}