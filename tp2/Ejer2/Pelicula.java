package tp2.Ejer2;
public class Pelicula{
    private String titulo;
    private String director;
    private String genero;
    private String FechaLanz;
    
    public Pelicula(String titulo, String director, String genero, String FechaLanz){
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.FechaLanz = FechaLanz;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDirector(){
        return this.director;
    }
    public void setDirector(String director){
        this.director = director;
    }

    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getFechaLanz(){
        return this.FechaLanz;
    }
    public void setFechaLanz(String FechaLanz){
        this.FechaLanz = FechaLanz;
    }
}