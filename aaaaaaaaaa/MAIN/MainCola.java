package aaaaaaaaaa.MAIN;

import java.io.Console;
import java.util.Scanner;

public class MainCola {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cola c1 = new Cola();
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("0 Salir");
            System.out.println("1 Agregar elemento");
            System.out.println("2 Sacar elemento");
            System.out.println("3 Verificar estado");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                case 1:
                    // Opción para agregar un elemento
                    System.out.println("AGREGAR ELEMENTO");
                    if (!c1.estaLlena()) {
                        System.out.println("Ingrese el elemento a agregar:");
                        int elemento = scan.nextInt();
                        scan.nextLine();
                        c1.encolar(elemento);  // Agrega el elemento a la cola
                    } else {
                        System.out.println("La cola está llena. No se puede agregar más elementos.");
                    }
                    break;
                case 2:
                    if(c1.estaVacia()){
                        System.out.println("Error: la pila esta vacia");
                    } else{
                        int elemento = c1.desencolar();
                        System.out.println("Elemento sacado: "+elemento);
                    }
                    break;
                case 3:
                    System.out.println("¿Vacia?" +c1.estaVacia()+ "¿Llena?" +c1.estaLlena());
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige otra opción.");
            }
        } while (opcion != 0);
    }
}
