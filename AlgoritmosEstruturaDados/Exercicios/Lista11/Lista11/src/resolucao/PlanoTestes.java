package resolucao;
import java.util.Arrays;

public class PlanoTestes {

	public static void main(String[] args) {
		// dados de entrada
        Integer[] dadosIniciais = {70, 2, 88, 15, 90, 30};

        System.out.println("Array Original: " + Arrays.toString(dadosIniciais));
        System.out.println("--------------------------------------------------");

        // Caso 1: Bubble Sort
        testarBubbleSort(dadosIniciais.clone());

        // Caso 2: Bubble Sort Otimizado
        testarBubbleSortOtimizado(dadosIniciais.clone());

        // Caso 3: Quick Sort
        testarQuickSort(dadosIniciais.clone());

        // Caso 4: Merge Sort
        testarMergeSort(dadosIniciais.clone());
    }

    private static void testarBubbleSort(Integer[] dados) {
        System.out.print("Caso 1 - Bubble Sort: ");
        OrdenacaoBolha<Integer> bolha = new OrdenacaoBolha<>(dados);
        bolha.ordenar();
        System.out.println(Arrays.toString(dados));
    }

    private static void testarBubbleSortOtimizado(Integer[] dados) {
        System.out.print("Caso 2 - Bubble Otimizado: ");
        OrdenacaoBolhaOtimizada<Integer> bolhaOtimizada = new OrdenacaoBolhaOtimizada<>(dados);
        bolhaOtimizada.ordenar();
        System.out.println(Arrays.toString(dados));
    }

    private static void testarQuickSort(Integer[] dados) {
        System.out.print("Caso 3 - Quick Sort: ");
        OrdenacaoQuickSort<Integer> quickSort = new OrdenacaoQuickSort<>(dados);
        quickSort.ordenar();
        System.out.println(Arrays.toString(dados));
    }

    private static void testarMergeSort(Integer[] dados) {
        System.out.print("Caso 4 - Merge Sort: ");
        OrdenacaoMergeSort<Integer> mergeSort = new OrdenacaoMergeSort<>(dados);
        mergeSort.ordenar();
        System.out.println(Arrays.toString(dados));
    }
}