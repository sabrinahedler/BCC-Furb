import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe20 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios,
        // descreva um algoritmo que calcule a média de aproveitamento e o conceito do
        // aluno, usando a fórmula:
        // media = (notaProva1 + notaProva2 + notaProva3 *3 + notaExercicios)/7
        // O algoritmo deve escrever a média de aproveitamento, o conceito
        // correspondente e a mensagem "aprovado" caso o conceito seja A, B ou C, e
        // "reprovado" caso o conceito seja D ou E.

        System.out.println("Informe 3 notas:");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();

        System.out.println("Informe a média dos exercícios:");
        double notaExercicios = teclado.nextDouble();

        double mediaNotas = (nota1 + (nota2 * 2) + (nota3 * 3) + notaExercicios) / 7;

        if (mediaNotas >= 9.0){
            System.out.println("A média de aproveitamento foi: " + df.format(mediaNotas) + ". Conceito: A. Aprovado");
        } else if (mediaNotas >= 7.5 && mediaNotas < 9.0){
            System.out.println("A média de aproveitamento foi: " + df.format(mediaNotas) + ". Conceito: B. Aprovado");
        } else if (mediaNotas >= 6.0 && mediaNotas < 7.5){
            System.out.println("A média de aproveitamento foi: " + df.format(mediaNotas) + ". Conceito: C. Aprovado");
        } else if (mediaNotas >= 4.0 && mediaNotas < 6.0){
            System.out.println("A média de aproveitamento foi: " + df.format(mediaNotas) + ". Conceito: D. Reprovado");
        } else {
            System.out.println("A média de aproveitamento foi: " + df.format(mediaNotas) + ". Conceito: E . Reprovado");
        }

        teclado.close();
    }
}