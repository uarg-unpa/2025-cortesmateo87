package Recursividad.PraticaParcial.ejer2;
//palindromo
public class Metodo {
    public static boolean palindromo(String palabra, int i){
        if(i >= palabra.length() / 2){
            return true;
        }
        if(palabra.charAt(i) == palabra.charAt(palabra.length()- 1 - i)){
            return palindromo(palabra, i+1);
        }else{
            return false;
        }
    }
}
