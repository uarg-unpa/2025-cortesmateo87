package parcial;
import java.util.Scanner;
public class Testvehiculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese datos para el primer vehiculo");
        System.out.println("Tipo:");
        String Tipo1 = scan.nextLine();
        System.out.println("Velocidad Maxima:");
        int VelocidadMax1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Precio:");
        Double Precio1 = scan.nextDouble();
        scan.nextLine();

        Vehiculo v1 = new Vehiculo(Tipo1, VelocidadMax1, Precio1);

        System.out.println("Ingrese datos para el segundo vehiculo");
        System.out.println("Tipo:");
        String Tipo2 = scan.nextLine();
        System.out.println("Velocidad Maxima:");
        int VelocidadMax2 = scan.nextInt();
        scan.nextLine();
        System.out.println("Precio:");
        Double Precio2 = scan.nextDouble();
        scan.nextLine();

        Vehiculo v2 = new Vehiculo(Tipo2, VelocidadMax2, Precio2);

        System.out.println("Ya se crearon sus vehiculos");

        System.out.println("Ingrese el porcentaje de descuento para el vehiculo 1: ");
        int desc = scan.nextInt();
        scan.nextLine();
        System.out.println("El precio del vehiculo 1 quedaria en: " +v1.aplicarDescuento(desc));

        System.out.println("Ingrese en cuanto quiere aumentar la velocidad del vehiculo 2: ");
        int vel1 = scan.nextInt();
        scan.nextLine();
        System.out.println("La velocidad del vehiculo 2 se actualizo a: " +v2.aumentarVelocidadMaxima(vel1));

        System.out.println("Ingrese 'vehiculo 1' o 'vehiculo 2' para saber si la velocidad maxima de ese vehiculo es menor a la del otro vehiculo");
        String comparacion = scan.nextLine();
        String vehiculo1, vehiculo2;
        vehiculo1 = "vehiculo 1";
        vehiculo2 = "vehiculo 2";
        if(comparacion.equals(vehiculo2)){
            System.out.println(v1.mayorVelocidad(v2));
        } else if (comparacion.equals(vehiculo1)){
            System.out.println(v2.mayorVelocidad(v1));
        } else {
            System.out.println("ERROR: no ingreso ninguna de las 2 palabras especificadas");
        }
        scan.close();
    }
}
