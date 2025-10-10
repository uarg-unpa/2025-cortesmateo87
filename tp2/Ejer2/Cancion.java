package tp2.Ejer2;

public class Cancion {
    private String Artista;
    private String Album;
    private double Duracion;
    private String Nombre;
    private String FechaLanzamiento;
    private String Discografica;

    public Cancion(String Artista, String Album, double Duracion, String Nombre, String FechaLanzamiento, String Discografica){
        this.Artista = Artista;
        this.Album = Album;
        this.Duracion = Duracion;
        this.Nombre = Nombre;
        this.FechaLanzamiento = FechaLanzamiento;
        this.Discografica = Discografica;
    }

    public String getArtista(){
        return this.Artista;
    }
    public void setArtista(String Artista){
        this.Artista = Artista;
    }

    public String getAlbum(){
        return this.Album;
    }
    public void setAlbum(String Album){
        this.Album = Album;
    }

    public double getDuracion(){
        return this.Duracion;
    }
    public void setDuracion(double Duracion){
        this.Duracion = Duracion;
    }

    public String getNombre(){
        return this.Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String getFechalanzamiento(){
        return this.FechaLanzamiento;
    }
    public void setFechalanzamiento(String FechaLanzamiento){
        this.FechaLanzamiento = FechaLanzamiento;
    }

    public String getDiscografica(){
        return this.Discografica;
    }
    public void setDiscografica(String Discografica){
        this.Discografica = Discografica;
    }
}
