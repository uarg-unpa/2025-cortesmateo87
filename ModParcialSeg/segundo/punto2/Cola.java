package ModParcialSeg.segundo.punto2;

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

   public double promNeg(){
    int suma = 0;
    int cont = 0;
    double promedio;
    Cola aux = new Cola();
    while(!this.estaVacia()){
        int guardar = this.desencolar();
        if(guardar<0){
            cont = cont + 1;
            suma = suma + guardar;
        }
        aux.encolar(guardar);
    }
    while(!aux.estaVacia()){
        int guardar = aux.desencolar();
        this.encolar(guardar);
    }
    if(cont != 0){
        promedio = suma / cont;
        return promedio;
    } else{
        promedio = -1;
        return promedio;
    }
   }
}
