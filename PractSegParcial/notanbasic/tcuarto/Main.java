package PractSegParcial.notanbasic.tcuarto;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    Pila p1 = new Pila();
    System.out.println("Ingrese el elemento a buscar:");
    int elem = scan.nextInt();
    System.out.println("Ingrese 10 elemento para la pila:");
    for(int i=0;i<=10;i++){
        System.out.println("Ingrese:");
        int guardar = scan.nextInt();
        p1.meter(guardar);
        scan.nextLine();
    }
    while(!p1.estaVacia()){
        if(p1.elementoCima() == elem){
            System.out.println("Se encontro el elemento solicitado");
            break;
        } else {
            int eliminado = p1.sacar();
            System.out.println("Se elimino el elemento:"+eliminado);
        }
        if(p1.estaVacia()){
            System.out.println("La pila esta vacia, no se encontro el elemento.");
        }
    }
    }
}
