package ClinicaVeterinaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		// Criação de tutores
		Tutor tutor1 = new Tutor("Jean", "9 9999-9999", "Blumenau");

		// Criação de animais
		Animal animal1 = new Animal("Lucky", "Vira-lata", 9, "");
		Animal animal2 = new Animal("Kelly", "Vira-lata", 5, "");
		Animal animal3 = new Animal("Rex", "Pastor Alemão", 3, "");

		// Criação de veterinários
		Veterinario vet1 = new Veterinario("Dr. Carlos", "CRMV-SP 1234", "Clínico Geral");
		Veterinario vet2 = new Veterinario("Dra. Ana", "CRMV-RJ 5678", "Emergencista");

		// a. Crie duas consultas comuns para animais diferentes.
		Atendimento atendimentoComum1 = new Atendimento(LocalDate.of(2025, 9, 15), "Consulta de rotina", vet1, animal1);
		Atendimento atendimentoComum2 = new Atendimento(LocalDate.of(2025, 9, 16), "Check-up anual", vet1, animal2);

		// b. Crie uma consulta de emergência para um terceiro animal.
		AtendimentoEmergencia atendimentoEmergencia = new AtendimentoEmergencia(LocalDate.of(2025, 9, 17), "Atropelamento", vet2, animal3, 5);

		// c. Crie uma consulta de retorno para um dos animais, associada a uma das consultas comuns.
		AtendimentoRetorno atendimentoRetorno = new AtendimentoRetorno(LocalDate.of(2025, 9, 20), "Retorno pós-consulta", vet1, animal1, atendimentoComum1);

		// d. Chame o método registrar() de cada objeto (e compare os resultados).
		System.out.println("--- Registros de Atendimento ---");
		atendimentoComum1.registrar();
		atendimentoComum2.registrar();
		atendimentoEmergencia.registrar();
		atendimentoRetorno.registrar();

	}
}

