package aaaaaaaaaa.caracter;

public class Pila {
    private char[] elementos;
    private int cima;
    private final int MAX = 12;

    public Pila(){
        elementos = new char [MAX];
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

    public void meter(char elem){
        cima ++;
        elementos[cima] = elem;
    }

    public char sacar(){
        char guardar;
        guardar = elementos[cima];
        cima--;
        return guardar;
    }

    public int elementoCima(){
        char x;
        x=this.sacar();
        this.meter(x);
        return x;
    }
}
