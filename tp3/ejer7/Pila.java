package tp3.ejer7;

public class Pila {
    private int[] elementos;
    private int cima;
    private final int MAX = 12;

    public Pila(){
        elementos = new int[MAX];
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

    public Pila esCopia(){
        Pila aux = new Pila();
        Pila cop = new Pila();
        while(!this.estaVacia()){
            int guardar = this.sacar();
            aux.meter(guardar);
        }
        while(!aux.estaVacia()){
            int guardar2 = aux.sacar();
            cop.meter(guardar2);
            this.meter(guardar2);
        }
        return cop;
    }
}
