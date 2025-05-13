import java.util.Scanner;

public class exercicioSeis {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa
        // que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a
        // pagar. O peso do prato é de 750 gramas.

        System.out.println("Informe o peso de seu prato em kg:");
        double pesoPrato = teclado.nextDouble();

        pesoPrato = pesoPrato - 0.750;
        double calculo = pesoPrato * 25;

        System.out.println("Você deverá pagar " + calculo + " reais.");

        teclado.close();
    }
}
