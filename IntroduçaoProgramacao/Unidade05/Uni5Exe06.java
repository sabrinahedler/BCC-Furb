import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de
        // altura das mesmas

        double soma = 0;
        double altura = 0;

        System.out.println("Informe a altura de 20 pessoas: ");
        for (int i = 0; i < 20; i++) {
            altura = teclado.nextDouble();
            soma = soma + altura;
        }

        double media = soma / 20;
        System.out.println("A média das alturas inseridas é: " + media);

        teclado.close();
    }
}
