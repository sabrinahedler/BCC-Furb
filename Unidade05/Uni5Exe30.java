import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Implemente o problema da mochila. Tendo-se uma sequência decrescente de
         * números inteiros positivos que inicia em N, com decremento inteiro positivo
         * K, deseja-se empacotá-los em uma mochila com tamanho M, de forma que se
         * coloque dentro dela preferencialmente os maiores valores, até que ela esteja
         * cheia. N e K são inteiros e devem ser definidos pelo usuário. Faça um
         * algoritmo que imprima:
         * 
         * os elementos a serem colocados na mochila;
         * os elementos que entraram na mochila;
         * os que ficaram fora da mochila;
         * qual é a soma dos elementos que entraram na mochila;
         * qual a soma dos elementos que não entraram na mochila.
         */

        System.out.print("Informe o valor inicial N: ");
        int N = teclado.nextInt();

        System.out.print("Informe o decremento K: ");
        int K = teclado.nextInt();

        System.out.print("Informe a capacidade da mochila M: ");
        int M = teclado.nextInt();

        int atual = N;
        int somaDentro = 0;
        int somaFora = 0;
        int capacidadeUsada = 0;

        System.out.print("Elementos disponíveis: ");
        while (atual > 0) {
            System.out.print(atual + " ");
            atual -= K;
        }

        atual = N;
        System.out.print("Elementos que entraram na mochila: ");
        while (atual > 0) {
            if (capacidadeUsada + atual <= M) {
                System.out.print(atual + " ");
                capacidadeUsada += atual;
                somaDentro += atual;
            } else {
                somaFora += atual;
            }
            atual -= K;
        }

        atual = N;
        System.out.print("Elementos que ficaram fora da mochila: ");
        capacidadeUsada = 0;
        while (atual > 0) {
            if (capacidadeUsada + atual <= M) {
                capacidadeUsada += atual;
            } else {
                System.out.print(atual + " ");
            }
            atual -= K;
        }

        System.out.println("\nSoma dos elementos dentro da mochila: " + somaDentro);
        System.out.println("Soma dos elementos fora da mochila: " + somaFora);

        teclado.close();
    }
}