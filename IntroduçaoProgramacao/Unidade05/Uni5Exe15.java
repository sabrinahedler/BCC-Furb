import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um
         * algoritmo para informar a média de cada aluno. Considere que a leitura dos
         * dados deve ser finalizada quando o nome do aluno for “fim”.
         */

         
        System.out.println("Informe os dados de alunos:");
        System.out.print("Nome: ");
        String nomeAluno = teclado.next();

        while (!nomeAluno.equalsIgnoreCase("fim")) {
            System.out.print("Nota Prova Um: ");
            double notaUm = teclado.nextDouble();
            System.out.print("Nota Prova Dois: ");
            double notaDois = teclado.nextDouble();

            System.out.println("Média: " + (notaUm + notaDois) / 2);
            System.out.println();
            System.out.print("Informe o nome do próximo aluno ou FIM para parar: ");
            nomeAluno = teclado.next();
        }

        teclado.close();
    }
}