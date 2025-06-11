import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // EXERCÍCIO 1: Uma imobiliária vende apenas terrenos retangulares.
        // Faça um programa para ler as dimensões de um terreno e depois exibir a área
        // do terreno.

        System.out.println("Digite uma altura:");
        int altura = teclado.nextInt();

        System.out.println("Digite uma largura:");
        int largura = teclado.nextInt();

        int area = largura * altura;

        System.out.println("A area do terreno é: " + area);

        teclado.close();
    }
}
