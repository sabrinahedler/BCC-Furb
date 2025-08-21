package Exercicio03;

public class ContaBancaria {

	private String numero;
	private String titular;
	private double saldo;

	void setNumero(String numero) {
		this.numero = numero;
	}

	void setTitular(String titular) {
		this.titular = titular;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	String getNumero() {
		return numero;
	}

	String getTitular() {
		return titular;
	}

	double getSaldo() {
		return saldo;
	}

	void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor para deposito inválido!");
		} else {
			saldo = saldo + valor;
		}
	}

	void sacar(double valor) {
		if (valor <= 0 || valor > saldo) {
			System.out.println("Valor para saque inválido!");
		} else {
			saldo = saldo - valor;
		}
	}

	void transferir(ContaBancaria contaDestino, double valor) {
		if (valor <= 0 || valor > saldo) {
			System.out.println("Valor de transferência inválido!");
		} else {
			contaDestino.setSaldo(saldo + valor);
			saldo = saldo - valor;
		}
	}

}
