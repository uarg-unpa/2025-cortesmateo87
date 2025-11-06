//copia
package PractSegParcial.basico.stercero;
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

    public Pila esCopia(){
        Pila cop = new Pila();
        Pila aux = new Pila();
        while(!this.estaVacia()){
            int guardar = this.sacar();
            aux.meter(guardar);
        }
        while(!aux.estaVacia()){
            int guardar = aux.sacar();
            cop.meter(guardar);
        }
        return cop;
    }
}
