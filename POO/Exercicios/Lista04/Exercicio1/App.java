package Exercicio1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		Funcionario[] funcionarios = new Funcionario[5];

		for (int i = 0; i < 5; i++) {
			Funcionario funcionario = new Funcionario();

			System.out.println("Funcionário " + (i + 1) + ":");
			System.out.print("Digite o nome do funcionário: ");
			funcionario.setNome(teclado.nextLine());

			double salario = -1;
			while (salario < 0) {
				System.out.print("Digite o salário do funcionário: ");
				salario = teclado.nextDouble();
				if (salario < 0) {
					System.out.println("Valor inválido");
				}
			}
			
			funcionario.setSalario(salario);
			teclado.nextLine();

			funcionarios[i] = funcionario;
		}

		System.out.println(" ");
		
		for (Funcionario f : funcionarios) {
			System.out
					.println("Nome: " + f.getNome() + ". Salário: " + f.getSalario() + ". IRPF: R$" + f.calcularIrpf());
		}

		teclado.close();
	}
}
