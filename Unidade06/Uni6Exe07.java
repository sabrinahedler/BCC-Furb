import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base
         * neste valor, crie um vetor do tipo inteiro. Em seguida, solicite ao usuário
         * para digitar um número inteiro várias vezes, até preencher o vetor. Esse
         * número deverá ser armazenado no vetor caso ainda não exista, e se o valor já
         * existir deve ser pedido um novo valor. Isto é, se o usuário informar o número
         * 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser
         * adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo
         * deve ser ordenado. Para isso reordene os elementos internos do vetor de modo
         * que este fique em ordem crescente, conforme no exemplo: OBSERVAÇÃO: Não
         * utilize o Arrays.sort
         * 
         * [2][3][0][4][6]
         * Vetor origem: [0][4][2][6][3]
         * Vetor ordenado: [0][2][3][4][6]
         * 
         * Crie um método para inserir os valores no vetor, outro para ordenar o vetor e
         * outro para informar o vetor resultante.
         */

        System.out.print("Informe um número inteiro de 0 á 20: ");
        int valor = teclado.nextInt();

        if (valor > 20) {
            System.out.println("Valor inserido está incorreto!");
        }

        int[] vetor = new int[valor];

        System.out.println("Agora, digite números inteiros (sem repetir):");
        for (int i = 0; i < vetor.length; i++) {

            int digitado = teclado.nextInt();

            for (int x = 0; x < vetor.length; x++) {
                if (vetor[x] == digitado) {
                    System.out.println("Valor já existente, informe um novo:");
                    i--;
                    break;
                } else {
                    vetor[i] = digitado;
                }
            }
        }

        System.out.println("VETOR ORIGEM: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }

        System.out.println();

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > vetor[i + 1]) {
                int aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;

                i = 0;
            }
        }

        System.out.println("VETOR ORDENADO: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }

        teclado.close();
    }
}