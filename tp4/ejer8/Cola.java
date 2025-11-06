package tp4.ejer8;

public class Cola {
   private final int maxcola=5;
   private char elementos[];
   private int ultimo;
   
   public Cola(){
      elementos=new char[maxcola];
      ultimo = -1;   
   }
   
   public boolean estaVacia() {
      return (ultimo==-1);
   }
   
   public boolean estaLlena() {
      return (ultimo==maxcola-1);
   }
    
   public void encolar(char elem) {      
      if (!this.estaLlena()){
         ultimo++;
         elementos[ultimo]=elem;         
      }
   }
   
   public char desencolar() {
      char aux=elementos[0];
      for (int i=0; i<ultimo; i++) 
         elementos[i] = elementos[i+1];
      ultimo--;     
      return aux;
   }

   public char verFrente(){
    if (this.estaVacia()){
        System.out.println("Cola Vacia");
        return '\0';
    }
    return elementos[0];
   }
}
