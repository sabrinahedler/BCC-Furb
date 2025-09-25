/**
 * Código que gera o cadastro do tutor de um ou mais animais no sistema veterinário.
 */

public class Tutor {

	private String nome;
	private String telefone;
	private String endereco;

	  /**
     * Define o nome do tutor.
     * @param nome Nome do tutor.
     */
	
	void setNome (String nome) {
		this.nome = nome;
	}
	
	 /**
     * Define o telefone do tutor.
     * @param telefone Telefone em formato de String.
     * @throws IllegalArgumentException se o telefone for nulo ou vazio.
     */
	
	void setTelefone (String telefone) {
		if (telefone == null || telefone.isBlank()) {
			throw new IllegalArgumentException("Tutor sem telefone!");
		} else {
			this.telefone = telefone;
		}
	}
	
	 /**
     * Define o endereço do tutor.
     * @param endereco Endereço do tutor.
     */
	
	void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	
	// ====================================================
	

    /**
     * Obtém o nome do tutor.
     * @return Nome do tutor.
     */
	
	String getNome() {
		return nome;
	}

	 /**
     * Obtém o telefone do tutor.
     * @return Telefone do tutor.
     */
	
	String getTelefone() {
		return telefone;
	}
	
	 /**
     * Obtém o endereço do tutor.
     * @return Endereço do tutor.
     */

	String endereco() {
		return endereco;
	}
	
	// ====================================================
	
	 /**
     * Construtor padrão do tutor.
     * Cria um tutor com dados não cadastrados.
     */

	public Tutor() {
		this.nome = "Não cadastrado";
		this.telefone = "";
		this.endereco = "Não cadastrado";
	}
	
	 /**
     * Construtor do tutor.
     * @param nome Nome do tutor.
     * @param telefone Telefone do tutor.
     * @param endereco Endereço do tutor.
     */

	public Tutor(String nome, String telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
}

