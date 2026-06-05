package resolucao;

public abstract class OrdenacaoAbstract <T extends Comparable <T>>{

	// array dos elementos a serem ordenados
	protected T[] info;
	
	// construtor
	public OrdenacaoAbstract(T[] info) {
		this.info = info;
	}
	
	public abstract void ordenar();
	
	// obtem elemento em determinada posição
	public T get(int i) {
		return info[i];
	}
	
	// altera/define elemento
	public void set(int i, T valor) {
		info[i] = valor;
	}
	
	// troca elementos de lugar
	 public void trocar(int a, int b) {
	        T temp = info[a];
	        info[a] = info[b];
	        info[b] = temp;
	    }
	}
