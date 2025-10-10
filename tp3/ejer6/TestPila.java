package tp3.ejer6;
import java.util.Scanner;
public class TestPila {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Pila p1 = new Pila();

        int opcion;
    
    do{
        System.out.println("\n === Menu De Pila ===");
        System.out.println("1. PUNTO A");
        System.out.println("2. PUNTO B");
        System.out.println("3. PUNTO C");
        System.out.println("4. PUNTO D");
        System.out.println("5. PUNTO E");
        System.out.println("6. PUNTO F");
        System.out.println("0. Salir");
        System.out.println("Opcion:");
        opcion = scan.nextInt();

        switch(opcion){
            case 1: //Meter elemento
                if(p1.estaVacia()){
                    System.out.println("ERROR: la pila esta vacia");
                } else {
                    int x, primer;
                    primer = p1.sacar();
                    x = p1.sacar();
                    System.out.println("El valor que tomo X fue: "+x);
                }
                break;
            case 2: //sacar elemento
                if(p1.estaVacia()){
                    System.out.println("ERROR: la pila esta vacia");
                } else {
                    int x, primer;
                    primer = p1.sacar();
                    x = p1.sacar();
                    p1.meter(x);
                    p1.meter(primer);
                    System.out.println("El valor que tomo X fue: "+x);
                }
                break;
            case 3: //verificar estado
                if(p1.estaVacia()){
                    System.out.println("ERROR: la pila esta vacia");
                } else {
                    System.out.println("Ingrese un Numero:");
                    int n = scan.nextInt();
                    scan.nextLine();
                    int x=0;
                    for(int i=0;i<n;i++){
                        x = p1.sacar();
                    }
                    System.out.println("El valor que tomo X fue: "+x);
                }
                break;
            case 4: //verificar estado
                if(p1.estaVacia()){
                    System.out.println("ERROR: la pila esta vacia");
                } else {
                    System.out.println("Ingrese un Numero:");
                    int n = scan.nextInt();
                    scan.nextLine();
                    Pila aux = new Pila();
                    int x = 0;
                    for(int i=0;i<n;i++){
                        int guardar = p1.sacar();
                        aux.meter(guardar);

                        if(i==n-1){
                            x = guardar;
                        }
                    }
                    while(!aux.estaVacia()){
                        p1.meter(aux.sacar());
                    }
                    System.out.println("El valor que tomo X fue: "+x);
                }
                break;
            case 5: //Meter elemento
                if(p1.estaVacia()){
                    System.out.println("ERROR: la pila esta vacia");
                } else {
                    int x=0;
                    while(!p1.estaVacia()){
                        x = p1.sacar();
                    }
                    System.out.println("El ultimo elemento de la pila es: "+x);
                }
                break;
            case 6: //Meter elemento
                if(p1.estaVacia()){
                    System.out.println("ERROR: la pila esta vacia");
                } else {
                    Pila aux = new Pila();
                    int x = 0;
                    while(!p1.estaVacia()){
                        int guardar = p1.sacar();
                        aux.meter(guardar);
                        x = guardar;
                    }
                    while(!aux.estaVacia()){
                        p1.meter(aux.sacar());
                    }
                    System.out.println("El valor ultimo valor es: "+x);
                }
                break;
            case 0: //salir
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion Invalida");
        } 
    }while(opcion!= 0);
    scan.close();
    }
}
