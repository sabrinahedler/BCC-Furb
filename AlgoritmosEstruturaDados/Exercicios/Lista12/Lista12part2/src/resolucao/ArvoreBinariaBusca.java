package resolucao;

public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

	public ArvoreBinariaBusca() {
		super(); // chama construtor da classe pai
	}

	@Override
	public void inserir(T info) {
		// se a árvore estiver vazia, o novo nó se torna a raiz
		if (estaVazia()) {
			raiz = new NoArvoreBinaria<>(info);
		} else {
			inserir(raiz, info);
		}
	}

	// método auxiliar para inserir nó
	private NoArvoreBinaria<T> inserir(NoArvoreBinaria<T> atual, T info) {

		if (atual == null) {
			return new NoArvoreBinaria<>(info);
		}

		// compara valor a ser inserido com o valor do nó atual
		int comparacao = info.compareTo(atual.getInfo());

		// se valor a ser inserido for menor que valor do nó atual, vai para esq
		if (comparacao < 0) {
			atual.setEsq(inserir(atual.getEsq(), info));
		}
		// se o valor a ser inserido for maior que valor do nó atual, vai para dir
		else if (comparacao > 0) {
			atual.setDir(inserir(atual.getDir(), info));
		}
		// se for igual, o valor já existe na árvore (não faz nada)
		return atual;
	}

	// busca valor na árvore
	@Override
	public NoArvoreBinaria<T> buscar(T info) {
		return buscar(raiz, info);
	}

	// método auxiliar para busca de valor
	private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> atual, T info) {

		if (atual == null) {
			return null;
		}

		// compara valor do nó atual com valor buscado
		int comparacao = info.compareTo(atual.getInfo());

		// se for igual, valor encontrado
		if (comparacao == 0) {
			return atual;
		}
		// se valor buscado for menor, busca na subárvore esq
		else if (comparacao < 0) {
			return buscar(atual.getEsq(), info);
		}
		// se valor buscado for maior, busca na subárvore dir
		else {
			return buscar(atual.getDir(), info);
		}
	}

	// remove valor da árvore
	@Override
	public void remover(T info) {
		raiz = remover(raiz, info);
	}

	// método auxiliar para remoção
	private NoArvoreBinaria<T> remover(NoArvoreBinaria<T> atual, T info) {

		if (atual == null) {
			return null;
		}

		// compara valor a ser removido com valor do nó atual
		int comparacao = info.compareTo(atual.getInfo());

		// se o valor a ser removido for menor, vai para esq
		if (comparacao < 0) {
			atual.setEsq(remover(atual.getEsq(), info));
		}
		// se o valor a ser removido for maior, vai para dir
		else if (comparacao > 0) {
			atual.setDir(remover(atual.getDir(), info));
		} else {
			// caso 1: nó folha
			if (atual.getEsq() == null && atual.getDir() == null) {
				return null;
			}
			// caso 2: nó com um filho (esq)
			if (atual.getEsq() != null && atual.getDir() == null) {
				return atual.getEsq(); // substitui o nó pelo seu filho esq
			}
			// caso 3: nó com um filho (dir)
			if (atual.getEsq() == null && atual.getDir() != null) {
				return atual.getDir(); // substitui o nó pelo seu filho dir
			}
			// caso 4: nó com dois filhos
			// encontra o sucessor (menor valor na subárvore dir)
			NoArvoreBinaria<T> menorValorNo = encontrarMenor(atual.getDir());
			// copia valor do sucessor para nó atual
			atual.setInfo(menorValorNo.getInfo());
			// remove sucessor da subárvore dir
			atual.setDir(remover(atual.getDir(), menorValorNo.getInfo()));
		}

		return atual;
	}

	// método auxiliar para encontrar menor valor
	private NoArvoreBinaria<T> encontrarMenor(NoArvoreBinaria<T> no) {
		return no.getEsq() == null ? no : encontrarMenor(no.getEsq());
	}
}