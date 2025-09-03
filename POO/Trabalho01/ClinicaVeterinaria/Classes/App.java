/**
 * Classe principal que executa o sistema de cadastro de animais e tutores.
 */

public class App {
	
	/**
     * Método principal que inicia a aplicação.
     * @param args Argumentos da linha de comando (não utilizados).
     */
	
	public static void main(String[] args) {
		
		// Criação de tutores
		Tutor tutor1 = new Tutor ("Jean", "9 9999-9999", "Blumenau");
		Tutor tutor2 = new Tutor ();
		// Deve lançar a exceção
		tutor2.setTelefone("");
		
		// Criação de animais
		Animal animal1 = new Animal ("Lucky", "Vira-lata", 9, "");
		Animal animal2 = new Animal ("Kelly", "Vira-lata", 9, "");
		Animal animal3 = new Animal ();
		// Deve lançar a exceção
		animal3.setIdade(-1);
		
		
		// Adiciona histórico
		animal2.adicionarHistorico("Animal saudável, com ótima recuperação.");
		
		 // Exibe histórico
		System.out.println(animal2.getEHistorico());
		
	}
}
