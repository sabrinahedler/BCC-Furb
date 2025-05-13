import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) throws Exception {

        // Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável
        // lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”,
        // caso seja false.

        Scanner teclado = new Scanner(System.in);

        System.out.println("A cor é azul?");
        String resposta = teclado.next();

        if (resposta.toLowerCase().equals("sim")) {
            System.out.println("A cor é azul.");
        } else if (resposta.toLowerCase().equals("não")) {
            System.out.println("A cor não é azul.");
        } else {
            System.out.println("Resposta inválida.");
        }

        teclado.close();
    }
}