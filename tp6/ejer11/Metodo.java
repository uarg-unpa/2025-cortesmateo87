package tp6.ejer11;

public class Metodo {
    public static int buscarElemento(int[] arr, int num, int i, int cont){
        if(i == arr.length){
            return cont;
        } 
        if(arr[i] == num){
            return buscarElemento(arr, num, i+1, cont+1);
        } else{
            return buscarElemento(arr, num, i+1, cont);
        }
    }
}
