package PractSegParcial.TipoParcial.segundo;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Pila p1 = new Pila();
        System.out.println("Ingrese una palabra:");
        String palabra = scan.nextLine();
        int tamano = palabra.length();
        for(int i=tamano-1; i>=0;i--){
            p1.meter(palabra.charAt(i));
        }
    }
}
