import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // EXERCÍCIO 2: Uma loja de calçados está concedendo 12% de desconto nos
        // produtos.
        // Escreva um programa para calcular e exibir o valor de desconto a ser dado num
        // par de sapatos e quanto deve custar o produto com o desconto.
        // O preço do par de sapatos deve ser informado pelo usuário.

        System.out.println("Digite o valor do par de sapatos:");
        double valorSapatos = teclado.nextDouble();

        double desconto = valorSapatos * 0.12;
        double precoFinal = valorSapatos - desconto;

        System.out.println("O valor do desconto é de R$ " + desconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + precoFinal);

        teclado.close();
    }
}
