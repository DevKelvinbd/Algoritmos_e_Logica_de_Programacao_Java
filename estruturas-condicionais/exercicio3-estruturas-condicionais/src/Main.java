import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, divisao;
		
		System.out.println("Escreva dois números: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if ((x % y == 0) || (y % x == 0)) {
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não são Múltiplos");
		}	
	}
}
