package PractSegParcial.TipoParcial.ttcuarto;

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

    public char elementoCima(){
        char x;
        x=this.sacar();
        this.meter(x);
        return x;
    }

    public Pila esCopia(){
        Pila aux = new Pila();
        Pila cop = new Pila();
        while(!this.estaVacia()){
            char guardar = this.sacar();
            aux.meter(guardar);
        }
        while(!aux.estaVacia()){
            char guardar2 = aux.sacar();
            cop.meter(guardar2);
            this.meter(guardar2);
        }
        return cop;
    } 

    public boolean esPalindromo(){
        if(this.estaVacia()){
            return false;
        }
        Pila cop2 = this.esCopia();
        Pila cop = this.esCopia();
        Pila aux = new Pila();
        while(!cop.estaVacia()){
            char guardar = cop.sacar();
            aux.meter(guardar);
        }
        boolean comparacion = true;
        while(!cop2.estaVacia()){
            char elem1 = cop2.sacar();
            char elem2 = aux.sacar();
            if(elem1 != elem2){
                comparacion = false;
                break;
            }
        }
        return comparacion;
    }
}
