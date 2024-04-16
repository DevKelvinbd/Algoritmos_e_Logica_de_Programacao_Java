/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x, y;
		
		x = 0;
		y = 0;
		
		System.out.println("Escreva respectivamente os pontos X e Y: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Quadrante 01");
			} else if(x < 0 && y > 0) {
				System.out.println("Quadrante 02");
			} else if(x < 0 && y < 0) {
				System.out.println("Quadrante 03");
			} else {
				System.out.println("Quadrante 04");
			}
			
			System.out.println("Escreva outros pontos X e Y: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}	
	}
}
