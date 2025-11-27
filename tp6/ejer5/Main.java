package tp6.ejer5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("Suma decreciendo " + num + " de 2 en 2 = " + Suma.suma(num));
        scan.close();
    }
}
