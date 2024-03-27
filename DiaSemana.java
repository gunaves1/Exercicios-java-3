package estruturaCondicional;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia;
		
		System.out.println("Qual o dia da semana?");
		dia = ler.nextInt();
		
		if (dia == 2) {
			System.out.println("O dia é segunda");
		}
		else if (dia == 3) {
			System.out.println("O dia é terça");
		}
		else if (dia == 4) {
			System.out.println("O dia é quarta");
		}
		else if (dia == 5) {
			System.out.println("O dia é quinta");
		}
		else if (dia == 6) {
			System.out.println("O dia é sexta");
		}
		else if (dia == 7) {
			System.out.println("O dia é sábado");
		}
		else if (dia == 1) {
			System.out.println("O dia é domingo");
		}
		else {
			System.out.println("Dia Inválido");
		}
		ler.close();
	}
	
}
