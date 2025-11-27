package Practicapar1;

public class Departamento{
    private String nombre;
    private int piso;

    public Departamento(String nombre, int piso){
        this.nombre = nombre;
        this.piso = piso;
    }

    //get y set
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPiso(){
        return this.piso;
    }
    public void setPiso(int piso){
        this.piso = piso;
    }

    //metodos
    public String toString(){
        return nombre+ " " +piso;
    }
}
