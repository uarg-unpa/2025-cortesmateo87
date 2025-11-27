package practicaclase1;
public class testlibro{
    public static void main(String[] args){
        Libro libro1 = new Libro ("Harry Potter","Ch. R",1997,368);
        Libro libro2 = new Libro ("Harry Potter","Ch. R",1997,368);
        Libro libro3 = new Libro ("Harry Potter","Ch. R",1997,368);
    
        libro1.esReciente();
        libro2.esReciente();
        libro3.esReciente();
    }
}