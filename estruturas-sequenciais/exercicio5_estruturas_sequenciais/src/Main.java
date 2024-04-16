import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double codigoP1, numeroPecas1, valorUnP1, codigoP2, numeroPecas2, valorUnP2, totalApagar;
		
		System.out.println("Escreva as informações da peça 1: ");
		codigoP1 = sc.nextDouble();
		numeroPecas1 = sc.nextDouble();
		valorUnP1 = sc.nextDouble();
		
		System.out.println("Escreva as informações da peça 2: ");
		codigoP2 = sc.nextDouble();
		numeroPecas2 = sc.nextDouble();
		valorUnP2 = sc.nextDouble();
		
		
		totalApagar = valorUnP2 * numeroPecas2 + valorUnP1 * numeroPecas1;
		
		System.out.println("TOTAL A PAGAR: " + totalApagar);
	}

}



