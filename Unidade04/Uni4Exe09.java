import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Dados dois valores inteiros, escreva um algoritmo que informe se eles são
        // múltiplos ou não.

        System.out.println("Informe dois números:");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        if (num1 > num2 && num1 % num2 == 0) {
            System.out.println("Os valores são múltiplos");
        } else if (num1 < num2 && num2 % num1 == 0) {
            System.out.println("Os valores são múltiplos");
        } else {
            System.out.println("Os valores não são múltiplos");
        }

        teclado.close();
    }
}