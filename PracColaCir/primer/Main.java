package PracColaCir.primer;

public class Main {
    public static void main(String [] args){
        ColaCir c1 = new ColaCir();
        c1.encolar('A');
        c1.encolar('B');
        c1.encolar('C');
        c1.desencolar();
        c1.encolar('D');
        c1.encolar('E');
        c1.encolar('F');
        System.out.println("Cola Circular:");
        while(!c1.estaVacia()){
            System.out.println(c1.desencolar()+ " ");
        }
    }
}
