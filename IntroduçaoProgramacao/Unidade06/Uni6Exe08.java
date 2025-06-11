import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base
         * neste valor, crie um vetor do tipo real. Faça o usuário informar valores para
         * as posições deste vetor e coloque-as nas posições na sequência informada pelo
         * usuário. Imprima uma tabela contendo cada valor diferente e o número de vezes
         * que o valor aparece no vetor
         */

        System.out.print("Informe um valor inteiro de 1 á 20: ");
        int valor = teclado.nextInt();

        while (valor < 1 || valor > 20) {
            System.out.println("Valor informado está incorreto!");
            System.out.print("Digite novamente: ");
            valor = teclado.nextInt();
        }

        double[] vetor = new double[valor];
        boolean[] contador = new boolean[valor];

        System.out.println("Agora, preencha esse vetor com números reais: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextInt();
        }

        System.out.printf("%-10s | %s\n", "VALOR", "FREQUÊNCIA");
        System.out.println("-----------|-----------");

        for (int i = 0; i < valor; i++) {
            if (!contador[i]) {
                int contado = 1;

                for (int j = i + 1; j < valor; j++) {
                    if (vetor[i] == vetor[j]) {
                        contado++;
                        contador[j] = true;
                    }
                }
                System.out.printf("%-10.2f | %d\n", vetor[i], contado);
            }
        }

        teclado.close();
    }
}