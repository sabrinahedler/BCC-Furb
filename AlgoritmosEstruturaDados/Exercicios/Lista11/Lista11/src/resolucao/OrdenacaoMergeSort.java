package resolucao;

public class OrdenacaoMergeSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

    public OrdenacaoMergeSort(T[] info) {
        super(info);
    }
		
		@Override
		public void ordenar() {
			mergeSort(0, info.length - 1);
		}
		
		private void mergeSort(int inicio, int fim) {
			if(inicio < fim) {
				// encontra o meio do array
				int meio = (inicio + fim) / 2;
				
				// chama mergeSort para a metade esquerda
				mergeSort(inicio, meio);
				
				// chama mergeSort para a metade direita
				mergeSort(meio + 1, fim);
				
				// mescla as duas metades ordenadas
				merge(inicio, meio, fim);
			}
	}
		
		private void merge(int inicio, int meio, int fim) {
			// tamanho das duas metades
			int n1 = meio - inicio + 1;
			int n2 = fim - meio;
			
			// arrays temporárias para guardar dados antes de mesclar
			T[] esquerda = (T[]) new Comparable[n1];
			T[] direita = (T[]) new Comparable[n2];
			
			// copia os dados para as arrays temporarias
			 for (int i = 0; i < n1; ++i)
		            esquerda[i] = info[inicio + i];
		        for (int j = 0; j < n2; ++j)
		            direita[j] = info[meio + 1 + j];

		        // indices iniciais dos sub-arrays e do array mesclado
		        int i = 0, j = 0;
		        int k = inicio;

		        // compara e mescla de volta no array original
		        while (i < n1 && j < n2) {
		            // se o elemento da esquerda for menor ou igual ao da direita
		            if (esquerda[i].compareTo(direita[j]) <= 0) {
		                info[k] = esquerda[i];
		                i++;
		            } else {
		                info[k] = direita[j];
		                j++;
		            }
		            k++;
		        }

		        // copia os elementos restantes de esquerda, se houver
		        while (i < n1) {
		            info[k] = esquerda[i];
		            i++;
		            k++;
		        }

		        // copia os elementos restantes de direita, se houver
		        while (j < n2) {
		            info[k] = direita[j];
		            j++;
		            k++;
		        }
		    }
		}