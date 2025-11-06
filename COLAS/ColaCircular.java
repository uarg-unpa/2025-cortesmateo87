public class ColaCircular {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;
    public ColaCircular(){
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
    }
    //METODOS QUE CAMBIAN
    public boolean estaVacia(){
        return frente == fin; //Vacia si ambos punteros coinciden
    }

    public boolean estaLlena(){
        return (fin + 1) % MAX == frente;
    }

    public void encolar(int elem){
        elementos[fin] = elem;
        fin = (fin + 1) % MAX; //Avanza circularmente
    }

    public int desencolar(){
        int aux = elementos[frente];
        frente = (frente + 1) % MAX; //Avanza circularmente
        return aux;
    }
}
