/**
 * Código que gera o cadastro de um animal no sistema veterinário.
 */

public class Animal {
	private String nome;
	private String especie;
	private int idade;
	private String historico;

    /**
     * Define o nome do animal.
     * @param nome Nome do animal.
     */
	
	void setNome(String nome) {
		this.nome = nome;
	}

	/**
     * Define a espécie do animal.
     * @param especie Espécie do animal.
     */
	
	void setespecie(String especie) {
		this.especie = especie;
	}

	  /**
     * Define a idade do animal.
     * @param idade Idade em anos.
     * @throws IllegalArgumentException se a idade for negativa.
     */
	
	void setIdade(int idade) {

		if (idade < 0) {
			throw new IllegalArgumentException("Idade do animal não pode ser negativa!");
		} else {
			this.idade = idade;
		}
	}
	
	 /**
     * Define o histórico clínico do animal.
     * @param historico Descrição do histórico.
     */

	void setHistorico(String historico) {
		this.historico = historico;
	}
	
	// ====================================================
	
	  /**
     * Obtém o nome do animal.
     * @return Nome do animal.
     */

	String getNome() {
		return nome;
	}
	
	 /**
     * Obtém a espécie do animal.
     * @return Espécie do animal.
     */

	String getEspecie() {
		return especie;
	}
	
	  /**
     * Obtém a idade do animal.
     * @return Idade do animal.
     */

	int getIdade() {
		return idade;
	}
	
	 /**
     * Obtém o histórico clínico do animal.
     * @return Histórico do animal.
     */
	
	String getEHistorico() {
		return historico;
	}

	// ====================================================
	
	  /**
     * Construtor padrão do animal.
     * Cria um animal com valores não cadastrados.
     */
	
	public Animal() {
		this.nome = "Não cadastrado";
		this.especie = "Não cadastrado";
		this.idade = 0;
		this.historico = "Não possui";
	}

	 /**
     * Construtor do animal.
     * @param nome Nome do animal.
     * @param especie Espécie do animal.
     * @param idade Idade do animal em anos.
     * @param historico Histórico clínico do animal.
     */
	
	public Animal(String nome, String especie, int idade, String historico) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.historico = historico;
	}
	
	 /**
     * Adiciona uma nova descrição ao histórico do animal.
     * @param descricao Texto a ser adicionado.
     * @return O histórico atualizado.
     */

	public String adicionarHistorico(String descricao) {
		historico = descricao;
		return historico;
	}
	
	

}
