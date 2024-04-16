import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;
		System.out.println("Escreva o Valor de X e Y respectivamente: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Quadrante 1");
			} else if (x < 0 && y > 0) {
				System.out.println("Quadrante 2");
			} else if (x < 0 && y < 0) {
				System.out.println("Quadrante 3");
			} else if (x > 0 && y < 0) {
				System.out.println("Quadrante 4");
			}
			
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		System.out.println("FIM");
		
		
	}

}
