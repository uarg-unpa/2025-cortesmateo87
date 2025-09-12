import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la inicial de un dia de la semana (I en caso de miercoles)");
        char DIA = scan.next().charAt(0);
        switch(DIA)
        {
            case 'L':{
                System.out.println("Hoy no tengo programacion");
                break;
            }
            case 'M':{
                System.out.println("Hoy tengo programacion");
                break;
            }
            case 'I':{
                System.out.println("Hoy tengo programacion");
                break;
            }
            case 'J':{
                System.out.println("Hoy tengo programacion");
                break;
            }
            case 'V':{
                System.out.println("Hoy no tengo programacion");
                break;
            }
            case 'S':{
                System.out.println("Hoy no tengo programacion");
                break;
            }
            case 'D':{
                System.out.println("Hoy no tengo programacion");
                break;
            }
            case 'l':{
                System.out.println("Hoy no tengo programacion");
                break;
            }
            case 'm':{
                System.out.println("Hoy tengo programacion");
                break;
            }
            case 'i':{
                System.out.println("Hoy tengo programacion");
                break;
            }
            case 'j':{
                System.out.println("Hoy tengo programacion");
                break;
            }
            case 'v':{
                System.out.println("Hoy no tengo programacion");
                break;
            }
            case 's':{
                System.out.println("Hoy no tengo programacion");
                break;
            }
            case 'd':{
                System.out.println("Hoy no tengo programacion");
                break;
            }
            default:{
                System.out.print("No se ingreso ninguna inicial de un dia de la semana");
            }
            scan.close();
        }
    }
}