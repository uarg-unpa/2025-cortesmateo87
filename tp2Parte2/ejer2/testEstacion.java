package tp2Parte2.ejer2;
public class testEstacion {
    public static void main(String [] args){
        Estacion e1 = new Estacion(100, 2000);

        e1.cargarCombustible(90);
        if(e1.getCapacidadActual() <=10){
            System.out.println("La capacidad actual es igual o menor a 10");
        }
    }
}
