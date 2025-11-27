package tp6.ejer8;

public class Metodo {
    public static int suma(int num){
        if(num == 0){
            return 0;
        } else{
            return num + suma(num - 1);
        }
    }
}
