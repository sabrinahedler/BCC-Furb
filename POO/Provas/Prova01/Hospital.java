package Prova;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hospital {

	private String nome;
	private ArrayList<Medico> medicos = new ArrayList<>();
	private ArrayList<Consulta> consultas = new ArrayList<>();
	private ArrayList<Paciente> pacientes = new ArrayList<>();
	private Endereco endereco;

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Consulta agendarConsulta(Paciente p, Medico m, LocalDate data) {
		Consulta consulta = new Consulta(p, m, data);
		consultas.add(consulta);
		return consulta;
	}

	public void cancelarConsulta(Consulta c) {
		consultas.remove(c);
	}

	public void listarConsultas() {
		for (Consulta c : consultas) {
			System.out.println(c.exibirDados());
		}
	}

	public Medico buscarMedico(String crm) {
		if (!crm.equals(null) && !crm.isBlank()) {
			for (Medico m : medicos) {
				if (crm.equals(m.getCrm())) {
					return m;
				}
			}
		}
		return null;
	}

	public Paciente buscarPaciente(String cpf) {
		if (!cpf.equals(null) && !cpf.isBlank()) {
			for (Paciente p : pacientes) {
				if (cpf.equals(p.getCpf())) {
					return p;
				}
			}
		}
		return null;
	}
}
