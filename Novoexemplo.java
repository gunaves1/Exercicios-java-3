package estruturaCondicional;

import java.util.Scanner;

public class Novoexemplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um valor: ");
		numero = ler.nextInt();
		
		if (numero > 0) {
			System.out.println("O valor informado é positivo");
		}
		else if (numero < 0) {
			System.out.println("O valor informado é negativo");
		}
		else {
			System.out.println("O valor é igual a 0");
		}
		ler.close();
	}
}
