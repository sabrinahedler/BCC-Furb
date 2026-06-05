package resolucao;

public class NoArvoreBinaria<T> {

	private T info; // dado armazenado no nó.
    private NoArvoreBinaria<T> esq; // referência para filho esquerdo
    private NoArvoreBinaria<T> dir; // referência para filho direito

    // construtor nó
    public NoArvoreBinaria(T info) {
        this.info = info;
        this.esq = null; 
        this.dir = null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvoreBinaria<T> getEsq() {
        return esq;
    }

    public void setEsq(NoArvoreBinaria<T> esq) {
        this.esq = esq;
    }

    public NoArvoreBinaria<T> getDir() {
        return dir;
    }

    public void setDir(NoArvoreBinaria<T> dir) {
        this.dir = dir;
    }
}