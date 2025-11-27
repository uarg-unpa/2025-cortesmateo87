package tp6.ejer7;

public class Metodo {
    public static int cantvocales(String palabra, int p, int cont){
        if(p == palabra.length()){
            return cont;
        }
        char c = palabra.charAt(p);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return cantvocales(palabra, p+1, cont+1);
        } else{
            return cantvocales(palabra, p+1, cont);
        }
    }
}
