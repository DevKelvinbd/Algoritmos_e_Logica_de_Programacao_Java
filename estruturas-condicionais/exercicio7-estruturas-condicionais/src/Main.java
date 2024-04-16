import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite o Eixo X: ");
		x = sc.nextDouble();
		System.out.println("Digite o Eixo Y: ");
		y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Quadrante 1");
		} else if (x < 0 && y > 0) {
			System.out.println("Quadrante 2");
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		} else if (x > 0 &&  y < 0) {
			System.out.println("Quadrante 4");
		} else {
			System.out.println("Origem");
		}
	}
}
