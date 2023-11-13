package AP_Java;

public class Cancion {
    private String cancion;
    private String artista;
    private String album;
    private int anioAlbum;

    public Cancion(String cancion, String artista, String album, int anioAlbum) {
        this.cancion = cancion;
        this.artista = artista;
        this.album = album;
        this.anioAlbum = anioAlbum;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnioAlbum() {
        return anioAlbum;
    }

    public void setAnioAlbum(int anioAlbum) {
        this.anioAlbum = anioAlbum;
    }
}
