package tp4.ejer6;

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

   public int tamano(){
    Cola c1 = new Cola();
    int tam = 0;
    while(!this.estaVacia()){
    int guardar = this.desencolar();
    c1.encolar(guardar);
    tam = tam + 1;
    }
    while(!c1.estaVacia()){
    int guardar = c1.desencolar();
    this.encolar(guardar);
    }
    return tam;
   }

   public boolean sonIguales(Cola c1){
    Cola aux = new Cola();
    Cola aux1 = new Cola();
    boolean soniguales = true;
    if(this.tamano() != c1.tamano()){
        soniguales = false;
        return soniguales;
    }
    while(!this.estaVacia()){
        int elem1 = this.desencolar();
        int elem2 = c1.desencolar();
        aux.encolar(elem1);
        aux1.encolar(elem2);
        if(elem1 != elem2){
            soniguales = false;
        }
    }
    while(!aux.estaVacia()){
        int guardar = aux.desencolar();
        int guardar1 = aux1.desencolar();
        this.encolar(guardar);
        c1.encolar(guardar1);
    }
    return soniguales;
   }
}
