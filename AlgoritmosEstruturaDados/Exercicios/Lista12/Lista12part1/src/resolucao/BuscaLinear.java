package resolucao;

// busca "raiz", percorre o vetor do inicio ao fim
public class BuscaLinear<T> extends BuscarAbstract<T> {

	@Override
	public int buscar(T valor) {
		T[] info = getInfo();
		
		// verificando se o vetor não está vazio
		if(info == null || info.length == 0) {
			return -1;
		}
		
		// percorre o vetor buscando o valor
		for (int i = 0; i < info.length; i++) {
			if (info[i].equals(valor)) {
				return i + 1;
			}
		}
			
			// se o valor não for encontrado
			return -1;
	}
	
	
}
