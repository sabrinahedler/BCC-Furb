package Exercicio1;

public class App {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa (1.75, 78);
		
		System.out.println("O IMC da pessoa é: " + pessoa.calcularImc());
	}

}
