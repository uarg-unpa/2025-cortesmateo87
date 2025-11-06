package PracPar2Colas.zaplicacion.AtencionAlCliente;

public class Main {
    public static void main(String [] args){
        Cola c1 = new Cola();
        Cola aux = new Cola();
        System.out.println("Siguiente cliente a atender:" +c1.atenderSig());
        System.out.println("Turnos siguientes:");
        while(!c1.estaVacia()){
            int guardar = c1.desencolar();
            aux.encolar(guardar);
            System.out.println(+guardar);
        }
        while(!aux.estaVacia()){
            int guardar = aux.desencolar();
            c1.encolar(guardar);
        }
    }
}
