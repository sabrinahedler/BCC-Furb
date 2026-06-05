package resolucao;

// classe base para algoritmos de busca
public abstract class BuscarAbstract<T> {

	// vetor de dados que armazena qualquer objeto definido por T
	private T[] info;
	
	public T[] getInfo() {
		return info;
	}
	
	public void setInfo(T[] info) {
		this.info = info;
	}
	
	public abstract int buscar(T valor);
}
