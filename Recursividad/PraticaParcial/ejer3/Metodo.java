package Recursividad.PraticaParcial.ejer3;
// cant de vocales mayusculas en un string
public class Metodo {
    public static int contVocMayus(String palabra, int i, int cont){
        if(i==palabra.length()){
            return cont;
        } 
        char c = palabra.charAt(i);
        if(c== 'A' || c== 'E' || c== 'I' || c== 'O' || c== 'U'){
            return contVocMayus(palabra, i+1, cont+1);
        } else{
            return contVocMayus(palabra, i+1, cont);
        }
    }
}
