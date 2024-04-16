import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		System.out.printf("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = Math.pow(raio, 2) * 3.1415;
		
		System.out.printf("ÁREA: %.4f", area);	
		
	}

}
