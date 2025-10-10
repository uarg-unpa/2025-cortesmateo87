package tpgrupal2;

public class producto {
    private String descripcion;
    private double precio;
    private Proveedor proveedor;

    public producto(String descripcion, double precio, Proveedor proveedor){
        this.descripcion = descripcion;
        this.precio = precio;
        this.proveedor = proveedor;
    }
    //get sets
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public double getPrecio(){
        return this.precio;
    }

    //METODOS
    public boolean esCaro(){
        if(precio>10){
            return true;
        } else {
            return false;
        }
    }

    public void actualizarPrecio(double precio){
        this.precio = precio;
    }

    public double calcularDescuento(double CantidadDeDescuento){
        double descuento;
        descuento = this.precio - CantidadDeDescuento;
        return descuento;
    }

    public String toString(){
        return "Producto: "+descripcion+" ,Precio: "+precio+"Proveedor: "+proveedor;
    }

}
