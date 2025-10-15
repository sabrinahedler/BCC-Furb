package ClinicaVeterinaria;

public class Procedimento {

	private String nome;
	private double custo;
	private String observacoes;

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
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getNome() {
		return nome;
	}

	public double getCusto () {
		return custo;
	}

	public String getObservacoes() {
		return observacoes;
	}
}
