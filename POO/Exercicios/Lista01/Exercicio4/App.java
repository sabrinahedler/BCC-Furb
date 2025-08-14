package Exercicio4;

import java.util.Scanner;
import Exercicio4.Pessoa;

public class App {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		/*
		 * Copie a classe Pessoa do pacote da questão anterior para um novo pacote.
		 * Adapte e desenhe o diagrama de classes para criar um programa que solicite ao
		 * usuário o nome, altura e peso de três pessoas. Depois que o usuário informar
		 * os dados das três pessoas, exiba os dados informados pelo usuário (nome,
		 * peso, altura) e seu respectivo IMC em ordem inversa de digitação, isto é,
		 * exibir primeiro os dados da terceira pessoa e por último da primeira pessoa.
		 */

		System.out.print("Informe a altura da pessoa 1: ");
		double altura = teclado.nextDouble();
		System.out.print("Informe o peso da pessoa 1: ");
		double peso = teclado.nextDouble();
		System.out.print("Informe o nome da pessoa 1: ");
		String nome = teclado.next();
		
		Pessoa p1 = new Pessoa(altura, peso, nome);

		System.out.print("Informe a altura da pessoa 2: ");
		altura = teclado.nextDouble();
		System.out.print("Informe o peso da pessoa 2: ");
		peso = teclado.nextDouble();
		System.out.print("Informe o nome da pessoa 2: ");
		nome = teclado.next();
		
		Pessoa p2 = new Pessoa(altura, peso, nome);
		
		System.out.print("Informe a altura da pessoa 3: ");
		altura = teclado.nextDouble();
		System.out.print("Informe o peso da pessoa 3: ");
		peso = teclado.nextDouble();
		System.out.print("Informe o nome da pessoa 3: ");
		nome = teclado.next();
		
		Pessoa p3 = new Pessoa(altura, peso, nome);
		
		System.out.print("==================================");
		System.out.print("INFORMAÇÕES PESSOA 3");
		System.out.print("Nome: " + p3.nome);
		System.out.print("Peso: " + p3.peso);
		System.out.print("Altura: " + p3.altura);
		System.out.print("IMC: " + p3.calcularImc());
		System.out.print("==================================");
		System.out.print("");
		System.out.print("==================================");
		System.out.print("INFORMAÇÕES PESSOA 2");
		System.out.print("Nome: " + p2.nome);
		System.out.print("Peso: " + p2.peso);
		System.out.print("Altura: " + p2.altura);
		System.out.print("IMC: " + p2.calcularImc());
		System.out.print("==================================");
		System.out.print("");
		System.out.print("==================================");
		System.out.print("INFORMAÇÕES PESSOA 1");
		System.out.print("Nome: " + p1.nome);
		System.out.print("Peso: " + p1.peso);
		System.out.print("Altura: " + p1.altura);
		System.out.print("IMC: " + p1.calcularImc());
		System.out.print("==================================");	
		
	}
}