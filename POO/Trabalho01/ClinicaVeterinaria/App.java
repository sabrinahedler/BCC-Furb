package ClinicaVeterinaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		// Criação de tutores
		Tutor tutor1 = new Tutor("Jean", "9 9999-9999", "Blumenau");
		Tutor tutor2 = new Tutor();
		// Deve lançar a exceção
		tutor2.setTelefone("");

		// Criação de animais
		Animal animal1 = new Animal("Lucky", "Vira-lata", 9, "");
		Animal animal2 = new Animal("Kelly", "Vira-lata", 9, "");
		Animal animal3 = new Animal();
		// Deve lançar a exceção
		animal3.setIdade(-1);

		// Adiciona histórico
		animal2.adicionarHistorico("Animal saudável, com ótima recuperação.");

		// Exibe histórico
		System.out.println(animal2.getHistorico());

	}
}