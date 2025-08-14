package Exercicio2;

public class Pessoa {
	
	double altura;
	double peso;
	
	 public Pessoa(double altura, double peso) {
	        this.altura = altura;
	        this.peso = peso;
	    }

	    public double calcularImc() {
	        return peso / (altura * altura);
	    }
}
