package tp6.ejer10;

public class Metodo {
    public static int minimoArray(int[] arr, int i){
        if(i == arr.length - 1){
            return arr[i];
        }
        int minimoResto = minimoArray(arr, i+1);
        if(arr[i] < minimoResto){
            return arr[i];
        }else{
            return minimoResto;
        }
    }
}
