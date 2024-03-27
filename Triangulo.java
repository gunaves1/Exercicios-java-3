package estruturaCondicional;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.println("Informe o valor do primeiro lado: ");
		lado1 = ler.nextInt();
		
		System.out.println("Informe o valor do segundo lado: ");
		lado2 = ler.nextInt();
		
		System.out.println("Informe o valor do terceiro lado: ");
		lado3 = ler.nextInt();
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("O triângulo é equilátero");
		}
		else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("O triângulo é isósceles");
		}
		else {
			System.out.println("O triângulo é escaleno");
		}
		ler.close();
	}

}
