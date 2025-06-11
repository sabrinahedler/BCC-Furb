import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Dados dois números inteiros descreva um algoritmo para informar o maior valor
        // entre eles.

        System.out.println("Escreva dois números inteiros:");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " é maior que " + num1);
        } else {
            System.out.println("Os números são iguais");
        }

        teclado.close();
    }
}