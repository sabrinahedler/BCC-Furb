import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Escreva um programa que leia um número inteiro positivo n e em seguida
         * imprima n linhas do chamado Triangulo de Floyd:
         */

        int numero = 1;

        System.out.println("Informe o número de linhas:");
        int n = teclado.nextInt();

        System.out.println(); 

        for(int i = 1; i <= n; i++){
            for (int x = 1; x <= i; x++) { 
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println(); 
        }

        teclado.close();
    }
}