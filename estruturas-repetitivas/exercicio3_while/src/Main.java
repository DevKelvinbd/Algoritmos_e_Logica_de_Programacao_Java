import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int escolha, gasolina, alcool, diesel;
		
		System.out.println("Combustível Favorito: ");
		System.out.println("1 Álcool");
		System.out.println("2 Gasolina");
		System.out.println("3 Diesel");
		
		escolha = sc.nextInt();
		
		gasolina = 0;
		alcool = 0;
		diesel = 0;
		
		while (escolha == 1 || escolha == 2 || escolha == 3 || escolha != 4) {
			while (escolha > 4 || escolha <= 0) {
				System.out.println("Escreva um código válido!");
				escolha = sc.nextInt();
			}
			
			if (escolha == 1) {
				alcool += 1;
			} else if(escolha == 2) {
				gasolina += 1;
			} else if(escolha == 3) {
				diesel += 1;
			}
			escolha = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
