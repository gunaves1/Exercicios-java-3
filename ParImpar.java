package estruturaCondicional;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um valor: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número informado é par");
		}
		else {
			System.out.println("O número informado é impar");
		}
		ler.close();
	}

}
