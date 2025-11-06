package tp3.ejer3;

import java.util.Scanner;

public class TestChar {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        PilaChar pila = new PilaChar();
        System.out.println("Ingrese una palabra: ");
        String palabra = scan.nextLine();
        int i;
        for(i=0; i<palabra.length() ;i++){
            char letra = palabra.charAt(i);
            if(!pila.estaLlena()){
                pila.meter(letra);
            }
        }
        while(!pila.estaVacia()){
            char x = pila.sacar();
            System.out.print(x);
        }
        scan.close();
    }
}
