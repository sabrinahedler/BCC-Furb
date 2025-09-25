package ClinicaVeterinaria;

public class Animal {
	private String nome;
	private String especie;
	private int idade;
	private String historico;
	private Tutor tutor;

	void setNome(String nome) {
		this.nome = nome;
	}

	void setEspecie(String especie) {
		this.especie = especie;
	}

	void setIdade(int idade) {

		if (idade < 0) {
			throw new IllegalArgumentException("Idade do animal não pode ser negativa!");
		} else {
			this.idade = idade;
		}
	}

	void setHistorico(String historico) {
		this.historico = historico;
	}

	void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	String getNome() {
		return nome;
	}

	String getEspecie() {
		return especie;
	}

	int getIdade() {
		return idade;
	}

	String getHistorico() {
		return historico;
	}

	Tutor getTutor() {
		return tutor;
	}

	public Animal() {
		this.nome = "Não cadastrado";
		this.especie = "Não cadastrado";
		this.idade = 0;
		this.historico = "Não possui";
	}

	public Animal(String nome, String especie, int idade, String historico) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.historico = historico;
	}


	public String adicionarHistorico(String descricao) {
		historico = descricao;
		return historico;
	}
}