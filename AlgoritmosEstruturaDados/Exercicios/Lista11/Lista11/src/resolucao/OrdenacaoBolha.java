package resolucao;

public class OrdenacaoBolha<T extends Comparable<T>> extends OrdenacaoAbstract<T>{

	public OrdenacaoBolha(T[] info) {
		super(info); // chama o construtor da classe pai
	}
	
	@Override
	public void ordenar() {
		int n = info.length; // obtem tamanho da array
		
		for(int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				  if (info[j].compareTo(info[j + 1]) > 0) {
					  // troca os elementos se estiverem na ordem errada
					  trocar(j, j + 1);
				  }
			}
		}
	}
	
}
