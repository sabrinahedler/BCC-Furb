package ClinicaVeterinaria;

public class Veterinario {

	private String nome;
	private String crmv;
	private String especialidade;
	private Veterinario supervisor;
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setCrmv(String crmv) {
		this.crmv = crmv;
	}
	
	void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	void setSupervisor(Veterinario supervisor) {
		this.supervisor = supervisor;
	}

	String getNome() {
		return nome;
	}

	String getCrmv() {
		return crmv;
	}

	String getEspecialidade() {
		return especialidade;
	}

	
	Veterinario getSupervisor() {
		return supervisor;
	}
	
	public Veterinario() {
		this.nome = "Não cadastrado";
		this.crmv = "Não cadastrado";
		this.especialidade = "Não cadastrado";
	}
	
	public Veterinario(String nome, String crmv, String especialidade) {
		this.nome = nome;
		this.crmv = crmv;
		this.especialidade = especialidade;
	}
	
	String retornaDados () {
		return "O veterinário " + this.nome + " possui especialização em " + this.especialidade;
	}
	
}
