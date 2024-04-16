import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.printf("Escreva um numero inteiro: ");
		x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("É um número positivo!");
		} else if (x < 0) {
			System.out.println("É um número negativo!");
		} else {
			System.out.println("É neutro!");
		}
		
		sc.close();
		

	}

}
