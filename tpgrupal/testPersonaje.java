package tpgrupal;
public class testPersonaje{
    public static void main(String[] args){
        Personaje p1 = new Personaje ("Richard", 94, 100,"Pistola");
        Personaje p2 = new Personaje ("Ricardo","Pistola");

        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Puede pelear: " + p1.puedePelear());
        int vidaRestante = p1.esAtaque(20);
        System.out.println("Vida restante después del ataque: " + vidaRestante);
        System.out.println(p1);

        System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Puede pelear: " + p2.puedePelear());
        vidaRestante = p2.esAtaque(20);
        System.out.println("Vida restante después del ataque: " + vidaRestante);
        System.out.println(p2);

    }
}   
