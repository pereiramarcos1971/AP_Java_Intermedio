package AP_Java;

public class TendenciaEnAuge implements Tendencia {


    public void calcularTendencia(Cancion cancion) {

        Icono icono = Icono.ROCKET;
        System.out.println(icono.texto());

        /* La leyenda que se debe mostrar debe respetar el siguiente formato: “Nombre del artista – Título de la canción (Nombre del Álbum – Año del Álbum)”  */
        
        String leyenda = "\"" + cancion.getArtista() + " - " + cancion.getCancion() + " (" + cancion.getAlbum() + " - " + cancion.getAnioAlbum() + ")\"";
        System.out.println(leyenda);
    }

}
