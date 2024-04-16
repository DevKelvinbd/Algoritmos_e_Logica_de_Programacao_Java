/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo. */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int escolha, countAlcool, countGasolina, countDiesel;
		
		countAlcool = 0;
		countGasolina = 0;
		countDiesel = 0;
		escolha = 0;
		
		System.out.println("Escreva seu combustível favorito:");
		System.out.println("1. Álcool - 2. Gasolina - 3. Diesel");
		escolha = sc.nextInt();
		
		while(escolha != 4) {
			if(escolha == 1) {
				countAlcool = countAlcool + 1;
			} else if(escolha == 2) {
				countGasolina = countGasolina + 1;
			} else if(escolha == 3) {
				countDiesel = countDiesel + 1;
			} else {
				System.out.println("Digite um valor válido");
			}
			System.out.println("Escreva seu combustível favorito:");
			escolha = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + countAlcool);
		System.out.println("Gasolina: " + countGasolina);
		System.out.println("Diesel: " + countDiesel);
	}
}