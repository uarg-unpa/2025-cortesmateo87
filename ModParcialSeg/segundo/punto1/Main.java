package ModParcialSeg.segundo.punto1;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Pila p1 = new Pila();
    int opcion;
    
    do{
        System.out.println("\n === Menu De Pila ===");
        System.out.println("1. Meter Elemento");
        System.out.println("2. Sacar Elemento");
        System.out.println("3. Verificar Estado");
        System.out.println("4. Elemimar Ocurrencias de un numero especifico");
        System.out.println("0. Salir");
        System.out.println("Opcion:");
        opcion = scan.nextInt();
        scan.nextLine();

        switch(opcion){
            case 1:
                if(p1.estaLlena()){
                    System.out.println("Error: la pila esta llena");
                } else {
                    System.out.println("Ingrese un numero:");
                    int num = scan.nextInt();
                    p1.meter(num);
                    System.out.println("Elemento" +num+ "agregado");
                }
                break;
            case 2:
                if(p1.estaVacia()){
                    System.out.println("Error: la pila esta vacia");
                } else{
                    int elemento = p1.sacar();
                    System.out.println("Elemento sacado: "+elemento);
                }
                break;
            case 3:
                System.out.println("¿Vacia?" +p1.estaVacia()+ "¿Llena?" +p1.estaLlena());
                break;
            case 4:
                System.out.println("Ingrese el numero a eliminar:");
                int x = scan.nextInt();
                scan.nextLine();
                int contador = p1.buscarElemento(x);
                if(contador == -1){
                    System.out.println("Elemento no encontrado");
                }else{
                    System.out.println("Numero de elementos eliminados: "+contador);
                    System.out.println("Pila resultante: ");
                    Pila aux = new Pila();
                    while(!p1.estaVacia()){
                        int guardar = p1.sacar();
                        System.out.println(guardar);
                        aux.meter(guardar);
                    }
                    while(!aux.estaVacia()){
                        int guardar = aux.sacar();
                        p1.meter(guardar);
                    }
                }
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion Invalida");
        } 
    }while(opcion!= 0);
    scan.close();
    }
}

