package ClinicaVeterinaria;

import java.time.LocalDate;

public class Procedimento {

	private String nome;
	private double custo;
	private String observacoes;
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setCusto(double custo) {
		this.custo = custo;
	}
	
	void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	String getNome() {
		return nome;
	}
	
	double getCusto () {
		return custo;
	}

	String getObservacoes() {
		return observacoes;
	}

	
	public Procedimento() {
		this.nome = "Não informado";
		this.custo = 0;
		this.observacoes = "Não cadastrada";
	}
	
	public Procedimento(String nome, double custo, String observacoes) {
		this.nome = nome;
		this.custo = custo;
		this.observacoes = observacoes;
	}
}
