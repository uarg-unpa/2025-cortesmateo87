public class Libro{
    private String titulo;
    private String autor;
    private int aniopublicacion;
    private int cantpag;
    //constructores
    public Libro(String titulo, String autor, int aniopublicacion, int cantpag){
        this.titulo = titulo;
        this.autor = autor;
        this.aniopublicacion = aniopublicacion;
        this.cantpag = cantpag;
    }
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    //gets sets
    public void setTitulo(String titulo){
    this.titulo = titulo;
    }
    public String getTitulo(String titulo){
    return this.titulo;
    }
    public void setAutor(String autor){
    this.autor = autor;
    }
    public String getAutor(String autor){
    return this.autor;
    }
    //metodos
    public boolean esReciente(){
        if(this.aniopublicacion>2010){
            return true;
        } else{
            return false;
        }
    }
    /* OTRA FORMA CON VARIABLE
    public boolean esReciente(){
    boolean resultado;
        if(aniopublicacion>2010){
            resultado = true;
        } else {
            resultado=false; 
        }
    return resultado;
    } 
    */ 
}