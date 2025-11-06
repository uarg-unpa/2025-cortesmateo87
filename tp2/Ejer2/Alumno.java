package tp2.Ejer2;
public class Alumno{
    private String Nombre;
    private int DNI;
    private int Edad;
    private int Legajo;
    private String Domicilio;
    private int Telefono;

    public Alumno(String Nombre, int DNI, int Edad, int Legajo, String Domicilio, int Telefono){
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Edad = Edad;
        this.Legajo = Legajo;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
    }

    public String getNombre(){
        return this.Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public int getDNI(){
        return this.DNI;
    }
    public void setDni(int DNI){
        this.DNI = DNI;
    }

    public int getEdad(){
        return this.Edad;
    }
    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public int getLegajo(){
        return this.Legajo;
    }
    public void setLegajo(int Legajo){
        this.Legajo = Legajo;
    }

    public String getDmicilio(){
        return this.Domicilio;
    }
    public void setDomicilio(String Domicilio){
        this.Domicilio = Domicilio;
    }

    public int getTelefono(){
        return this.Telefono;
    }
    public void setTelefono(int Telefono){
        this.Telefono = Telefono;
    }
}