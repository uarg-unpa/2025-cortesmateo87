package tp3.ejer7;
import java.util.Scanner;
public class TestPila {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Pila p1 = new Pila();

        int opcion;
    
    do{
        System.out.println("\n === Menu De Pila ===");
        System.out.println("1. Meter Elemento");
        System.out.println("2. Sacar Elemento");
        System.out.println("3. Verificar Estado");
        System.out.println("4. Crear Copia");
        System.out.println("0. Salir");
        System.out.println("Opcion:");
        opcion = scan.nextInt();

        switch(opcion){
            case 1: //Meter elemento
                if(p1.estaLlena()){
                    System.out.println("Error: la pila esta llena");
                } else {
                    System.out.println("Ingrese un numero:");
                    int num = scan.nextInt();
                    p1.meter(num);
                    System.out.println("Elemento" +num+ "agregado");
                }
                break;
            case 2: //sacar elemento
                if(p1.estaVacia()){
                    System.out.println("Error: la pila esta vacia");
                } else{
                    int elemento = p1.sacar();
                    System.out.println("Elemento sacado: "+elemento);
                }
                break;
            case 3: //verificar estado
                System.out.println("¿Vacia?" +p1.estaVacia()+ "¿Llena?" +p1.estaLlena());
                break;
            case 4: //verificar estado
                if(p1.estaVacia()){
                    System.out.println("ERROR: La pila esta vacia");
                } else {
                    Pila copia = p1.esCopia();
                    System.out.println("La copia se creo con exito;");
                }
                break;
            case 0: //salir
                System.out.println("Saliendo...");
                break;
        } 
    }while(opcion!= 0);
    scan.close();
    }
}
