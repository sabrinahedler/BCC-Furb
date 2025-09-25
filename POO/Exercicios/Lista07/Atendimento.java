package ClinicaVeterinaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Atendimento {

	private LocalDate data;
	private String descricao;
	private Veterinario veterinario;
	private Animal animal;
	ArrayList<Procedimento> ListaDeProcedimentos = new ArrayList<>();
	
	void setData(LocalDate data) {
		this.data = data;
	}
	
	void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	void setAnimal(Animal animal) {
		this.animal = animal;
	}

	LocalDate getData() {
		return data;
	}

	String getDescricao() {
		return descricao;
	}

	Veterinario getVeterinario() {
		return veterinario;
	}

	Animal getAnimal() {
		return animal;
	}

	
	public Atendimento() {
		this.data = LocalDate.of(0, 0, 0);
		this.descricao = "Não informada";
		this.animal = null;
	}
	
	public Atendimento(LocalDate data, String descricao, Veterinario veterinario, Animal animal) {
		this.data = data;
		this.descricao = descricao;
		this.veterinario = veterinario;
		this.animal = animal;
	}
	
	public void adicionarProcedimento (Procedimento procedimento) {
		ListaDeProcedimentos.add(procedimento);
	}
	
	public void removerProcedimento (Procedimento procedimento) {
		ListaDeProcedimentos.remove(procedimento);
	}
	
	public void registrar() {
		System.out.println("Consulta registrada para " + animal.getNome() + " com o veterinário " + veterinario.getNome() + ".");
	}

	String exibirDados() {
		return "Foram realizados " + ListaDeProcedimentos.size() + " procedimento(s) durante o atendimento, pelo veterinário " + veterinario.getNome();
	}
	
}


