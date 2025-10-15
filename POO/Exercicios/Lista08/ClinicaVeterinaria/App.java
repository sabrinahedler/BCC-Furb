package ClinicaVeterinaria;

public class App {
	public static void main(String[] args) {

		Tutor tutor = new Tutor ("João", "1111111111", "9 999999", "Blumenau");
		
		Veterinario veterinario = new Veterinario ("Maria", "000000000", "ABC111", "Cirurgia");
	
		System.out.println("Dados do TUTOR:");
		System.out.println(tutor.getResumo());
		
		System.out.println("###########################");
		
		System.out.println("Dados do VETERINÁRIO:");
		System.out.println(veterinario.getResumo());
	}
}

