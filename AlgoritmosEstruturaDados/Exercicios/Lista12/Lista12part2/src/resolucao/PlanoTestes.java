package resolucao;

public class PlanoTestes {
	public static void main(String[] args) {

		// teste 1: criar árvore e conferir toString
		ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
		Integer[] valoresCaso1 = { 50, 30, 70, 25, 40, 65, 80 };
		System.out.println("  Inserindo valores: " + java.util.Arrays.toString(valoresCaso1));

		for (Integer valor : valoresCaso1) {
			arvore.inserir(valor);
		}

		String saidaEsperada1 = "50<30<25<><>><40<><>>><70<65<><>><80<><>>>";
		String saidaObtida1 = arvore.toString();
		System.out.println("  Saída esperada (toString): " + saidaEsperada1);
		System.out.println("  Saída obtida (toString):   " + saidaObtida1);
		System.out.println("  Status: " + (saidaObtida1.equals(saidaEsperada1) ? "SUCESSO" : "FALHA"));

		// ==================================================
		// teste 2: remover nó folha (25)
		// árvore já criada do caso 1

		String saidaEsperada2 = "50<30<><40<><>>><70<65<><>><80<><>>>";
		String saidaObtida2 = arvore.toString();
		System.out.println("  Saída esperada (toString): " + saidaEsperada2);
		System.out.println("  Saída obtida (toString):   " + saidaObtida2);
		System.out.println("  Status: " + (saidaObtida2.equals(saidaEsperada2) ? "SUCESSO" : "FALHA"));

		// ==================================================
		// teste 3: remover nó com um filho (40)
		// recriando árvore original para garantir estado inicial
		ArvoreBinariaBusca<Integer> arvore2 = new ArvoreBinariaBusca<>();
		for (Integer valor : valoresCaso1) {
			arvore2.inserir(valor);
		}
		arvore2.remover(40);

		String saidaEsperada3 = "50<30<25<><>><>><70<65<><>><80<><>>>";
		String saidaObtida3 = arvore2.toString();
		System.out.println("  Saída esperada (toString): " + saidaEsperada3);
		System.out.println("  Saída obtida (toString):   " + saidaObtida3);
		System.out.println("  Status: " + (saidaObtida3.equals(saidaEsperada3) ? "SUCESSO" : "FALHA"));
	}
}