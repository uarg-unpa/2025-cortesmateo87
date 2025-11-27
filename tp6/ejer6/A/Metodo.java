package tp6.ejer6.A;

public class Metodo {
    public static int metodo(int x, int y){
        if(x<=y){
            return 1;
        } else{
            return metodo(x,y+1)+1;
        }
    }
}
