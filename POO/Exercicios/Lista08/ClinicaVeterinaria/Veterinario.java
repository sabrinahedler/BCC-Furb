package ClinicaVeterinaria;

public class Veterinario extends Pessoa {

	private String crmv;
	private String especialidade;
	private Veterinario supervisor;

	public Veterinario(String nome, String cpf, String crmv, String especialidade) {
		super(nome, cpf);
		this.crmv = crmv;
		this.especialidade = especialidade;
	}

	public Veterinario() {
		super("Não cadastrado", "000000");
		this.crmv = "Não cadastrado";
		this.especialidade = "Não cadastrado";
	}

	void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	void setSupervisor(Veterinario supervisor) {
		this.supervisor = supervisor;
	}

	String getCrmv() {
		return crmv;
	}

	String getEspecialidade() {
		return especialidade;
	}

	Veterinario getSupervisor() {
		return supervisor;
	}

	String retornaDados() {
		return "O veterinário " + getNome() + " possui especialização em " + this.especialidade + " e o CRMV: " + this.crmv;
	}

	@Override
	public String getResumo() {
		return retornaDados();
	}
}
