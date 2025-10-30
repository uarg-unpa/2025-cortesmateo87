package tp2.Ejer2;

public class Mascota {
    private String tipo;
    private String raza;
    private String nombre;
    private double peso;
    private double altura;
    private int edad;

    public Mascota(String tipo, String raza, String nombre, double peso, double altura, int edad){
       this.tipo = tipo;
       this.raza = raza;
       this.nombre = nombre;
       this.peso = peso;
       this.altura = altura;
       this.edad = edad; 
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getRaza(){
        return this.raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
}
