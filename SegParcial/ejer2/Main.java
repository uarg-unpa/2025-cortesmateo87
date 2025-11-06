package SegParcial.ejer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){ 
    Scanner scan = new Scanner (System.in);
    PilaChar p1 = new PilaChar();
    PilaChar p2 = new PilaChar();
    ColaChar q1 = new ColaChar();
    int opcion;
    
    do{
        System.out.println("\n === Menu De Pila ===");
        System.out.println("1. Meter Elemento");
        System.out.println("2. Sacar Elemento");
        System.out.println("3. Verificar Estado");
        System.out.println("4. Intercalar Pilas p1 y p2");
        System.out.println("0. Salir");
        System.out.println("Opcion:");
        opcion = scan.nextInt();

        switch(opcion){
            case 1: //Meter elemento
                if(p1.estaLlena()){
                    System.out.println("Error: la pila esta llena");
                } else {
                    System.out.println("Ingrese un numero:");
                    char elem = scan.next().charAt(0);
                    p1.meter(elem);
                    System.out.println("Elemento" +elem+ "agregado");
                }
                break;
            case 2: //sacar elemento
                if(p1.estaVacia()){
                    System.out.println("Error: la pila esta vacia");
                } else{
                    char elemento = p1.sacar();
                    System.out.println("Elemento sacado: "+elemento);
                }
                break;
            case 3: //verificar estado
                System.out.println("¿Vacia?" +p1.estaVacia()+ "¿Llena?" +p1.estaLlena());
                break;
            case 4:
                if(p1.tamano() != p2.tamano()){
                    System.out.println("Los tamaños de las pilas son distintos");
                } else {
                    PilaChar aux = new PilaChar();
                    PilaChar aux2 = new PilaChar();
                    while(!p1.estaVacia()){
                        char guardar = p1.sacar();
                        char guardar2 = p2.sacar();
                        q1.encolar(guardar);
                        q1.encolar(guardar2);
                        aux.meter(guardar);
                        aux2.meter(guardar2);
                    }
                    while(!aux.estaVacia()){
                        char guardar = aux.sacar();
                        char guardar2 = aux2.sacar();
                        p1.meter(guardar);
                        p2.meter(guardar2);
                    }
                }
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
