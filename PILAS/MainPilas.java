package PILAS;
import java.util.Scanner;
public class MainPilas {
    public static void main(String[] args){ 
    Scanner scan = new Scanner (System.in);
    Cadena pila = new Cadena();
    int opcion;
    
    do{
        System.out.println("\n === Menu De Pila ===");
        System.out.println("1. Meter Elemento");
        System.out.println("2. Sacar Elemento");
        System.out.println("3. Verificar Estado");
        System.out.println("0. Salir");
        System.out.println("Opcion:");
        opcion = scan.nextInt();

        switch(opcion){
            case 1: //Meter elemento
                if(pila.estaLlena()){
                    System.out.println("Error: la pila esta llena");
                } else {
                    System.out.println("Ingrese un numero:");
                    int num = scan.nextInt();
                    pila.meter(num);
                    System.out.println("Elemento" +num+ "agregado");
                }
                break;
            case 2: //sacar elemento
                if(pila.estaVacia()){
                    System.out.println("Error: la pila esta vacia");
                } else{
                    int elemento = pila.sacar();
                    System.out.println("Elemento sacado: "+elemento);
                }
                break;
            case 3: //verificar estado
                System.out.println("¿Vacia?" +pila.estaVacia()+ "¿Llena?" +pila.estaLlena());
                break;
            case 0: //salir
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion Invalida");
        } 
    }while(opcion!= 0);
    scan.close();
    }
}
