import java.util.Scanner;

public class exercicioTreze {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50.
        // Faça um programa para ler o comprimento e altura de uma parede (em metros), e
        // depois escrever o valor gasto com a compra de azulejos. Considere que um
        // metro quadrado é formado por 9 azulejos.

        System.out.println("Informe o comprimento da parede em metros:");
        double comprimento = teclado.nextDouble();

        System.out.println("Informe a altura da parede em metros:");
        double altura = teclado.nextDouble();

        double tamanhoParede = comprimento * altura;
        double quantidadeAzulejos = tamanhoParede * 9;
        double gastoTotal = quantidadeAzulejos * 12.50;

        System.out.println("O valor gasto para a parede é R$ " + gastoTotal);

        teclado.close();

    }
}
