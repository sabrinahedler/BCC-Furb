package ClinicaVeterinaria;

import java.util.ArrayList;
import java.util.List;

public class Tutor extends Pessoa implements Registravel {

	private String telefone;
	private String endereco;
	private List<Animal> animais;
	
	public Tutor() {
		super("Não cadastrado", "000000");
		this.telefone = "";
		this.endereco = "Não cadastrado";
		this.animais = new ArrayList<>();
	}

	public Tutor(String nome, String cpf, String telefone, String endereco) {
		super(nome, cpf);
		this.telefone = telefone;
		this.endereco = endereco;
		this.animais = new ArrayList<>();
	}

	public void setTelefone(String telefone) {
		if (telefone == null || telefone.isBlank()) {
			throw new IllegalArgumentException("Tutor sem telefone!");
		} else {
			this.telefone = telefone;
		}
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void adicionarAnimal(Animal animal) {
		this.animais.add(animal);
		animal.setTutor(this);
	}
	
	@Override
	public String getResumo() {
		return getNome() + " é um tutor.";
	}
	
	 @Override
	 public void registrarNoSistema() {
		 System.out.println("Tutor " + getNome() + "registrado no sistema!");
	 }
}

