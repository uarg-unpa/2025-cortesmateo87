package Recursividad.Modelo2.ejer2;
//producto de los elementos del array
public class Metodo {
    public static int prodArray(int[] arr,int prod, int i){
        if(i == arr.length){
            return prod;
        } else{
            return prodArray(arr, prod*(arr[i]), i+1);
        }
    }
}
