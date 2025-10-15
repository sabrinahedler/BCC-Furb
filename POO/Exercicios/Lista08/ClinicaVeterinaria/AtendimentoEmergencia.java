package ClinicaVeterinaria;

import java.time.LocalDate;

public class AtendimentoEmergencia extends Atendimento {

	private int nivelUrgencia;

	public AtendimentoEmergencia(LocalDate data, String descricao, Veterinario veterinario, Animal animal,
			int nivelUrgencia) {
		super(data, descricao, veterinario, animal);
		this.nivelUrgencia = nivelUrgencia;
	}

	public int getNivelUrgencia() {
		return nivelUrgencia;
	}

	public void setNivelUrgencia(int nivelUrgencia) {
		this.nivelUrgencia = nivelUrgencia;
	}

	@Override
	public void registrar() {
		System.out.println("Consulta de emergência registrada para " + getAnimal().getNome() + " (urgência: "
				+ nivelUrgencia + ") com o veterinário " + getVeterinario().getNome() + ".");
	}
}
