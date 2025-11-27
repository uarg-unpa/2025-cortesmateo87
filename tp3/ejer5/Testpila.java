package tp3.ejer5;
import java.util.Scanner;
public class Testpila {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        Pila p1 = new Pila();
        if(!p1.estaVacia()){
            System.out.println(p1.elementoCima());
        } else 
            System.out.println("ERROR: La pila esta vacia");
    }
}
