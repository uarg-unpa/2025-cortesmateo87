package PractSegParcial.TipoParcial.primer;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Pila p1 = new Pila();
        Pila p2 = new Pila();
        Pila aux1 = new Pila();
        Pila aux2 = new Pila();
        Scanner scan = new Scanner(System.in);
        if(p1.tamaño() != p2.tamaño()){
            System.out.println("Error: No son iguales tamaños distintos");
            return;
        }
        boolean SonIguales = true;
        while(!p1.estaVacia()){
            int num1 = p1.sacar();
            int num2 = p1.sacar();

            aux1.meter(num1);
            aux2.meter(num2);

            if(num1 != num2){
                SonIguales = false;
                break;
            }
        }
        while(!aux1.estaVacia()){
            int guardar = aux1.sacar();
            int guardar2 = aux2.sacar();
            p1.meter(guardar);
            p2.meter(guardar2);
        }
        if(SonIguales){
            System.out.println("Las pilas son iguales");
        } else{
            System.out.println("Las Pilas no son iguales");
        }
    scan.close();
    }
}

