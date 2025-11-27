package tp6.ejer4;

public class Suma {
    public static int suma(int num){
        if(num == 1){
            return 1;
        } else {
            return num + suma(num - 1);
        }
    }
}
