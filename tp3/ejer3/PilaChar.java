package tp3.ejer3;

public class PilaChar {
    private char[] elementos;
    private int cima;
    private final int MAX = 12;

    public PilaChar(){
        elementos = new char [MAX];
        cima = -1;
    }

    public boolean estaVacia(){
        if(cima <=0){
            return true;
        } else {
            return false;
        }
    }

    public boolean estaLlena(){
        if(cima == 9){
            return true;
        } else {
            return false;
        }
    }

    public void meter(char elem){
        cima ++;
        elementos[cima] = elem;
    }

    public int sacar(){
        guardar = elementos[cima];
        elementos[cima] = 0;
        cima--;
        return guardar;
    }
}
