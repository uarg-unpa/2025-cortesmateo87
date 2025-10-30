package tp3.ejer10;
import java.util.Scanner;
public class TestPila {
    public static void main(String[] args){
    Scanner scan = new Scanner (System.in);
    Pila p1 = new Pila();
    System.out.println("Ingrese una expresion:");
    String expresion = scan.nextLine();
    System.out.println("La expresion es correcta?");
    if(p1.esCorrecta(expresion)){
        System.out.println("Es correcta");
    } else{
         System.out.println("No es correcta");
    }
    scan.close();
    }
}
