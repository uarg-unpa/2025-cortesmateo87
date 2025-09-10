package practicadomicilio;

public class TestPersona {
    public static void main(String[] args){
        Domicilio dom1 = new Domicilio("Av. Rivadavia",45);
        Persona p1 = new Persona("Mateo",20,"46.454.454",'H',70.7,1.85,dom1);
        System.out.println(p1);
        System.out.println(p1.infoDomicilio());
        Persona p2 = new Persona("Pedro");
        System.out.println(p2); //dom por defecto
    }
}
