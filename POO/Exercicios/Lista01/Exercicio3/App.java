package Exercicio3;

import java.util.Scanner;
import Exercicio3.Pessoa;

	public class App {
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner (System.in);
				
			System.out.print("Informe a altura da pessoa 1: ");
			double altura = teclado.nextDouble();
				
			System.out.print("Informe o peso da pessoa 1: ");
			double peso = teclado.nextDouble();
				
			Pessoa p1 = new Pessoa (altura, peso);
			
			System.out.print("Informe a altura da pessoa 2: ");
			altura = teclado.nextDouble();
				
			System.out.print("Informe o peso da pessoa 2: ");
			peso = teclado.nextDouble();
			
			Pessoa p2 = new Pessoa (altura, peso);
			
			System.out.print("Informe a altura da pessoa 3: ");
			altura = teclado.nextDouble();
				
			System.out.print("Informe o peso da pessoa 3: ");
			peso = teclado.nextDouble();
			
			Pessoa p3 = new Pessoa (altura, peso);
				
			System.out.println("O IMC da pessoa é: " + p1.calcularImc());
			System.out.println("O IMC da pessoa é: " + p2.calcularImc());
			System.out.println("O IMC da pessoa é: " + p3.calcularImc());

			}
	}

