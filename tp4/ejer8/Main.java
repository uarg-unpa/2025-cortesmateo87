package tp4.ejer8;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Verificar si una palabra es palindromo:");
        System.out.println("Ingrese una palabra");
        String palabra = scan.nextLine();
        Cola aux = new Cola();
        Pila aux2 = new Pila();
        boolean esPalindromo = true;
        int tamano = palabra.length();
        for(int i=0;i<tamano;i++){
            char guardar = palabra.charAt(i);
            if(guardar != ' '){
                aux.encolar(guardar);
                aux2.meter(guardar);
            }
        }
        while(!aux.estaVacia()){
            char elem1 = aux.desencolar();
            char elem2 = aux2.sacar();
            if(elem1 != elem2){
                esPalindromo = false;
                break;
            }
        }
        if(esPalindromo){
            System.out.println("Es Palindromo");
        } else{
            System.out.println("No es Palindromo");
        }
    scan.close();
    }
}
