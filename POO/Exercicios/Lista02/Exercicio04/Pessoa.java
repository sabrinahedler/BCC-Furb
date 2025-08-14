package Exercicio04;

public class Pessoa {
	
	String nome;
	int idade;
	double altura;
	
	public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
		this.altura = altura;
    }
	
	public String apresentar() {
		return "Olá, eu sou " + nome + ", tenho " + idade + " anos e " + altura + " de altura";
	}

	public int calcularIdadeEm(int ano) {
		int calculo = ano - 2025;
		calculo = calculo + idade;
		return calculo;
	}
	
	public boolean ehMaiorIdade() {
		if (idade < 18) {
			return false;
		} else {
			return true;
		}
	}
}
