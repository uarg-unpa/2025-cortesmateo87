public class Cola {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;
    public Cola(){
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
    }
    public boolean estaVacia(){
        return fin == 0; //Vacia si no se ha encolado nada
    }
    
    public boolean estaLlena(){
        return fin == MAX; //Llena si fin llega al final
    }

    public void insertar(int elem){
        elementos[fin] = elem;
        fin++; //Avanza linealmente
    }

    public int desencolar(){
        int aux = elementos[frente]; //Toma el primer elemento
        //Desplaza los elementos restantes hacia la izquierda
        for(int i=0;i<fin-1;i++){
            elementos[i] = elementos[i+1];
        }
        fin--; //reduce fin tras el desplazamiento
        return aux;
    }

    public int peek(){
        return elementos[frente]; //visualiza el primer elemento
    }
    
}
