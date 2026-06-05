package resolucao;

public class OrdenacaoQuickSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

	public OrdenacaoQuickSort(T[] info) {
		super(info);
	}
	
	@Override
	public void ordenar() {
		quickSort(0, info.length - 1);
	}
	
	private void quickSort(int inicio, int fim) {
		if (inicio < fim) {
			int pivoIndex = particionar(inicio, fim);
			quickSort(inicio, pivoIndex - 1);
			quickSort(pivoIndex + 1, fim);
		}
	}
	
	private int particionar(int inicio, int fim) {
		T pivo = info[fim]; // escolhe o último elemento como pivo
		int i = (inicio - 1); // indice do menor elemento
		
		for (int j = inicio; j < fim; j++) {
			// se o elemento for menor ou igual ao pivo
			if (info[j].compareTo(pivo) <= 0) {
				i++;
				trocar(i, j);
			}
		}
		
		trocar(i + 1, fim); // coloca o pivo na posicao correta
		return i + 1;
	}
	
}
