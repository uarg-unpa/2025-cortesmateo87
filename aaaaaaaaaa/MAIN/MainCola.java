package aaaaaaaaaa.MAIN;

import java.io.Console;

public class MainCola {
    public static void main(String[] args) {
        ColaInt cola = new ColaInt();  // Creamos una nueva instancia de la cola
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("0 Salir");
            System.out.println("1 Agregar elemento");
            System.out.println("2 Calcular y mostrar promedio de elementos positivos");
            System.out.println("3 Imprimir elementos de la cola");
            opcion = Console.readInt("Elige una opción: ");

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                case 1:
                    // Opción para agregar un elemento
                    System.out.println("AGREGAR ELEMENTO");
                    if (!cola.estaLlena()) {
                        int elemento = Console.readInt("Ingresa el elemento a agregar: ");
                        cola.insertar(elemento);  // Agrega el elemento a la cola
                    } else {
                        System.out.println("La cola está llena. No se puede agregar más elementos.");
                    }
                    break;
                case 2:
                    // Opción calcular promedio
                    System.out.println("PROMEDIO DE ELEMENTOS POSITIVOS");

                    System.out.println("El promedio de los elementos positivos es: " + cola.Promedio());
                    break;
                case 3:
                    // Opción imprimir elementos
                    System.out.println("ELEMENTOS DE LA COLA:");
                    if (cola.imprimir())
                    {
                        System.out.println("Se imprimieron todos los elementos");
                    }
                    else {
                        System.out.println("No hay elementos en la cola");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige otra opción.");
            }
        } while (opcion != 0);
    }
}
