package resolucao;

public class PlanoTestes {

	public static void main(String[] args) {
		
		// dados para os testes
		  Integer[] dadosOrdenados = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		  
		// =================================================
		// caso 1 - busca linear: encontrar 20
		BuscaLinear<Integer> buscaLinear = new BuscaLinear<>();
		
		// definindo os dados no objeto de busca
		buscaLinear.setInfo(dadosOrdenados);
		  
		// executando
		int resultadoLinear1 = buscaLinear.buscar(20);
		System.out.println("Saída Obtida: " + (resultadoLinear1 == 2 ? "SUCESSO" : "FALHA"));
		// =================================================

		// caso 2 - busca linear: encontrar 40
		int resultadoLinear2 = buscaLinear.buscar(40);
		System.out.println("Saída Obtida: " + (resultadoLinear2 == 4 ? "SUCESSO" : "FALHA"));
		// =================================================

		// caso 3 - busca binária: encontrar 70
		BuscaBinaria<Integer> buscaBinaria = new BuscaBinaria<>();
		
		// definindo os dados
		buscaBinaria.setInfo(dadosOrdenados);
		
		// executando
		int resultadoBinaria1 = buscaBinaria.buscar(70);
		System.out.println("Saída Obtida: " + (resultadoBinaria1 == 7 ? "SUCESSO" : "FALHA"));
		// =================================================

		// caso 4 - busca binária: encontrar 75 (não existente)
		int resultadoBinaria2 = buscaBinaria.buscar(75);
		System.out.println("Saída Obtida: " + (resultadoBinaria2 == -1 ? "SUCESSO" : "FALHA"));
		
	}
}
