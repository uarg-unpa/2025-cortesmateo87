package PracPar2Colas.ologica.segundo;

public class Cola {
   private final int maxcola=5;
   private int elementos[];
   private int ultimo;
   
   public Cola(){
      elementos=new int[maxcola];
      ultimo = -1;   
   }
   
   public boolean estaVacia() {
      return (ultimo==-1);
   }
   
   public boolean estaLlena() {
      return (ultimo==maxcola-1);
   }
   
   public void encolar(int elem) {      
      if (!this.estaLlena()){
         ultimo++;
         elementos[ultimo]=elem;         
      }
   }
   
   public int desencolar() {
      int aux=elementos[0];
      for (int i=0; i<ultimo; i++) 
         elementos[i] = elementos[i+1];
      ultimo--;     
      return aux;
   }

   public int verFrente(){
    if (this.estaVacia()){
        System.out.println("Cola Vacia");
        return -1;
    }
    return elementos[0];
   }

   public boolean buscar(int elem){
    boolean buscar = false;
    Cola aux = new Cola();
    while(!this.estaVacia()){
        int guardar = this.desencolar();
        aux.encolar(guardar);
        if(elem == guardar){
            buscar = true;
        }
    }
    while(!aux.estaVacia()){
        int guardar = aux.desencolar();
        this.encolar(guardar);
    }
    return buscar;
   }
}
