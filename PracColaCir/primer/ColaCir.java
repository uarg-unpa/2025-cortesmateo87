package PracColaCir.primer;

public class ColaCir {
    private final int maxcola=10;
	private char[] elementos;
	private int frente, ultimo;
	
	public ColaCir()
	{
		elementos = new char[maxcola];
		frente=0;
		ultimo=0;
	}
	
	public boolean estaVacia()
	{
		return (ultimo == frente);
	}
   
	public boolean estaLlena()
	{
		int sigUltimo=siguiente(ultimo);
		return (sigUltimo == frente);
	}
	
	private int siguiente(int subind)
	{
		if (subind == maxcola -1)
			return 0;
		else
			return ++subind;
	}
	
	public void encolar(char elem){		
		if(!this.estaLlena()){
            ultimo =siguiente(ultimo);
		    elementos[ultimo]=elem;	
        }else{
            System.out.println("Cola llena");
        }
	}
	
	public char desencolar(){
		if(!this.estaVacia()){
            frente =siguiente(frente);
		    return elementos[frente];
        } else{
            System.out.println("Cola vacia");
            return '\0';
        }
    }
}
