package tp2Parte2.ejer2;

public class Estacion {
    private double capacidadMAX;
    private double capacidadActual;

    public Estacion(double capacidadActual, double capacidadMAX){
        this.capacidadActual = capacidadActual;
        this.capacidadMAX = capacidadMAX;
    }

    //get y set
    public double getCapacidadActual(){
        return capacidadActual;
    }
    public void setCapacidadActual(double capacidadActual){
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMAX(){
        return capacidadMAX;
    }
    public void setCapacidadMAX(double capacidadMAX){
        this.capacidadMAX = capacidadMAX;
    }

    // METODOS
    public double cargarCombustible(double cantidad){
        this.capacidadActual = this.capacidadActual - cantidad;
        return this.capacidadActual;
    }

    public double reponerCombustible(double cantidad){
        this.capacidadActual = this.capacidadActual + cantidad;
        return this.capacidadActual;
    }
}
