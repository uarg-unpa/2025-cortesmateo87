package PracPar2Colas.NoTanBasic.primer;

public class Main {
    public static void main(String [] args){
        Cola c1 = new Cola();
        Cola c2 = new Cola();
        Cola c3 = new Cola();
        if(c1.tamano() !=c2.tamano()){
            System.out.println("Error: Colas de distintos tamanos");
        } else{
            while(!c1.estaVacia()){
                int elem1 = c1.desencolar();
                int elem2 = c2.desencolar();
                c3.encolar(elem1);
                c3.encolar(elem2);
            }
        }

    }
}
