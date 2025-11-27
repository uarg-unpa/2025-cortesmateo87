package Recursividad.PraticaParcial.ejer1;
//contar multiplos de 3 en un array
public class Metodo {
    public static int multTres(int[] arr, int i, int cont){
        if(i == arr.length){
            return cont;
        }
        if(arr[i]%3==0){
            return multTres(arr, i+1, cont+1);
        }else{
            return multTres(arr, i+1, cont);
        }
    }
}
