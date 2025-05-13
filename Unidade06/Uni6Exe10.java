import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Dado um vetor de números inteiros, com capacidade limitada a 50 elementos,
         * faça um programa que construa um menu com as seguintes opções:
         * 
         * “1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver
         * espaço. Informe o usuário se o valor foi incluído no vetor ou não;
         * “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no
         * vetor;
         * “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo
         * número a ser colocado no lugar (só para a primeira ocorrência deste número).
         * Caso o número a ser alterado exista no vetor, substitua-o pelo novo número.
         * Caso contrário, informe “número não encontrado”;
         * “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor,
         * exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A
         * posição que foi excluída o valor deve ser preenchida pelo valor seguinte,
         * sucessivamente até o final dos valores do vetor;
         * “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no
         * vetor;
         * “6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
         * “7 – Inverter valores”: desafio (ver abaixo);
         * “8 – Sair do sistema”: nesta opção deve ser finalizada a execução do
         * programa.
         */

        int[] vetor = new int[50];
        int opcao = 0;
        int quantidade = 0;

        do {
            System.out.println("MENU:");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");

            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidade >= 50) {
                        System.out.println("Não é possível incluir mais valores.");
                    } else {
                        System.out.print("Digite o valor a ser incluído: ");
                        int valor = teclado.nextInt();
                        vetor[quantidade] = valor;
                        quantidade++;
                        System.out.println("Valor incluído.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o valor a ser pesquisado: ");
                    int valorPesquisa = teclado.nextInt();
                    boolean encontrado = false;

                    for (int i = 0; i < quantidade; i++) {
                        if (vetor[i] == valorPesquisa) {
                            System.out.println("Valor encontrado na posição " + i);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Valor não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor a ser alterado: ");
                    int valorAntigo = teclado.nextInt();
                    boolean alterado = false;

                    for (int i = 0; i < quantidade; i++) {
                        if (vetor[i] == valorAntigo) {
                            System.out.print("Digite o novo valor: ");
                            vetor[i] = teclado.nextInt();
                            System.out.println("Valor alterado com sucesso.");
                            alterado = true;
                            break;
                        }
                    }
                    if (!alterado) {
                        System.out.println("Número não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o valor a ser excluído: ");
                    int valorExcluir = teclado.nextInt();
                    boolean excluido = false;

                    for (int i = 0; i < quantidade; i++) {
                        if (vetor[i] == valorExcluir) {
                            for (int j = i; j < quantidade - 1; j++) {
                                vetor[j] = vetor[j + 1];
                            }
                            quantidade--;
                            System.out.println("Valor excluído com sucesso.");
                            excluido = true;
                            break;
                        }
                    }

                    if (!excluido) {
                        System.out.println("Valor não encontrado.");
                    }
                    break;

                case 5:
                    if (quantidade == 0) {
                        System.out.println("Nenhum valor armazenado.");
                    } else {
                        System.out.println("Valores armazenados:");
                        for (int i = 0; i < quantidade; i++) {
                            System.out.print(vetor[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    for (int i = 0; i < quantidade - 1; i++) {
                        for (int j = 0; j < quantidade - 1 - i; j++) {
                            if (vetor[j] > vetor[j + 1]) {
                                int temp = vetor[j];
                                vetor[j] = vetor[j + 1];
                                vetor[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Valores ordenados em ordem crescente.");
                    break;

                case 7:
                    for (int i = 0; i < quantidade / 2; i++) {
                        int temp = vetor[i];
                        vetor[i] = vetor[quantidade - 1 - i];
                        vetor[quantidade - 1 - i] = temp;
                    }
                    System.out.println("Valores invertidos com sucesso.");
                    break;

                case 8:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 8);

        teclado.close();
    }
}