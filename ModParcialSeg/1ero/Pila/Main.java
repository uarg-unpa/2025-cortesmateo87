package ModParcialSeg.Pila;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Pila p1 = new Pila();
        System.out.println("Ingrese el numero a eliminar de la pila:");
        int x = scan.nextInt();
        int cont = p1.eliminarElemContador(x);
        if(cont != -1){
            System.out.println("Elemento eliminado, elementos movidos hasta encontrarlo: "+cont);
        }else{
             System.out.println("No se encontro el elemento en la pila.");
        }
        scan.close();
    }
}
