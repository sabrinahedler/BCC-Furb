import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Descreva um algoritmo que leia 20 números inteiros e escreva, para cada
        // número lido, se o mesmo é par ou ímpar.

        int numero = 0;

        for (int i = 0; i < 21; i++) {
            numero = teclado.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("ímpar");
            }
        }

        teclado.close();
    }
}