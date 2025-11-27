import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int Suma, Producto;
        System.out.print("Ingrese 3 numeros:");
        System.out.print("Ingrese el primer numero:");
        int NUM1 = scan.nextInt();
        System.out.print("Ingrese el segundo numero:");
        int NUM2 = scan.nextInt();
        System.out.print("Ingrese el tercer numero:");
        int NUM3 = scan.nextInt();
        Suma = NUM1 + NUM2 + NUM3;
        Producto = NUM1 * NUM2 * NUM3;

        System.out.println("La suma de los numeros ingresados es: " +Suma);
        System.out.println("El producto de los numeros ingresados es: " +Producto);
    }
}
