import java.util.Scanner;

public class desafio {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Desenvolva um programa em Java que realize a análise de notas de uma turma
         * escolar. O programa deve
         * permitir o cadastro das notas dos alunos, calcular estatísticas básicas e
         * classificar os alunos conforme seu
         * desempenho.
         */

        int[] matriculasVetor = new int[20];
        int[] notasVetor = new int[20];
        int[] frequenciasVetor = new int[20];

        int opcao = 0;
        int quantidade = 0;
        int matricula = 0;
        int nota = 0;
        int frequencia = 0;
        int contadorAprovados = 0;
        int contadorRecuperacao = 0;
        int contadorReprovados = 0;

        do {
            System.out.println("MENU:");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Exibir dados de todos os alunos");
            System.out.println("3 - Calcular estatísticas da turma");
            System.out.println("4 - Verificar situação de um aluno específico");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidade >= 20) {
                        System.out.println("Não é possível cadastrar mais alunos.");
                    } else {
                        System.out.print("Número da matrícula: ");
                        matricula = teclado.nextInt();

                        for (int i = 0; i < 20; i++) {
                            if (matricula == matriculasVetor[i]) {
                                System.out.println("Matrícula informada já existe.");
                                System.out.print("Tente novamente: ");
                                matricula = teclado.nextInt();
                            }
                        }

                        matriculasVetor[quantidade] = matricula;

                        System.out.print("Nota da prova: ");
                        nota = teclado.nextInt();

                        if (nota < 0 || nota > 10) {
                            System.out.println("Valor informado está incorreto.");
                            System.out.print("Insira um número de 0 á 10: ");
                            nota = teclado.nextInt();
                        }

                        notasVetor[quantidade] = nota;

                        System.out.print("Frequência: ");
                        frequencia = teclado.nextInt();

                        if (frequencia < 0 || frequencia > 20) {
                            System.out.println("Valor informado está incorreto.");
                            System.out.print("Insira um número de 0 á 20: ");
                            frequencia = teclado.nextInt();
                        }

                        frequenciasVetor[quantidade] = frequencia;

                        quantidade++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < quantidade; i++) {
                        System.out.println("-------------------");
                        System.out.println("DADOS DO ALUNO " + i);
                        System.out.println("Matrícula: " + matriculasVetor[i]);
                        System.out.println("Nota da prova: " + notasVetor[i]);
                        System.out.println("Frequência: " + frequenciasVetor[i]);

                        if (notasVetor[i] >= 7 && frequenciasVetor[i] >= 15) {
                            System.out.println("Situação: Aprovado.");
                            contadorAprovados++;
                        } else if (notasVetor[i] >= 5 && notasVetor[i] < 7 && frequenciasVetor[i] >= 15) {
                            System.out.println("Situação: Recuperação.");
                            contadorRecuperacao++;
                        } else if (notasVetor[i] < 5 && frequenciasVetor[i] >= 15) {
                            System.out.println("Situação: Reprovado por nota.");
                            contadorReprovados++;
                        } else if (frequenciasVetor[i] < 15) {
                            System.out.println("Situação: Reprovado por frequência.");
                            contadorReprovados++;
                        }
                        System.out.println("-------------------");

                        contadorAprovados = 0;
                        contadorRecuperacao = 0;
                        contadorReprovados = 0;
                    }
                    break;
                case 3:
                    int maiorNota = Integer.MIN_VALUE;
                    int menorNota = Integer.MAX_VALUE;
                    int soma = 0;

                    for (int i = 0; i < quantidade; i++) {
                        if (notasVetor[i] > maiorNota) {
                            maiorNota = notasVetor[i];
                        }
                        if (notasVetor[i] < menorNota) {
                            menorNota = notasVetor[i];
                        }

                        soma = soma + notasVetor[i];

                        if (notasVetor[i] >= 7 && frequenciasVetor[i] >= 15) {
                            System.out.println("Situação: Aprovado.");
                            contadorAprovados++;
                        } else if (notasVetor[i] >= 5 && notasVetor[i] < 7 && frequenciasVetor[i] >= 15) {
                            System.out.println("Situação: Recuperação.");
                            contadorRecuperacao++;
                        } else if (notasVetor[i] < 5 && frequenciasVetor[i] >= 15) {
                            System.out.println("Situação: Reprovado por nota.");
                            contadorReprovados++;
                        } else if (frequenciasVetor[i] < 15) {
                            System.out.println("Situação: Reprovado por frequência.");
                            contadorReprovados++;
                        }
                    }

                    System.out.println("MAIOR nota cadastrada: " + maiorNota);
                    System.out.println("MENOR nota cadastrada: " + menorNota);
                    System.out.println("Média das notas cadastradas: " + (soma / quantidade));
                    System.out.println("Alunos APROVADOS: " + contadorAprovados);
                    System.out.println("Alunos em RECUPERAÇÃO: " + contadorRecuperacao);
                    System.out.println("Alunos REPROVADOS: " + contadorReprovados);
                    System.out.println("Percentual de aprovação: " + (contadorAprovados / quantidade) * 100 + "%");

                    contadorAprovados = 0;
                    contadorRecuperacao = 0;
                    contadorReprovados = 0;
                    break;
                case 4:
                    System.out.print("Informe um número de matrícula: ");
                    int digitar = teclado.nextInt();

                    for (int i = 0; i < 20; i++) {
                        if (matriculasVetor[i] == digitar) {
                            System.out.println("Nota da prova: " + notasVetor[i]);
                            System.out.println("Frequencia: " + frequenciasVetor[i]);

                            if (notasVetor[i] >= 7 && frequenciasVetor[i] >= 15) {
                                System.out.println("Situação: Aprovado.");
                            } else if (notasVetor[i] >= 5 && notasVetor[i] < 7 && frequenciasVetor[i] >= 15) {
                                System.out.println("Situação: Recuperação.");
                            } else if (notasVetor[i] < 5 && frequenciasVetor[i] >= 15) {
                                System.out.println("Situação: Reprovado por nota.");
                            } else if (frequenciasVetor[i] < 15) {
                                System.out.println("Situação: Reprovado por frequência.");
                            }
                        }
                    }

                    break;
                default:
                    System.out.println("Opção informada não existe.");
                    break;
            }

        } while (opcao != 5);
        System.out.println("Encerrando o programa.");

        teclado.close();
    }
}