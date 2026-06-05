package resolucao;

public abstract class ArvoreBinariaAbstract<T> {

	protected NoArvoreBinaria<T> raiz;

	// construtor
	public ArvoreBinariaAbstract() {
		this.raiz = null;
	}

	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}

	public boolean estaVazia() {
		return raiz == null;
	}

	// retorna altura da arvore
	public int getAltura() {
		return getAltura(raiz);
	}

	// método auxliar para verificar altura
	protected int getAltura(NoArvoreBinaria<T> no) {
		if (no == null) {
			return -1;
		}
		// altura é 1 + o máximo entre a altura da subárvore esquerda e direita
		return 1 + Math.max(getAltura(no.getEsq()), getAltura(no.getDir()));
	}

	// retorna total de nós da árvore
	public int getTotalNos() {
		return getTotalNos(raiz);
	}

	// método auxliar do total de nós
	protected int getTotalNos(NoArvoreBinaria<T> no) {
		if (no == null) {
			return 0;
		}
		return 1 + getTotalNos(no.getEsq()) + getTotalNos(no.getDir());
	}

	@Override
	public String toString() {
		if (raiz == null) {
			return "";
		}

		String result = raiz.getInfo().toString();
		// os filhos são impressos usando o método auxiliar que os envolve em < >
		result += imprimirSubtree(raiz.getEsq());
		result += imprimirSubtree(raiz.getDir());
		return result;
	}

	// método auxiliar para impressão da árvore
	private String imprimirSubtree(NoArvoreBinaria<T> no) {
		if (no == null) {
			return "<>"; // representação de nó vazio
		}
		return "<" + no.getInfo().toString() + imprimirSubtree(no.getEsq()) + imprimirSubtree(no.getDir()) + ">";
	}

	public abstract NoArvoreBinaria<T> buscar(T info);

	public abstract void inserir(T info);

	public abstract void remover(T info);
}
