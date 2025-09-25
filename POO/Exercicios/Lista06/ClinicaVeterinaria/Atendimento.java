package ClinicaVeterinaria;
import java.time.LocalDate;
import java.util.ArrayList;


public class Atendimento {

	private LocalDate data;
	private String descricao;
	private Veterinario veterinario;
	ArrayList<Procedimento> ListaDeProcedimentos = new ArrayList<>();
	
	void setData(LocalDate data) {
		this.data = data;
	}
	
	void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	LocalDate getData() {
		return data;
	}

	String getDescricao() {
		return descricao;
	}

	Veterinario getVeterinario() {
		return veterinario;
	}

	
	public Atendimento() {
		this.data = LocalDate.of(0, 0, 0);
		this.descricao = "Não informada";
	}
	
	public Atendimento(LocalDate data, String descricao, Veterinario veterinario) {
		this.data = data;
		this.descricao = descricao;
		this.veterinario = veterinario;
	}
	
	public void adicionarProcedimento (Procedimento procedimento) {
		ListaDeProcedimentos.add(procedimento);
	}
	
	public void removerProcedimento (Procedimento procedimento) {
		ListaDeProcedimentos.remove(procedimento);
	}
	
	String exibirDados() {
		return "Foram realizados " + ListaDeProcedimentos.size() + " procedimento(s) durante o atendimento, pelo veterinário " + veterinario.getNome();
	}
	
}
