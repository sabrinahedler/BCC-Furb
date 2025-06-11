import java.util.Scanner;

public class exercicioQuatro {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // EXERCÍCIO 4: Faça um programa para ler três notas de um aluno em uma
        // disciplina e imprimira sua média ponderada
        // (as notas tem pesos respectivos de 5, 3 e 2)

        System.out.println("Informe 3 notas de um mesmo aluno:");
        double notaUm = teclado.nextDouble();
        double notaDois = teclado.nextDouble();
        double notaTres = teclado.nextDouble();

        double mediaUm = notaUm * 0.5;
        double mediaDois = notaDois * 0.3;
        double mediaTres = notaTres * 0.2;

        double mediaGeral = mediaUm + mediaDois + mediaTres;

        System.out.println("A média ponderada deste aluno é: " + mediaGeral);

        teclado.close();
    }
}
