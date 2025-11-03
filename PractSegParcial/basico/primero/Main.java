package PractSegParcial.basico.primero;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Pila p1 = new Pila();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros de a uno:");
        for(int i=0;i<=5;i++){
            System.out.println("ingrese un numero:");
            int guardar = scan.nextInt();
            p1.meter(guardar);
            scan.nextLine();
        }
        while(!p1.estaVacia()){
            System.out.println(p1.sacar());
        }
    }
}
