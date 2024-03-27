package estruturaCondicional;

import java.util.Scanner;

public class MesInformado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mes;

		System.out.println("Informe um valor referente a um mês: ");
		mes = ler.nextInt();

		if (mes == 1) {
			System.out.println("O mês é janeiro");
		}
		else if (mes == 2) {
			System.out.println("O mês é fevereiro");
		}
		else if (mes == 3) {
			System.out.println("O mês é março");
		}
		else if (mes == 4) {
			System.out.println("O mês é abril");
		}
		else if (mes == 5) {
			System.out.println("O mês é maio");
		}
		else if (mes == 6) {
			System.out.println("O mês é junho");
		}
		else if (mes == 7) {
			System.out.println("O mês é julho");
		}
		else if (mes == 8) {
			System.out.println("O mês é agosto");
		}
		else if (mes == 9) {
			System.out.println("O mês é setembro");
		}
		else if (mes == 10) {
			System.out.println("O mês é outubro");
		}
		else if (mes == 11) {
			System.out.println("O mês é novembro");
		}
		else if (mes == 12) {
			System.out.println("O mês é dezembro");
		}
		else {
			System.out.println("O mês é invalido");
		}
		ler.close();
	}

}
