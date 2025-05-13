import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Faça um programa para ler os valores de dois vetores de inteiros, cada um
         * contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma
         * dos valores contidos nas posições respectivas dos vetores originais. Por
         * exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final,
         * os três vetores na tela. Faça três métodos: um método para ler valores dos
         * vetores, outro para somar e outro para escrever os vetores.
         */

         int [] vetor = new int [10];
         int [] vetor2 = new int [10];
         int [] vetor3 = new int [10];

         System.out.println("Escreva 10 números inteiros para o VETOR 1:");
          for (int i = 0; i < vetor.length; i++){
             vetor[i] = teclado.nextInt();
          }

          System.out.println("Escreva 10 números inteiros para o VETOR 2:");
          for (int i = 0; i < vetor.length; i++){
             vetor2[i] = teclado.nextInt();
          }

          for (int i = 0; i < vetor.length; i++){
             vetor3[i] = vetor[i] + vetor2[i];
          }

          System.out.println("Números colocados no VETOR 1:");
          for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
          }
          System.out.println();
          System.out.println("Números colocados no VETOR 2:");
          for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor2[i]);
          }
          System.out.println();
          System.out.println("Números gerados no VETOR 3:");
          for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor3[i]);
          }

        teclado.close();
    }
}