package SegParcial.ejer2;

public class PilaChar {
    private char[] elementos;
    private int cima;
    private final int MAX = 12;

    public PilaChar(){
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

    public char elementoCima(){
        char x;
        x=this.sacar();
        this.meter(x);
        return x;
    }

    public int tamano(){
        PilaChar aux = new PilaChar();
        int tam = 0;
        while(!this.estaVacia()){
            char guardar = this.sacar();
            aux.meter(guardar);
            tam = tam + 1;
        }
        while(!aux.estaVacia()){
            char guardar = aux.sacar();
            this.meter(guardar);
        }
        return tam;
   }
}
