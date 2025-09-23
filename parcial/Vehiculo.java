package parcial;
public class Vehiculo{
    private String tipo;
    private int velocidadMax;
    private double precio;

    public Vehiculo(String tipo, int velocidadMax, double precio){
        this.tipo = tipo;
        this.velocidadMax = velocidadMax;
        this.precio = precio;
    }

    //get y set
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getVelocidadMax(){
        return this.velocidadMax;
    }
    public void setVelocidadMax(int velocidadMax){
        this.velocidadMax = velocidadMax;
    }

    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    //metodos
    public double aplicarDescuento(double descuento){
        double porcentaje, resta;
        porcentaje = descuento * 0.01;
        resta = this.precio * porcentaje;
        this.precio = this.precio - resta;
        return this.precio;
    }

    public int aumentarVelocidadMaxima(int incremento){
        this.velocidadMax = velocidadMax + incremento;
        return this.velocidadMax;
    }

    public boolean mayorVelocidad(Vehiculo vehiculoV){
        if(this.getVelocidadMax() > vehiculoV.getVelocidadMax()){
            return true;
        } else {
            return false;
        }
    }
}