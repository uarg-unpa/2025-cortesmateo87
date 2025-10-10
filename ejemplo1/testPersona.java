package ejemplo1;
public class testPersona{
        public static void main(String[] args){
                int num;
                boolean esmayor;
                Persona persona1 = new Persona ("Franco","Herrera",38,4544545);
                Persona persona2 = new Persona ("Mateo","Mercado",20,56565656);
                persona1.MayorDeEdad();
                esmayor = persona2.MayorDeEdad();
        }
}