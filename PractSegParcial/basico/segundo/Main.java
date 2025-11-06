package PractSegParcial.basico.segundo;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Pila p1 = new Pila();
        Pila p2 = new Pila();
        System.out.println("Ingrese 5 numeros para elementos de la pila de a uno;");
        for(int i=0;i<=5;i++){
            System.out.println("Ingrese un elemento");
            int guardar = scan.nextInt();
            p1.meter(guardar);
            scan.nextLine();
        }
        while(!p1.estaVacia()){
            p2.meter(p1.sacar());
        }
    }
}
