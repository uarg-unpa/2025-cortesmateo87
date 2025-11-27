package Recursividad.Modelo1.ejer1;
//programar un algoritmo reecursivo que permita sumar los elementos de un vector
public class Metodo {
    public static int sumaArray(int[] arr, int suma, int i){
        if(i == arr.length){
            return suma;
        } else{
            return sumaArray(arr, suma+arr[i], i+1);
        }
    }
}
