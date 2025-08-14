package Exercicio2;

import java.util.Scanner;
import Exercicio2.Pessoa;

public class App {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Informe uma altura: ");
		double altura = teclado.nextDouble();
		
		System.out.print("Informe um peso: ");
		double peso = teclado.nextDouble();
		
		Pessoa pessoa = new Pessoa (altura, peso);
		
		System.out.println("O IMC da pessoa é: " + pessoa.calcularImc());

	}

}
