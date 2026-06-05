package resolucao;

public class BuscaLinearVetorOrdenado<T extends Comparable<T>> extends BuscarAbstract<T> {

	@Override
	// vetor já ordenado
	public int buscar(T valor) {
		// busca do vetor da classe pai
		T[] info = getInfo();
		
		// verifica se vetor está vazio
		if (info == null || info.length == 0) {
			return -1;
		}
		
		// percorre vetor
		for(int i = 0; i < info.length; i++) {
			
			// se o elemento for igual ao valor buscado
			if (info[i].compareTo(valor) == 0) {
				return i + 1; // retorna indice
			}
			
			// se o elemento atual for maior que o valor buscado
			if (info[i].compareTo(valor) > 0) {
				return -1; // não foi encontrado
			}
		}
			
		// valor não encontrado
			return -1;
		}
	}

