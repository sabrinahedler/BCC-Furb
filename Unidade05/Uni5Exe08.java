import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Descreva um algoritmo que leia um número inteiro n e, dados n números
         * inteiros, descreva um algoritmo que:
         * escreva o menor valor negativo;
         * escreva a média dos números positivos.
         */

        int numeroNegativo = 0;
        int numero = 0;
        int soma = 0;
        int contador = 0;

        System.out.println("Informe quantos números deseja inserir:");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            numero = teclado.nextInt();

            if (numero >= 0) {
                soma = soma + numero;
                contador++;
            }
            if (numero < numeroNegativo) {
                numeroNegativo = numero;
            }
        }

        System.out.println("Menor valor negativo: " + numeroNegativo);
        System.out.println("Média dos números positivos: " + (soma / contador));

        teclado.close();
    }
}