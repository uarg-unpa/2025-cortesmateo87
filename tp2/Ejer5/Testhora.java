package tp2.Ejer5;

public class Testhora {
    public static void main(String[] args){
        Hora h1 = new Hora(05, 48, 23);
        Hora h2 = new Hora(25,42,70);

        System.out.println("HORA 1:");
        System.out.println(h1);
        System.out.println("Hora en minutos:");
        System.out.println(h1.horaenMinutos());
        System.out.println("Hora cambiada a 19");
        h1.setHora(19);
        System.out.println(h1);

        System.out.println("HORA 2:");
        System.out.println(h2);
        System.out.println("Hora cambiada a 22");
        h2.setHora(22);
        System.out.println(h2);

    }
}
