package ClinicaVeterinaria;

import java.time.LocalDate;

public class AtendimentoEmergencia extends Atendimento implements Pagavel {

	private int nivelUrgencia;
	private double taxaEmergencia;

	public AtendimentoEmergencia(int id, LocalDate data, String descricao, Veterinario veterinario, Animal animal,
			double valorBase, int nivelUrgencia, double taxaEmergencia) {
		super(id, data, descricao, veterinario, animal, valorBase);
		this.nivelUrgencia = nivelUrgencia;
		this.taxaEmergencia = taxaEmergencia;
	}

	public void setNivelUrgencia(int nivelUrgencia) {
		this.nivelUrgencia = nivelUrgencia;
	}

	public void setTaxaEmergencia(double taxaEmergencia) {
		this.taxaEmergencia = taxaEmergencia;
	}

	public int getNivelUrgencia() {
		return nivelUrgencia;
	}

	public double getTaxaEmergencia() {
		return taxaEmergencia;
	}

	@Override
	public double calcularValor() {
		return getValorBase() + taxaEmergencia;
	}

	@Override
	public String exibirResumo() {
		return "O atendimento realizado no animal " + getAnimal().getNome() + " teve um custo de R$ " + calcularValor();
	}

	@Override
	public double getValorTotal() {
		return calcularValor();
	}

	@Override
	public String getDescricaoPagamento() {
		return "O atendimento de emergencia teve um custo total de R$ " + getValorTotal();
	}

	 @Override
	 public void registrarNoSistema() {
		 System.out.println("Atendimento n° " + getId() + " registrado com sucesso!");
	 }
}
