package GerenciamentoDeObras;

public class Pessoa {

	private int identificador;
	private String cpf;
	private String nomeCompleto;
	private String cargo;

	public Pessoa(){
		
	}
	
	public Pessoa(int identificador, String cpf, String nomeCompleto, String cargo) {
		this.identificador = identificador;
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.cargo = cargo;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setIdentificador(int identificador) {
		if (identificador < 0) {
			throw new IllegalArgumentException("IDENTIFICADOR INVÁLIDO!");
		} else {
			this.identificador = identificador;
		}
	}

	public void setCpf(String cpf) {
			this.cpf = cpf;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
			this.nomeCompleto = nomeCompleto;
	}

	public void setCargo(String cargo) {
		if (cargo == null || cargo.isBlank()) {
			throw new IllegalArgumentException("CARGO INVÁLIDO!");
		} else {
			this.cargo = cargo;
		}
	}
}
