package Practicapar1;
import java.util.Scanner;
public class Testempleado{
   public static void main(String[] args){

      //EMPLEADO 1
      Scanner scan = new Scanner(System.in);
      System.out.println("Ingrese los datos del departamento");
      System.out.println("Nombre:");
      String n1 = scan.nextLine();
      System.out.println("Piso:");
      int p1 = scan.nextInt();
      scan.nextLine();

      Departamento d1 = new Departamento(n1, p1);
      
      System.out.println("\nIngrese los datos del empleado");
      System.out.println("Legajo:");
      int l1 = scan.nextInt();
      scan.nextLine();
      System.out.println("Sueldo:");
      Double s1 = scan.nextDouble();
      scan.nextLine();
      System.out.println("Es Jefe?(true / false):");
      boolean j1 = scan.nextBoolean();
      scan.nextLine();
      
      Empleado e1 = new Empleado(l1, s1, j1, d1);

      //EMPLEADO 2
      System.out.println("\nIngrese los datos del segundo departamento");
      System.out.println("Nombre:");
      String n2 = scan.nextLine();
      System.out.println("Piso:");
      int p2 = scan.nextInt();
      scan.nextLine();

      Departamento d2 = new Departamento(n2, p2);

      System.out.println("\nIngrese los datos del segundo empleado");
      System.out.println("Legajo:");
      int l2 = scan.nextInt();
      scan.nextLine();
      System.out.println("Sueldo:");
      Double s2  = scan.nextDouble();
      scan.nextLine();
      System.out.println("Es Jefe?(true / false):");
      boolean j2 = scan.nextBoolean();
      scan.nextLine();

      Empleado e2 = new Empleado(l2, s2, j2, d2);

      System.out.println("Datos de los empleado:");
      System.out.println(e1);
      System.out.println(e2);

      System.out.println("Son Jefes?");
      System.out.println(e1.esJefe());
      System.out.println(e2.esJefe());

      System.out.println("Aumento sueldo empleado 1:");
      e1.aumentarSueldo(19000);
      System.out.println(e1.getSueldo());

      System.out.println("Calculos de Bonos:");
      System.out.println(e1.calcularBono());
      System.out.println(e2.calcularBono());

      scan.close();
   }
}
