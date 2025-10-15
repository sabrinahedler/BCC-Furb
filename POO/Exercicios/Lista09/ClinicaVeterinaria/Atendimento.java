package ClinicaVeterinaria;

import java.time.LocalDate;
public abstract class Atendimento implements Registravel {

	private int id;
	private LocalDate data;
	private String descricao;
	private Veterinario veterinario;
	private Animal animal;
	private double valorBase;
	
	public Atendimento() {
		this.data = LocalDate.of(0, 0, 0);
		this.descricao = "Não informada";
		this.animal = null;
	}
	
	public Atendimento(int id, LocalDate data, String descricao, Veterinario veterinario, Animal animal, double valorBase) {
		this.id = id;
		this.data = data;
		this.descricao = descricao;
		this.veterinario = veterinario;
		this.animal = animal;
		this.valorBase = valorBase;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}

	public int getId() {
		return id;
	}
	
	public LocalDate getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public Animal getAnimal() {
		return animal;
	}
	
	public double getValorBase() {
		return valorBase;
	}

	public abstract double calcularValor();
	
	public abstract String exibirResumo();

}


