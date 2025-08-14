package Exercicio4;

public class Pessoa {

	double altura;
	double peso;
	String nome;
	
	 public Pessoa(double altura, double peso, String nome) {
	        this.altura = altura;
	        this.peso = peso;
	        this.nome = nome;
	    }

	    public double calcularImc() {
	        return peso / (altura * altura);
	    }
}

