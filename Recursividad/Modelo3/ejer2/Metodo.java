package Recursividad.Modelo3.ejer2;
//calcule la suma de los primeros n numeros pares naturales.
public class Metodo {
    public static int sumParesNaturales(int num, int i, int suma){
        if(num==i){
            return suma;
        } else{
            return sumParesNaturales(num, i+1, suma+(i+1)*2);
        }
    }
}
