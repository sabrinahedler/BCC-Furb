import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = teclado.nextInt();

        double [] vetor = new double[tamanho];

        System.out.println("Agora, preencha o vetor com valores reais:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextDouble();
        }

        System.out.print("Informe o valor a ser buscado no vetor: ");
        double valorBusca = teclado.nextDouble();
        boolean encontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorBusca) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado.");
        } else {
            System.out.println("Valor não encontrado.");
        }

        teclado.close();
    }
}