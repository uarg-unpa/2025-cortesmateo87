package PractSegParcial.TipoParcial.zquinto;

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

    public int tamano(){
        Pila aux = new Pila();
        int tam = 0;
        while(!this.estaVacia()){
            int guardar = this.sacar();
            aux.meter(guardar);
            tam = tam + 1;
        }
        while(!aux.estaVacia()){
            int guardar = aux.sacar();
            this.meter(guardar);
        }
        return tam;
    }
}
