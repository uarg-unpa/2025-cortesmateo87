package tp3.ejer8;
import java.util.Scanner;
public class Testpila {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        Pila p1 = new Pila();
        System.out.println("Ingrese una palabra:");
        String palabra = scan.nextLine();
        int longitud = palabra.length();
        for(int i=0; i<longitud; i++){
            char guardar = palabra.charAt(i);
            if(guardar != ' '){
                p1.meter(guardar);
            }
        }
        if(p1.esPalindromo()){
            System.out.println("Es Palindromo");
        } else {
            System.out.println("No es Palindromo");
        }
    scan.close();
    }
}
