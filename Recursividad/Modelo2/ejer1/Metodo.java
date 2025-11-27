package Recursividad.Modelo2.ejer1;
// maximo de un arreglo
public class Metodo {
    public static int maxArray(int[] arr, int i){
        if(i == arr.length - 1){
            return arr[i];
        }
        int maxResto = maxArray(arr, i+1);
        if(arr[i] > maxResto){
            return arr[i];
        }else{
            return maxResto;
        }
    }
}
