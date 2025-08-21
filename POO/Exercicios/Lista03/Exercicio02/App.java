package Exercicio02;

public class App {

	public static void main(String[] args) {

		/*
		 * No main, crie um produto, faça vendas, reposições e tente alterar o preço com
		 * valores inválidos para verificar a proteção dos atributos
		 */
		
		Produto p1 = new Produto ();
		p1.setNome("Shampoo");
		p1.setPreco(5.00);
		p1.setEstoque(20);
		
		System.out.println(p1.vender(10));
		System.out.println(p1.repor(20));
		
		Produto p2 = new Produto ();
		p2.setNome("Condicionador");
		p2.setPreco(-1);
		p2.setEstoque(10);
		

	}
}
