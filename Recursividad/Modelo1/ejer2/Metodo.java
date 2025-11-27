package Recursividad.Modelo1.ejer2;
// calculo de la suma de los digitos de un numero entero positivo
public class Metodo {
    public static int sumaDigitos(int num, int suma){
        if(num == 0){
            return suma;
        } else{
            return sumaDigitos(num/10, suma+(num%10));
        }
    }
}
