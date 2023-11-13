package AP_Java;

public class TendenciaNormal implements Tendencia{


        public void calcularTendencia(Cancion cancion) {

            Icono icono = Icono.MUSICAL_NOTE;
            System.out.println(icono.texto());

            /* La leyenda que se debe mostrar debe respetar el siguiente formato: “Nombre del artista – Nombre del álbum – Título de la canción */
            String leyenda = "\"" + cancion.getArtista() + " - " + cancion.getAlbum() + " - " + cancion.getCancion() + "\"";
            System.out.println(leyenda);

        }
}
