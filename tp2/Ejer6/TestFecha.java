package tp2.Ejer6;

public class TestFecha {
    public static void main(String[] args){
        Fecha f1 = new Fecha(13, 12, 2020);
        Fecha f2 = new Fecha(31, 2, 2025);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println(f1.nombreMes());
        System.out.println(f2.nombreMes());
    }
}
