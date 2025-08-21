package Exercicio02;

public class Produto {

	private String nome;
	private double preco;
	private int estoque;

	void setNome(String nome) {
		this.nome = nome;
	}

	void setPreco(double preco) {

		if (preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("Preço não pode ser negativo");
		}
	}

	void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	String getNome() {
		return nome;
	}

	Double getPreco() {
		return preco;
	}

	int getEstoque() {
		return estoque;
	}

	public String vender(int quantidade) {

		if (quantidade > estoque) {
			return "Não há estoque suficiente!";
		} else {
			estoque = estoque - quantidade;
			return quantidade + " produtos vendidos!";
		}
	} 

	public String repor(int quantidade) {

		if (quantidade > 0) {
			estoque = estoque + quantidade;
			return quantidade + " produtos adicionados";
		} else {
			return "Valor inválido!";
		}
	}

}
