package PractSegParcial.basico.primero;
/* Invertir elementos:
Cargar los números del 1 al 5 en una pila.
Imprimirlos en el orden en que salen de la pila (debería verse invertido).*/
public class Pila {
    private int[] elementos;
    private int cima;
    private final int MAX = 12;

    public Pila(){
        elementos = new int [MAX];
        cima = -1;
    }

    public boolean estaVacia(){
        if(cima == -1)
            return true;
         else 
            return false;
        
    }

    public boolean estaLlena(){
        if(cima == MAX - 1){
            return true;
        } else {
            return false;
        }
    }

    public void meter(int elem){
        cima ++;
        elementos[cima] = elem;
    }

    public int sacar(){
        int guardar;
        guardar = elementos[cima];
        cima--;
        return guardar;
    }

    public int elementoCima(){
        int x;
        x=this.sacar();
        this.meter(x);
        return x;
    }
}