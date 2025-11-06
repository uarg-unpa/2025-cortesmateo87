package PracPar2Colas.NoTanBasic.segundo;

public class Main {
    public static void main(String [] args){
        Cola c1 = new Cola();
        Cola c2 = new Cola();
        Cola c3 = new Cola();
        while(!c1.estaVacia()){
            int guardar = c1.desencolar();
            c3.encolar(guardar);
        }
        while(!c2.estaVacia()){
            int guardar = c2.desencolar();
            c3.encolar(guardar);
        }
    }
}
