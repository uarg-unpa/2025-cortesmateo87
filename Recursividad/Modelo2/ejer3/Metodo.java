package Recursividad.Modelo2.ejer3;
//contar cant de numeros negativos en una array
public class Metodo {
    public static int contNegativos(int[] arr, int i, int cont){
        if(i == arr.length){
            return cont;
        }
        if(arr[i]<0){
            return contNegativos(arr, i+1, cont+1);
        }else{
            return contNegativos(arr, i+1, cont);
        }
    }
}
