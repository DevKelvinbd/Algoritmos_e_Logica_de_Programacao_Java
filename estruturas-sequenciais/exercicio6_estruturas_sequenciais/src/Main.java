import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double areaCirculo, areaQuadrado, areaRetangulo, areaTrapezio, areaTriangulo, A, B, C;
		
		System.out.println("Escreva os valores de A, B e C: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTriangulo = A * C / 2;
		areaCirculo = Math.pow(C, 2) * 3.14159;
		areaTrapezio = ((A + B) * C) / 2;
		areaQuadrado = Math.pow(B, 2);
		areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.2f\n", areaTriangulo);		
		System.out.printf("CIRCULO: %.2f\n", areaCirculo);
		System.out.printf("TRAPEZIO: %.2f\n", areaTrapezio);
		System.out.printf("RETANGULO: %.2f\n", areaRetangulo);
		System.out.printf("QUADRADO: %.2f\n", areaQuadrado);
	
	
	}

}
