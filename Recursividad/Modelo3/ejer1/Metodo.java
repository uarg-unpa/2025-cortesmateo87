package Recursividad.Modelo3.ejer1;
//calculo de a elevado a la potencia b
public class Metodo {
    public static int potencia(int num1, int num2,int i, int prod){
        if(num2 == i){
            return prod;
        }else{
            return potencia(num1, num2, i+1, prod*num1);
        }
    }
}
