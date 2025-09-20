package Prova;

public class Medico {

	private String nome;
	private String crm;

	// construtor da classe
	public Medico(String nome, String crm) {
		this.nome = nome;
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		if (crm.equals(null) || crm.isBlank()) {
			throw new IllegalArgumentException("CRM é inválido");
		} else {
			this.crm = crm;
		}
	}

	public String exibirDados() {
		return "Nome: " + nome + ", CRM: " + crm;
	}
}
