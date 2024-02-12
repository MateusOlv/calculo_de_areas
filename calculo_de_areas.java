package exerc_java;

import java.util.Scanner;

public class calculo_de_areas {

	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.printf("TRIÂNGULO: %.3f%n", (a * c) / 2);
		System.out.printf("CÍRCULO: %.3f\n", 3.14159 * Math.pow(c, 2));
		System.out.printf("TRAPÉZIO: %.3f\n", (a + b) * c / 2);
		System.out.printf("QUADRADO: %.3f%n", b * b);
		System.out.printf("RETÂNGULO: %.3f%n", a * b);
		
		sc.close();
	}

}
