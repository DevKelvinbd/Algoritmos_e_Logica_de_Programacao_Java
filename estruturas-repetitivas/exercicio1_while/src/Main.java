import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double senha;

		System.out.println("Escreva a senha: ");
		senha = sc.nextDouble();

		while (senha != 2002) {
			System.out.println("Senha Incorreta! Digite a senha novamente: ");
			senha = sc.nextDouble();
		}

		System.out.println("ACESSO LIBERADO!");

		sc.close();
	}
}

//OK