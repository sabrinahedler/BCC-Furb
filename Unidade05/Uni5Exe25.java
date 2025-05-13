import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o
         * jogador do lado direito, e E, ponto para o jogador do lado esquerdo da mesa.
         * Descreva um algoritmo que leia o código do ponto de cada jogada e determine o
         * vencedor. A partida encerra quando:
         * 
         * um dos jogadores chegar a 21 pontos e a diferença de pontos entre os
         * jogadores for maior ou igual a dois;
         * o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre
         * o adversário, caso a primeira condição não seja atendida.
         */

        System.out.println("Informe os pontos do jogador do lado direito:");
        int d = teclado.nextInt();

        System.out.println("Informe os pontos do jogador do lado esquerdo:");
        int e = teclado.nextInt();

        while (!((d >= 21 || e >= 21) && Math.abs(d - e) >= 2)) {
            System.out.println("Informe os pontos do jogador do lado direito:");
            d = teclado.nextInt();

            System.out.println("Informe os pontos do jogador do lado esquerdo:");
            e = teclado.nextInt();
        }

        System.out.println("Partida encerrada!");

        if (d > e) {
            System.out.println("O vencedor é o jogador DIREITO!");
        } else {
            System.out.println("O vencedor é o jogador ESQUERDO!");
        }

        teclado.close();
    }
}