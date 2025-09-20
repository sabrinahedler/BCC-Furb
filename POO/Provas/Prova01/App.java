package Prova;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {

		// criando um hospital
		Hospital hospital = new Hospital();

		// criando um endereco
		Endereco endereco = new Endereco("Antonio da Veiga", 140, "Blumenau");
		
		// anexando o endereco em hospital
		hospital.setEndereco(endereco);

		// criando médicos
		Medico m1 = new Medico("Medico1", "123");
		Medico m2 = new Medico("Medico2", "456");
		Medico m3 = new Medico("Medico3", "789");

		// criando pacientes
		Paciente p1 = new Paciente("Paciente1", "123", 25);
		Paciente p2 = new Paciente("Paciente2", "456", 26);
		Paciente p3 = new Paciente("Paciente3", "987", 27);
		Paciente p4 = new Paciente("Paciente4", "456", 30);
		Paciente p5 = new Paciente("Paciente5", "589", 35);

		// criando uma consulta diretamente
		Consulta c1 = new Consulta (p4, m1, LocalDate.of(2025, 03, 10));
		
		// chamando o método agendar consultas
		hospital.agendarConsulta(p1, m1, LocalDate.of(2025, 10, 23));
		hospital.agendarConsulta(p2, m2, LocalDate.of(2025, 10, 15));
		hospital.agendarConsulta(p3, m3, LocalDate.of(2025, 11, 15));

		// listando as consultas criadas
		hospital.listarConsultas();

		// cancelando uma consulta
		hospital.cancelarConsulta(c1);

		System.out.println("==================");

		// listando novamente as consultas
		// para mostrar o funcionamento do método cancelar consulta
		hospital.listarConsultas();

	}
		
		
	}
