package tp6.ejer7;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = scan.nextLine();
        System.out.println("Cantidad de vocales :" +Metodo.cantvocales(palabra,0,0));
        scan.close();
    }
}

