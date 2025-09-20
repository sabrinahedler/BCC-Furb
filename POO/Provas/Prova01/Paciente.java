package Prova;

public class Paciente {

	private String nome;
	private String cpf;
	private int idade;
	
	// construtor da classe 
	public Paciente(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setCpf(String cpf) {
		if (cpf.equals(null) || cpf.isBlank()) {
			throw new IllegalArgumentException("CPF é inválido");
		} else {
			this.cpf = cpf;
		}
	}
	
	public void setIdade(int Idade){
		if (idade < 1) {
			throw new IllegalArgumentException("Idade é inválida");
		} else {
			this.idade = idade;
		}
	}
	
	public String exibirDados() {
		return "Nome: " + nome + ", CPF: " + cpf + ", Idade: " + idade;
	}
}
