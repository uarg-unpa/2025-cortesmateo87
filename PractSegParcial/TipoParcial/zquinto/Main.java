package PractSegParcial.TipoParcial.zquinto;

public class Main {
    public static void main(String [] args){
        Pila p1 = new Pila();
        Pila p2 = new Pila();
        Pila p3 = new Pila();
        if(p1.tamano() != p2.tamano()){
            System.out.println("Error: Los tamanos son distintos");
            return;
        }
        while(!p1.estaVacia()){
            int elem1 = p1.sacar();
            int elem2 = p2.sacar();
            p3.meter(elem1);
            p3.meter(elem2);
        }
    }
}
