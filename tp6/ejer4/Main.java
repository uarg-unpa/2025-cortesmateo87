package tp6.ejer4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("Suma de 1 a " + num + " = " + Suma.suma(num));
        scan.close();
    }
}