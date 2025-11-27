package ModParcialSeg.segundo.punto1;

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

    public int buscarElemento(int x){
        Pila aux = new Pila();
        int cont = 0;
        while(!this.estaVacia()){
            int guardar = this.sacar();
            if(guardar == x){
                cont = cont + 1;
            } else{
                aux.meter(guardar);
            }
        }
        while(!aux.estaVacia()){
                int guardar1 = aux.sacar();
                this.meter(guardar1);
            }
        if(cont !=0){
            return cont;
        }else{
            cont = -1;
            return cont;
        }
    }
 
}
