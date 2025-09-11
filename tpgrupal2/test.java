package tpgrupal2;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String descripcion;
        double precio;

        //producto 1
        Proveedor p1 = new Proveedor("proveedor1",3432);

        System.out.println("Ingrese la descripcion del producto:");
        descripcion = scan.nextLine();

        System.out.println("Ingrese el precio del producto:");
        precio = scan.nextDouble();
        scan.nextLine();

        producto prod1 = new producto(descripcion, precio, p1);

        //metodos prod1
        System.out.println(prod1.esCaro());
        System.out.println(prod1.actualizarPrecio(110));
        System.out.println(prod1.calcularDescuento(5.25));
        System.out.println(prod1);

        //Producto 2
        Proveedor p2 = new Proveedor("proveedor2",3444);

        System.out.println("Ingrese la descripcion del producto:");
        descripcion = scan.nextLine();

        System.out.println("Ingrese el precio del producto:");
        precio = scan.nextDouble();
        scan.nextLine();

        producto prod2 = new producto(descripcion,precio,p2);

        System.out.println(prod2.esCaro());
        System.out.println(prod2.actualizarPrecio(1111));
        System.out.println(prod2.calcularDescuento(10.5));
        System.out.println(prod2);

        scan.close();
    }
}
