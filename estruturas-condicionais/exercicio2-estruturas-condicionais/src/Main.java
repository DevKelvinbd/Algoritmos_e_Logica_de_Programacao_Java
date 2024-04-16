import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Escreva um número inteiro: ");
		x = sc.nextInt();
				
		if (x % 2 == 0) {
			System.out.println("O número é par");			
		} else {
			System.out.println("O número é ímpar");
		}
	}

}
