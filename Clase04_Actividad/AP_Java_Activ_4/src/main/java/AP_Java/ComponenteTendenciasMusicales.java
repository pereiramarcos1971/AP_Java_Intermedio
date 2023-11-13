package AP_Java;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ComponenteTendenciasMusicales {

    private Cancion cancion;
    private Tendencia tendencia;
    private int cantLikes ;
    private int cantDislikes ;
    private int cantReproducciones;
    private ZonedDateTime ultimaReproduccion;

    public ComponenteTendenciasMusicales() {tendencia=new TendenciaNormal();}

    public void setTendencia(Tendencia tendencia) {
        this.tendencia = tendencia;
    }



    // constructor
    public ComponenteTendenciasMusicales(Cancion cancion, int cantLikes, int cantDislikes, int cantReproducciones, ZonedDateTime ultimaReproduccion) {
        this.cancion = cancion;
        this.cantLikes = cantLikes;
        this.cantDislikes = cantDislikes;
        this.cantReproducciones = cantReproducciones;
        this.ultimaReproduccion = ultimaReproduccion;
        this.tendencia = new TendenciaNormal();

        if (tendencia instanceof TendenciaNormal) {
            if (cantReproducciones > 1000)
                setTendencia(new TendenciaEnAuge());
        }

        if (tendencia instanceof TendenciaEnAuge) {

            if (cantReproducciones > 50000 && cantLikes > 20000) {
                setTendencia((new TendenciaEnTendencia()));
            }

        }

        if(tendencia instanceof TendenciaEnAuge) {

            if (cantDislikes >= 5000)
                setTendencia(new TendenciaNormal());
        }

        if(tendencia instanceof TendenciaEnTendencia ){

            //  Ejemplo de hora "2023-01-01T12:00:00Z");
            //  System.out.println(ZonedDateTime.now());
            //  ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2023-01-02T12:00:00Z"); // remplaza con tu fecha y hora

            // Calcula la diferencia en horas entre
            long diferenciaHoras = ultimaReproduccion.until(ZonedDateTime.now(), ChronoUnit.HOURS);

            // Verifica si la diferencia es mayor a 24 horas
            if (diferenciaHoras > 24)
                setTendencia((new TendenciaNormal()));
        }

    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public int getCantLikes() {
        return cantLikes;
    }

    public void setCantLikes(int cantLikes) {
        this.cantLikes = cantLikes;
    }

    public int getCantDislikes() {
        return cantDislikes;
    }

    public void setCantDislikes(int cantDislikes) {
        this.cantDislikes = cantDislikes;
    }

    public int getCantReproducciones() {
        return cantReproducciones;
    }

    public void setCantReproducciones(int cantReproducciones) {
        this.cantReproducciones = cantReproducciones;
    }

    public ZonedDateTime getUltimaReproduccion() {
        return ultimaReproduccion;
    }

    public void setUltimaReproduccion(ZonedDateTime ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }

    public void mostrarIconoYLeyenda(){


        tendencia.mostrarIcono();
        tendencia.mostrarLeyenda(cancion);

    }

}

