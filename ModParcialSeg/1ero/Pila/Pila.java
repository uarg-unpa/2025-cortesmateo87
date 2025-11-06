package ModParcialSeg.Pila;

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

    public boolean eliminarElem(int x){
        Pila aux = new Pila();
        int cont = 0;
        boolean encontrado = false;
        while(!this.estaVacia()){
            int guardar = this.sacar();
            if(guardar != x){
                aux.meter(guardar);
                cont = cont + 1;
            } else{
                encontrado = true;
                break;
            }
        }
        while(!this.estaVacia()){
            int guardar = this.sacar();
            aux.meter(guardar);
        }
        while(!aux.estaVacia()){
            int guardar = aux.sacar();
            this.meter(guardar);
        }
        return encontrado;
    }

    public int eliminarElemContador(int x){
        Pila aux = new Pila();
        int cont = 0;
        boolean encontrado = false;
        while(!this.estaVacia()){
            int guardar = this.sacar();
            if(guardar != x){
                aux.meter(guardar);
                cont = cont + 1;
            } else{
                encontrado = true;
                break;
            }
        }
        while(!this.estaVacia()){
            int guardar = this.sacar();
            aux.meter(guardar);
        }
        while(!aux.estaVacia()){
            int guardar = aux.sacar();
            this.meter(guardar);
        }
        if(encontrado){
            return cont;
        } else {
            return -1;
        }
    }
}
