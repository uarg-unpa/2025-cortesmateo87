import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int May;
        System.out.println("Cual es el mayor de 3 numeros ingresados:");
        System.out.print("Ingrese el Primer Valor:");
        int V1 = scan.nextInt();
        System.out.print("Ingrese el Segundo Valor:");
        int V2 = scan.nextInt();
        System.out.print("Ingrese el Tercer Valor:");
        int V3 = scan.nextInt();

        May = V1;

        if(V2>May){
            May=V2;
            if(V3>May){
                May=V3;
            }
        }

        System.out.print("El numero mayor de los ingresados es: " +May);
        scan.close();
    }
}
