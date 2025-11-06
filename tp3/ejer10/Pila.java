package tp3.ejer10;

import tp3.ejer8.Cadena;

public class Pila {
private char[] elementos;
    private int cima;
    private final int MAX = 12;

    public Pila(){
        elementos = new char [MAX];
        cima = -1;
    }

    public boolean estaVacia(){
        if(cima == -1)
            return true;
         else 
            return false;
        
    }

    public boolean estaLlena(){
        if(cima == MAX - 1){
            return true;
        } else {
            return false;
        }
    }

    public void meter(char elem){
        cima ++;
        elementos[cima] = elem;
    }

    public char sacar(){
        char guardar;
        guardar = elementos[cima];
        cima--;
        return guardar;
    }

    public Cadena esCopia(){
        Cadena aux = new Cadena();
        Cadena cop = new Cadena();
        while(!this.estaVacia()){
            char guardar = this.sacar();
            aux.meter(guardar);
        }
        while(!aux.estaVacia()){
            char guardar2 = aux.sacar();
            cop.meter(guardar2);
            this.meter(guardar2);
        }
        return cop;
    }
    public boolean coinciden(char apertura, char cierre){
        return (apertura == '(' && cierre == ')') || (apertura == '{' && cierre == '}') || (apertura == '[' && cierre == ']');
    }
    public boolean esCorrecta(String expresion){
        for(int i = 0;i<expresion.length();i++){
            char c = expresion.charAt(i);
            if(c =='(' || c == '{' || c == '['){
                if(this.estaLlena()){
                    return false;
                }
                this.meter(c);
            }
            else if(c == ')' || c == '}' || c == ']'){
                if(this.estaVacia()){
                    return false;
                }
                char tope = this.sacar();
                if(!coinciden(tope,c)){
                    return false;
                }
            }
        }
    return this.estaVacia();
    }
}
