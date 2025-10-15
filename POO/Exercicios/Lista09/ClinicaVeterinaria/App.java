package ClinicaVeterinaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new ArrayList<>(); 
		ArrayList<Atendimento> atendimentos = new ArrayList<>();
		
		Animal a1 = new Animal ("Pipoca", "Gato", 2, "xxx");
		Animal a2 = new Animal ("Lucky", "Cachorro", 9, "xxx");
		Animal a3 = new Animal ("Kelly", "Cachorro", 9, "xxx");
		Animal a4 = new Animal ("Kevin", "Gato", 4, "xxx");
		Animal a5 = new Animal ("Bolinha", "Gato", 11, "xxx");
		Animal a6 = new Animal ("Pintinha", "Cachorro", 1, "xxx");
		
		Veterinario v1 = new Veterinario ("Alfredo", "000.000.000-00", "AB 000", "Neurologista");
		Veterinario v2 = new Veterinario ("Pedro", "000.000.000-00", "BA 000", "Geral");
		Veterinario v3 = new Veterinario ("Joana", "000.000.000-00", "CD 000", "Cirurgião");
			
		AtendimentoEmergencia e1 = new AtendimentoEmergencia(1, LocalDate.of(2025, 10, 8), "xxx", v1, a1, 100, 1, 0); 
		AtendimentoEmergencia e2 = new AtendimentoEmergencia(1, LocalDate.of(2025, 10, 8), "xxx", v3, a2, 100, 1, 0);
		AtendimentoEmergencia e3 = new AtendimentoEmergencia(1, LocalDate.of(2025, 10, 8), "xxx", v1, a3, 100, 1, 0);
		AtendimentoEmergencia e4 = new AtendimentoEmergencia(1, LocalDate.of(2025, 10, 8), "xxx", v2, a4, 100, 1, 0);
		
		AtendimentoRetorno r1 = new AtendimentoRetorno(1, LocalDate.of(2025, 10, 8), "xxx", v1, a5, 100);
		AtendimentoRetorno r2 = new AtendimentoRetorno(1, LocalDate.of(2025, 10, 8), "xxx", v3, a6, 100);
		AtendimentoRetorno r3 = new AtendimentoRetorno(1, LocalDate.of(2025, 10, 8), "xxx", v1, a1, 100);
		AtendimentoRetorno r4 = new AtendimentoRetorno(1, LocalDate.of(2025, 10, 8), "xxx", v2, a2, 100);
		
		Tutor t1 = new Tutor ("Joao", "000.000.000-00", "00 00000000", "Blumenau");
		t1.getAnimais().add(a1);
		t1.getAnimais().add(a2);
		
		Tutor t2 = new Tutor ("Maria", "000.000.000-00", "00 00000000", "Gaspar");
		t2.getAnimais().add(a1);
		t2.getAnimais().add(a3);
		
		Tutor t3 = new Tutor ("Ana", "000.000.000-00", "00 00000000", "Indaial");
		t3.getAnimais().add(a4);
		t3.getAnimais().add(a5);
		
		Tutor t4 = new Tutor ("Paulo", "000.000.000-00", "00 00000000", "Joinville");
		t4.getAnimais().add(a5);
		t4.getAnimais().add(a6);
		
		Tutor t5 = new Tutor ("Gustavo", "000.000.000-00", "00 00000000", "Timbó");
		t5.getAnimais().add(a4);
		t5.getAnimais().add(a3);
		
		pessoas.add(t1);
		pessoas.add(t2);
		pessoas.add(t3);
		pessoas.add(t4);
		pessoas.add(t5);
		pessoas.add(v1);
		pessoas.add(v2);
		pessoas.add(v3);

		atendimentos.add(e1);
		atendimentos.add(e2);
		atendimentos.add(e3);
		atendimentos.add(e4);
		atendimentos.add(r1);
		atendimentos.add(r2);
		atendimentos.add(r3);
		atendimentos.add(r4);
		
		System.out.println("Percorrendo a lista de atendimetos:");
		for (Atendimento atend : atendimentos) {
			System.out.println("Resumo:");
			System.out.println(atend.exibirResumo());
			System.out.println("====================");
			System.out.println("Valor Total: R$" + atend.calcularValor());
			System.out.println();
		}
		
		System.out.println("Percorrendo a lista de pessoas:");
		for (Pessoa p : pessoas) {
			System.out.println("Resumo do(a): " + p.getNome());
			System.out.println(p.getResumo());
			System.out.println("====================");	
		}
	}
}

