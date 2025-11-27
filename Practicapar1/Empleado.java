package Practicapar1;

public class Empleado {
    private int legajo;
    private double sueldo;
    private boolean esjefe;
    private Departamento departamento;

    public Empleado(int legajo, double sueldo, boolean esjefe, Departamento departamento){
        this.legajo = legajo;
        this.sueldo = sueldo;
        this.esjefe = esjefe;
        this.departamento = departamento;
    }
    //get y set
    public int getLegajo(){
        return this.legajo;
    }
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }

    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public Departamento getDepartamento(){
        return this.departamento;
    }
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

    //metodos
    public boolean esJefe(){
        return this.esjefe;
    }

    public void aumentarSueldo(int aumento){
        this.sueldo = sueldo + aumento;
    }

    public double calcularBono(){
        if(this.esjefe == true){
            return this.sueldo * 0.20;
        } else{
            return this.sueldo * 0.10;
        }
    }

    public String toString(){
        return "EMPLEADO: [ LEGAJO: " +legajo+ ", Sueldo: " +sueldo+ ", Es Jefe?: " +esjefe+ ", Departamento: " +departamento+ "]";
    }


}
