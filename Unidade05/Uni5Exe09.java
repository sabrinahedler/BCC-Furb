import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um
         * algoritmo que:
         * escreva os nomes dos alunos que tem 18 anos;
         * escreva a quantidade de alunos que tem idade acima de 20 anos.
         */

        System.out.println("Informe quantos alunos sua turma tem:");
        int n = teclado.nextInt();

        String nome = "";
        String alunosCom18 = "";
        int idade = 0;
        int contador = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            nome = teclado.next();
            System.out.print("Idade: ");
            idade = teclado.nextInt();

            if (idade == 18) {
                if (!alunosCom18.isEmpty()) {
                    alunosCom18 = alunosCom18 + ", ";
                }
                alunosCom18 = alunosCom18 + nome;
            }

            if (idade > 20){
                contador++;
            }
        }

        System.out.println("Nomes dos alunos que tem 18 anos: " + alunosCom18);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + contador);

        teclado.close();
    }
}