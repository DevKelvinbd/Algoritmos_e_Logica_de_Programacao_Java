import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double number, hora, valorHr, salario;
		
		System.out.printf("Número do Funcionário: ");
		number = sc.nextDouble();
		System.out.printf("Quantas horas trabalha: ");
		hora = sc.nextDouble();
		System.out.printf("Valor da sua hora: ");
		valorHr = sc.nextDouble();
		
		salario = valorHr * hora;
		
		System.out.println("NUMBER: " + number);
		System.out.printf("SALARIO U$ " + salario);
		
	}

}
