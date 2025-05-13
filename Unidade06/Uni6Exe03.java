import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
         * 12 posições do tipo real. Em seguida, modifique o vetor de modo que os
         * valores das posições ímpares sejam aumentados em 5% e os das posições pares
         * sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler
         * os valores, outro para ajustar os valores dentro do vetor e outro para
         * escrever os valores atualizados do vetor.
         */

        double[] vetor = new double[12];

        System.out.println("Escreva 12 números reais:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {

            if (i % 2 == 0) {
                double aumentoPar = vetor[i] * 0.02;
                vetor[i] = vetor[i] + aumentoPar;
            } else {
                double aumentoImpar = vetor[i] * 0.05;
                vetor[i] = vetor[i] + aumentoImpar;
            }
        }

        System.out.println();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        teclado.close();
    }
}