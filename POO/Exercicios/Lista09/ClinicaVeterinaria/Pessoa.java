package ClinicaVeterinaria;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	
	public Pessoa (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public abstract String getResumo();
	
	public String getNome() {
		return nome;
	}
	
	public String getCPf () {
		return cpf;
	}
	
	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido!");
		} else {
			this.nome = nome;
		}
	}
	
	public void setCpf(String cpf) {
		if (cpf == null || cpf.isBlank()) {
			throw new IllegalArgumentException("Cpf inválido!");
		} else {
			this.cpf = cpf;
		}
	}
}
