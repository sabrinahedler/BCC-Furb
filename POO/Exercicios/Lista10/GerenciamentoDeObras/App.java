package GerenciamentoDeObras;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Pessoa engenheiro = new Pessoa(1, "123.456.789-00", "Carlos Silva", "Engenheiro Civil");
		Pessoa arquiteta = new Pessoa(2, "987.654.321-00", "Mariana Souza", "Arquiteta");

		ProjetoPublico projetoPublico1 = new ProjetoPublico(1001, LocalDate.of(2025, 1, 10),
				"Construção de ponte municipal", LocalDate.of(2025, 2, 1), LocalDate.of(2025, 8, 1));

		ProjetoPrivado projetoPrivado1 = new ProjetoPrivado(2001, LocalDate.of(2025, 3, 5), "Residencial Bela Vista",
				"Urbana", 1500.0);

		projetoPublico1.getResponsaveis().add(engenheiro);
		projetoPrivado1.getResponsaveis().add(arquiteta);
		
		System.out.println("Escolha o tipo de relatório a ser gerado:");
		System.out.println("1. Relatório Completo (todos os projetos)");
		System.out.println("2. Relatório por Tipo (Público ou Privado)");
		System.out.println("3. Relatório por Profissional");
		System.out.println("4. Relatório Resumido");
		System.out.print("Digite sua opção: ");

		int escolha = teclado.nextInt();
		teclado.nextLine();

		System.out.println("\n--- RELATÓRIO GERADO ---");

		switch (escolha) {
		case 1:
			Relatorio[] relatoriosCompletos = { projetoPublico1, projetoPrivado1 };
			for (Relatorio rel : relatoriosCompletos) {
				System.out.println(rel.gerarRelatorio());
				System.out.println("----------------------------");
			}
			break;

		case 2:
			System.out.print("Deseja ver apenas projetos (P)Públicos ou (R)privados? ");
			String tipo = teclado.nextLine().toUpperCase();
			if (tipo.equals("P")) {
				System.out.println(projetoPublico1.gerarRelatorio());
			} else if (tipo.equals("R")) {
				System.out.println(projetoPrivado1.gerarRelatorio());
			} else {
				System.out.println("Tipo inválido.");
			}
			break;

		case 3:
			System.out.print("Digite o nome do profissional: ");
			String nomeBusca = teclado.nextLine();

			if (projetoPublico1.getResponsaveis().stream()
					.anyMatch(p -> p.getNomeCompleto().equalsIgnoreCase(nomeBusca))) {
				System.out.println("Projeto Público associado a " + nomeBusca + ":");
				System.out.println(projetoPublico1.gerarRelatorio());
			}
			if (projetoPrivado1.getResponsaveis().stream()
					.anyMatch(p -> p.getNomeCompleto().equalsIgnoreCase(nomeBusca))) {
				System.out.println("Projeto Privado associado a " + nomeBusca + ":");
				System.out.println(projetoPrivado1.gerarRelatorio());
			}
			break;

		case 4:
			System.out.println("Relatório Resumido:");
			System.out.println("Projeto Público - ID: " + projetoPublico1.getIdentificador() + " | Tipo: "
					+ projetoPublico1.getTipoProjeto());
			System.out.println("Projeto Privado - ID: " + projetoPrivado1.getIdentificador() + " | Tipo: "
					+ projetoPrivado1.getTipoProjeto());
			break;

		default:
			System.out.println("Opção inválida.");
			break;
		}

		teclado.close();
	}
}
