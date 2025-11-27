package tp6.ejer9;

public class Metodo {
    public static boolean buscarElemento(int[] arr, int num, int i){
        if(i == arr.length){
            return false;
        }
        if(arr[i] == num){
            return true;
        }
        return buscarElemento(arr, num, i+1);
    }
}
