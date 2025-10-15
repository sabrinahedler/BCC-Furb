package ClinicaVeterinaria;

public class Animal {
	private String nome;
	private String especie;
	private int idade;
	private String historico;
	private Tutor tutor;

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
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade do animal não pode ser negativa!");
		} else {
			this.idade = idade;
		}
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public String getNome() {
		return nome;
	}

	public String getEspecie() {
		return especie;
	}

	public int getIdade() {
		return idade;
	}

	public String getHistorico() {
		return historico;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public String adicionarHistorico(String descricao) {
		historico = descricao;
		return historico;
	}
}