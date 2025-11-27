public class PilaEnteros{
    private int[] elementos; //array para almacenar los elementos
    private int cima;
    private final int MAX = 10; //capacidad maxima de la pila

    //constructor: inicializa el array y la cima
    public PilaEnteros(){
        elementos = new int [MAX]; //crear el array
        cima = -1;
    }

    //verificar si la pila esta vacia
    public boolean estaVacia(){
        //completar devolver true si cima indica que la pila esta vacia
        if(cima <=0){
            return true
        } else {
            return false;
        }
    }

    public boolean estaLlena(){
        //completar devolver true si cima esta en el limite del array
        if(cima == 9){
            return true
        } else {
            return false;
        }
    }

    //agregar elemento en la cima (push)
    public void meter(int elem){
        //completar incrementar cima y asignarel elemento
        cima ++;
        elementos[cima] = elem;
    }

    //saca y devuelve el elemento de la cima(pop)
    public int sacar(){
        //completar guardar el elemento de la cima, decreentar cima y devolverlo
        guardar = elementos[cima];
        elementos[cima] = 0;
        cima--;
        return guardar;
    }
}