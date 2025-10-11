import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ValOrigC;
		System.out.print("Ingrese el primer valor (A) :");
		int A = scan.nextInt();
		System.out.print("Ingrese el segundo valor (B) :");
		int B = scan.nextInt();
		System.out.print("Ingrese el tercer valor (C) :");
		int C = scan.nextInt();
		
		ValOrigC = C;
		B = A;
		C = A;
		A = ValOrigC;	
	
		System.out.println("Valor de A: " + A);
		System.out.println("Valor de B: " + B);
		System.out.println("Valor de C: " + C);
		scan.close();
	}
}
