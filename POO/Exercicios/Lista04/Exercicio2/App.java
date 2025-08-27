package Exercicio2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Quantos livros irá cadastrar? ");
		int numLivros = teclado.nextInt();
		teclado.nextLine();

		Livro[] livros = new Livro[numLivros];

		for (int i = 0; i < numLivros; i++) {
			System.out.println("Cadastro do Livro " + (i + 1) + ":");
			System.out.print("Título: ");
			String titulo = teclado.nextLine();

			System.out.print("Autor: ");
			String autor = teclado.nextLine();

			System.out.print("Ano de Publicação: ");
			int anoPublicacao = teclado.nextInt();
			teclado.nextLine();

			livros[i] = new Livro(titulo, autor, anoPublicacao);
		}

		System.out.println(" ");
		
		for (Livro livro : livros) {
			System.out.println(livro.exibirInfo());
		}

		System.out.println(" ");
		System.out.println("Total de livros: " + Livro.getTotalLivros());

		if (numLivros > 0) {
			System.out.println(" ");
			System.out.println(livros[0].exibirInfo(true));
		}

		teclado.close();
	}
}
