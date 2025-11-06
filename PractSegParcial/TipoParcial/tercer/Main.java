package PractSegParcial.TipoParcial.tercer;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Pila p1 = new Pila();
        Pila impar = new Pila();
        while(!p1.estaVacia()){
            int guardar = p1.sacar();
            if(guardar%2!=0){
                impar.meter(guardar);
            }
        }
        while(!impar.estaVacia()){
            int guardar = impar.sacar();
            p1.meter(guardar);
        } 
    }
}
