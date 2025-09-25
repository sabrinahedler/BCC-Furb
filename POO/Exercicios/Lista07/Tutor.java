package ClinicaVeterinaria;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

	private String nome;
	private String telefone;
	private String endereco;
	private List<Animal> animais;

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

	String getEndereco() {
		return endereco;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public Tutor() {
		this.nome = "Não cadastrado";
		this.telefone = "";
		this.endereco = "Não cadastrado";
		this.animais = new ArrayList<>();
	}

	public Tutor(String nome, String telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.animais = new ArrayList<>();
	}

	public void adicionarAnimal(Animal animal) {
		this.animais.add(animal);
		animal.setTutor(this);
	}
}

