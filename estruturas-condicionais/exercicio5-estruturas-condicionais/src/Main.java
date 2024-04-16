import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int item, quant;
		double total;
		
		System.out.println("Cardápio: ");
		System.out.println("1 Cachorro quente - R$4,00");
		System.out.println("2 X-Salada - R$4,50");
		System.out.println("3 X-Bacon - R$5,00");
		System.out.println("4 Torrada Simples - R$2,00");
		System.out.println("5 Refrigerante - R$1,50");
		
		System.out.println("Qual item você quer?");
		item = sc.nextInt();
		System.out.println("Quantos você quer?");
		quant = sc.nextInt();
		
		if (item == 1) {
			total = quant * 4.0;
		} else if (item == 2){
			total = quant * 4.5;
		} else if (item == 3) {
			total = quant * 5.0;
		} else if (item == 4){
			total = quant * 2.0;
		} else {
			total = quant * 1.5;
		}		
		
		System.out.printf("Valor total = R$ %.2f reais.",  total);
	}
}
