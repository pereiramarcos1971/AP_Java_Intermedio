package AP_Java;

public class TendenciaEnTendencia implements Tendencia{

    public void calcularTendencia(Cancion cancion) {

        Icono icono = Icono.FIRE;
        System.out.println(icono.texto());

        /*  La leyenda que se debe mostrar debe respetar el siguiente formato: “Título de la canción – Nombre del artista (Nombre del Álbum – Año del álbum)”  */

        String leyenda = "\"" + cancion.getCancion() + " - " + cancion.getArtista() + " (" + cancion.getAlbum() + " - " + cancion.getAnioAlbum() + ")\"";
        System.out.println(leyenda);

    }

}
