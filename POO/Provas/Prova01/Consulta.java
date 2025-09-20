package Prova;

import java.time.LocalDate;

public class Consulta {

	private LocalDate data;
	private String observacoes;
	
	// temmos que instanciar paciente e medico como atributos na classe para conseguir colocar no construtor
	private Paciente paciente;
	private Medico medico;
	
	// construtor da classe
	public Consulta (Paciente paciente, Medico medico, LocalDate data) {
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
	}
	
	public void adicionarObservacao(String texto) {
		StringBuilder sb = new StringBuilder();
		if (observacoes != null) {
			sb.append(observacoes);
		}
		sb.append(texto);
		observacoes = sb.toString();
	}
	
	public String exibirDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("Informações da consulta").append("\n");
		sb.append("Data: ").append(data).append("\n");
		sb.append("Médico: ").append(medico.exibirDados()).append("\n");
		sb.append("Paciente: ").append(paciente.exibirDados()).append("\n");
		return sb.toString();
	}
}
