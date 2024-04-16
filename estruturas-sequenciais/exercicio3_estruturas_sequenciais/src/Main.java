import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d, diferenca;
		
		System.out.printf("Digite o valor de A: ");
		a = sc.nextDouble();
		System.out.printf("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.printf("Digite o valor de C: ");
		c = sc.nextDouble();
		System.out.printf("Digite o valor de D: ");
		d = sc.nextDouble();
		
		diferenca = (a * b - c * d);
		
		System.out.printf("ÁREA: " + diferenca);	
		
	}

}
