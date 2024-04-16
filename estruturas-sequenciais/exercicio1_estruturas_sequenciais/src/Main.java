import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.printf("Digite um número: ");
		x = sc.nextDouble();
		System.out.printf("Digite outro número: ");
		y = sc.nextDouble();
		
		System.out.println("SOMA: " + (x + y));
		
	}

}
