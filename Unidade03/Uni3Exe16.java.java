import java.util.Scanner;

public class exercicioDezesseis {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
        // Considerando que alguém está pagando uma compra, faça um programa que
        // determine e escreva o número mínimo de notas que o caixa deve fornecer como
        // troco. Escreva também o número de cada tipo de nota a ser fornecido como
        // troco. Suponha que o sistema monetário não utilize centavos.

        System.out.println("Informe o valor a ser pago:");
        int valorPago = teclado.nextInt();

        int notasCem = valorPago / 100;
        int notasDez = (valorPago % 100) / 10;
        int notasUm = valorPago % 10;

        int totalNotas = notasCem + notasDez + notasUm;

        System.out.println("Quantidade minimas de notas a receber: " + totalNotas);
        System.out.println(notasCem + " nota(s) de cem, " + notasDez + " nota(s) de dez, " + notasUm + " nota(s) de um.");
        
        teclado.close();

    }
}
