package Exercicio01;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		 Pessoa[] pessoas = new Pessoa[3];
		 
		 String nome = "";
		 double peso = 0;
		 double altura = 0;

	        Scanner teclado = new Scanner(System.in);
	        Pessoa p;
	        for (int i = 0; i < pessoas.length; i++) {
	            p = new Pessoa();

	            System.out.println("Informe o nome da pessoa " + i + ":");
	            nome = teclado.next();
	            p.setNome(nome);

	            System.out.println("Informe o peso da pessoa " + i + ":");
	            peso = teclado.nextDouble();
	            p.setPeso(peso); 

	            System.out.println("Informe a altura da pessoa " + i + ":");
	            altura = teclado.nextDouble();
	            p.setAltura(altura); 

	            pessoas[i] = p;
	        }

	        teclado.close();

	        for (int i = pessoas.length - 1; i >= 0; i--) {
	            Pessoa pDados = pessoas[i];
	            pDados.exibirDados();
	        } 
		
	}
}
