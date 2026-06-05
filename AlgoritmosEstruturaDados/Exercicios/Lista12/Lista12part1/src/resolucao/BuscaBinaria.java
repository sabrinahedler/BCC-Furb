package resolucao;

public class BuscaBinaria<T extends Comparable<T>> extends BuscarAbstract<T> {

	@Override
	public int buscar(T valor) {
		// obtém vetor da classe pai
		T[] info = getInfo();
		
		// verifica se vetor vazio
		if(info == null || info.length == 0) {
			return -1;
		}
		
		int inicio = 0; // inicio do intervalo de busca
		int fim = info.length - 1; // fim do intervalo
		
		while(inicio <= fim) {
			
			int meio = (inicio + fim) / 2; // calcula meio do intervalo
			int comparacao = info[meio].compareTo(valor); // compara elemento do meio
			
			// se elemento do meio for igual ao valor buscado
			if (comparacao == 0) {
				return meio + 1; // retorna indice
			}
			
			// se elemento do meio for menor
			else if (comparacao < 0) {
				inicio = meio + 1; // ajusta o inicio para posicao após o meio
			}
			
			// se elemento do meio for maior
			else {
				fim = meio - 1; // ajusta o fim da posicao antes do meio
			}
		}
			
			// se o valor não for encontrado
			return -1;
	}
}
