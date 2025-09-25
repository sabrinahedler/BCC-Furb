package ClinicaVeterinaria;

public class Tutor {

	private String nome;
	private String telefone;
	private String endereco;

	void setNome(String nome) {
		this.nome = nome;
	}

	void setTelefone(String telefone) {
		if (telefone == null || telefone.isBlank()) {
			throw new IllegalArgumentException("Tutor sem telefone!");
		} else {
			this.telefone = telefone;
		}
	}

	void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	String getNome() {
		return nome;
	}

	String getTelefone() {
		return telefone;
	}

	String endereco() {
		return endereco;
	}

	public Tutor() {
		this.nome = "Não cadastrado";
		this.telefone = "";
		this.endereco = "Não cadastrado";
	}

	public Tutor(String nome, String telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
}
