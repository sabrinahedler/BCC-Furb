package resolucao;

public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {

	public ArvoreBinaria() {
		super();
	}

	@Override
	// método para inserir um nó no primmeiro espaço disponível
	public void inserir(T info) {
		NoArvoreBinaria<T> novoNo = new NoArvoreBinaria<>(info);

		if (estaVazia()) {
			raiz = novoNo;
		} else {
			inserirNivel(raiz, novoNo);
		}
	}

	// método auxiliar para inserir um nó em nível
	private NoArvoreBinaria<T> inserirNivel(NoArvoreBinaria<T> atual, NoArvoreBinaria<T> novoNo) {
		if (atual == null) {
			return novoNo;
		}

		// tenta inserir umm nó a esquerda
		if (atual.getEsq() == null) {
			atual.setEsq(novoNo);
		} else if (atual.getDir() == null) { // se esq estiver ocupada, tenta a direita
			atual.setDir(novoNo);
		} else {
			if (getTotalNos(atual.getEsq()) <= getTotalNos(atual.getDir())) {
				inserirNivel(atual.getEsq(), novoNo);
			} else {
				inserirNivel(atual.getDir(), novoNo);
			}
		}

		return atual;
	}

	@Override
	// busca um valor na árvore
	public NoArvoreBinaria<T> buscar(T info) {
		return buscar(raiz, info);
	}

	// método auxiliar para buscar o valor
	private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> atual, T info) {
		if (atual == null) {
			return null;
		}

		// compara valor do nó atual com o valor buscado
		if (atual.getInfo().equals(info)) {
			return atual; // valor encontrado
		}

		// busca na subArovre esquerda
		NoArvoreBinaria<T> encontradoEsq = buscar(atual.getEsq(), info);
		if (encontradoEsq != null) {
			return encontradoEsq; // encontrado na esquerda
		}
		// busca na subárvore direita
		return buscar(atual.getDir(), info); // resultado da busca na direita
	}
	
	@Override
	// remove um valor da árvore
	    public void remover(T info) {
	        raiz = remover(raiz, info);
	    }

	    // método auxiliar para remover nó
	    private NoArvoreBinaria<T> remover(NoArvoreBinaria<T> atual, T info) {
	        if (atual == null) {
	            return null; // valor não encontrado
	        }

	        if (atual.getInfo().equals(info)) {
	        	
	            // caso 1: nó folha 
	            if (atual.getEsq() == null && atual.getDir() == null) {
	                return null;
	            }
	            
	            // Caso 1: nó com apenas um filho (esquerdo)
	            if (atual.getEsq() != null && atual.getDir() == null) {
	                return atual.getEsq();
	            }
	            
	            // caso 3: nó com apenas um filho (direito)
	            if (atual.getEsq() == null && atual.getDir() != null) {
	                return atual.getDir();
	            }
	            
	            // caso 4: nó com dois filhos
	            NoArvoreBinaria<T> menorValorNo = encontrarMenor(atual.getDir());
	            atual.setInfo(menorValorNo.getInfo());
	            atual.setDir(remover(atual.getDir(), menorValorNo.getInfo()));
	            return atual;
	        }

	        // como não há ordem, precisa buscar em ambos os lados
	        atual.setEsq(remover(atual.getEsq(), info));
	        atual.setDir(remover(atual.getDir(), info));
	        return atual;
	    }

	    // método auxiliar para encontrar o nó com o menor valor em uma subárvore
	    private NoArvoreBinaria<T> encontrarMenor(NoArvoreBinaria<T> no) {
	        // percorre a subárvore esquerda até encontrar o nó mais à esquerda
	        return no.getEsq() == null ? no : encontrarMenor(no.getEsq());
	    }

	   // realiza percurso pré-ordem
	    public String preOrdem() {
	        return preOrdem(raiz);
	    }

	    // método auxiliar percurso pré-ordem
	    private String preOrdem(NoArvoreBinaria<T> no) {
	        if (no == null) {
	            return "";
	        }
	        String resultado = no.getInfo().toString() + " ";
	        resultado += preOrdem(no.getEsq());
	        resultado += preOrdem(no.getDir());
	        return resultado;
	    }

	    // realiza percurso em ordem
	    public String inOrdem() {
	        return inOrdem(raiz);
	    }

	   // método auxiliar percurso em ordem
	    private String inOrdem(NoArvoreBinaria<T> no) {
	        if (no == null) {
	            return "";
	        }
	        String resultado = inOrdem(no.getEsq());
	        resultado += no.getInfo().toString() + " ";
	        resultado += inOrdem(no.getDir());
	        return resultado;
	    }

	    // realiza percurso pós-ordem
	    public String posOrdem() {
	        return posOrdem(raiz);
	    }

	    // método auxiliar percurso pós-ordem
	    private String posOrdem(NoArvoreBinaria<T> no) {
	        if (no == null) {
	            return "";
	        }
	        String resultado = posOrdem(no.getEsq());
	        resultado += posOrdem(no.getDir());
	        resultado += no.getInfo().toString() + " ";
	        return resultado;
	    }
	}