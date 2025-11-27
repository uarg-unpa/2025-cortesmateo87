package Recursividad.PraticaParcial.ejer4;
//primer indice donde aparece un numero en un array
public class Metodo {
    public static int indiceNum(int[] arr,int num, int i){
        if(i == arr.length){
            return -1;
        }
        if(num == arr[i]){
            return i;
        }else{
            return indiceNum(arr, num, i+1);
        }
    }
}
