package estruturaCondicional;

import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final String senha, CPF;
		double valor, saldo, saldoFinal;
		String senha1, cpf;
		
		CPF = "123456789-10";
		senha = "123456";
		saldo = 1500;
		
		
		System.out.println("Insira seu CPF: ");
		cpf = ler.nextLine();
		
		if (cpf.equals(CPF)) {
			System.out.println("CPF valido");
			
			System.out.println("Insira a senha: ");
			senha1 = ler.nextLine();
		
			if (senha1.equals(senha)) {
				System.out.println("Senha Correta");
				
				System.out.println("Insira o valor do saque: ");
				valor = ler.nextDouble();
				
				if (valor > saldo) {
					System.out.println("Saldo insuficiente");
				}
				else {
					saldoFinal = saldo - valor;
					System.out.println("Saque realizado com sucesso! "+ saldoFinal);
				}
			}
			else{
				System.out.println("Senha incorreta");
			}
		}
		else {
			System.out.println("CPF invalido");
		}
		ler.close();
	}
}
