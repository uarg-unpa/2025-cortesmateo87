import java.util.Scanner;
public class Ejercicio4part2 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int Cont, Suma, Producto;
        System.out.print("Ingrese tres numeros: ");
        Suma = 0;
        Producto = 1;
        Cont = 0;
        while(Cont<3){
            int Num = scan.nextInt();
            Suma = Suma + Num;
            Producto = Producto * Num;
            Cont = Cont + 1;
        }
        System.out.println("La suma de los numeros ingresados es: " +Suma);
        System.out.println("El producto de los numeros ingresados es: " +Producto);
    }
}
