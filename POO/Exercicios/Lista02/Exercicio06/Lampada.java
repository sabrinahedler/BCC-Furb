package Exercicio06;

public class Lampada {

	boolean ligada;
	String cor;
	int potencia;

	public Lampada(boolean ligada, String cor, int potencia) {
		this.ligada = ligada;
		this.cor = cor;
		this.potencia = potencia;
	}

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public void alterarEstado() {
		if (ligada == true) {
			ligada = false;
		} else {
			ligada = true;
		}
	}

	public void trocarCor(String novaCor) {
		cor = novaCor;
	}

	public String mostrarStatus() {
		return "A lampada está ligada: " + ligada + ", possui a cor " + cor + " e uma potencia de " + potencia
				+ " volts.";
	}

}
