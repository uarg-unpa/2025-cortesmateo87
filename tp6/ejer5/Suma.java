package tp6.ejer5;

public class Suma {
    public static int suma(int num){
        if(num <=1){
            return num;
        } else{
            return num + suma(num - 2);
        }
    }
}
