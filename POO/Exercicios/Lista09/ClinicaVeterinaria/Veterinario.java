package ClinicaVeterinaria;

public class Veterinario extends Pessoa implements Registravel {

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

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void setSupervisor(Veterinario supervisor) {
		this.supervisor = supervisor;
	}

	public String getCrmv() {
		return crmv;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public Veterinario getSupervisor() {
		return supervisor;
	}

	public String retornaDados() {
		return "O veterinário " + getNome() + " possui especialização em " + this.especialidade + " e o CRMV: " + this.crmv;
	}

	@Override
	public String getResumo() {
		return retornaDados();
	}
	
	 @Override
	 public void registrarNoSistema() {
		 System.out.println("Veterinario " + getNome() + " registrado com CRMV válido!");
	 }
}
