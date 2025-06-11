import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que
         * leia um valor e informe a quantidade mínima de cédulas que ele precisará
         * combinar para entregar o valor solicitado. Por exemplo: se o valor for 6,
         * então ele fornecerá uma cédula de 5 e outra de 1. Se o número for 47, então
         * ele fornecerá duas cédulas de 20, uma de 5 e outras de 2.
         */

        System.out.print("Digite o valor a ser sacado: ");
        int valor = teclado.nextInt();

        int cedulas20 = 0;
        int cedulas10 = 0;
        int cedulas5 = 0;
        int cedulas2 = 0;
        int cedulas1 = 0;

        if (valor >= 20) {
            cedulas20 = valor / 20;
            valor = valor % 20;
        }

        if (valor >= 10) {
            cedulas10 = valor / 10;
            valor = valor % 10;
        }

        if (valor >= 5) {
            cedulas5 = valor / 5;
            valor = valor % 5;
        }

        if (valor >= 2) {
            cedulas2 = valor / 2;
            valor = valor % 2;
        }

        if (valor >= 1) {
            cedulas1 = valor; 
        }

        System.out.println("Quantidade mínima de cédulas:");
        if (cedulas20 > 0)
            System.out.println("Notas de 20: " + cedulas20);
        if (cedulas10 > 0)
            System.out.println("Notas de 10: " + cedulas10);
        if (cedulas5 > 0)
            System.out.println("Notas de 5: " + cedulas5);
        if (cedulas2 > 0)
            System.out.println("Notas de 2: " + cedulas2);
        if (cedulas1 > 0)
            System.out.println("Notas de 1: " + cedulas1);

        teclado.close();
    }
}