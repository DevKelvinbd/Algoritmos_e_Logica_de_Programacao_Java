import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, duracao, fim;
		
		System.out.println("Escreva a hora inicial do Jogo: ");
		x = sc.nextInt();
		
		System.out.println("Escreva a hora final do Jogo: ");
		y = sc.nextInt();
		
		if (x > y) {
			duracao = x - y;
			fim = 24 - duracao;
			System.out.println("O jogo durou " + fim + " horas.");
		} else if (y > x) {
			duracao = y - x;
			System.out.println("O jogo durou " + duracao + " horas.");
		} else {
			System.out.println("O jogo durou 24 horas!");
		}
	}
}
