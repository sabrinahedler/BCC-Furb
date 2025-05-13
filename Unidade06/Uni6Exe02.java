import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
         * 12 posições do tipo real. Imprima quais valores desses informados são maiores
         * que a média dos valores. Faça um método para ler os valores, outro para
         * calcular a média e outro para informar os valores maiores que a média.
         */

        double[] vetor = new double[12];
        double soma = 0;

        System.out.println("Informe 12 valores reais:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextDouble();

            soma = soma + vetor[i];
        }

        double media = soma / 12;

        System.out.println("Valores acima da média:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println(vetor[i]);
            }
        }

        teclado.close();
    }
}