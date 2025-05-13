public class Uni5Exe10 {
    public static void main(String[] args) throws Exception {

        /*
         * O número 3025 possui a seguinte característica:
         * 30 + 25 = 55 -> 55^2 == 3025
         * Escreva um programa que pesquise e imprima os 10 primeiros números naturais
         * que apresentam tal propriedade.
         */

        System.out.println("Os 10 primeiros números com a propriedade são:");

        int contador = 0;

        for (int i = 1; contador < 10; i++) {
            for (int divisor = 10; divisor <= i; divisor = divisor * 10) {

                int parte1 = i / divisor;
                int parte2 = i % divisor;

                int soma = parte1 + parte2;

                if (soma * soma == i) {
                    System.out.println(i);
                    contador++;
                }
            }
        }
    }
}