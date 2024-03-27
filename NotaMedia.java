package estruturaCondicional;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		double nota1,nota2,nota3,nota4, media;
		
		System.out.println("Informe sua primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Informe sua segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Informe sua terceira nota: ");
		nota3 = ler.nextDouble();
		System.out.println("Informe sua quarta nota: ");
		nota4 = ler.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		if (media >= 6) {
			System.out.println("Aprovado: " + media);
		} else {
			System.out.println("Reprovado: " + media);
		}
		ler.close();
	}
}
