import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A
         * taxa de serviços é de:
         * 
         * R$ 7,50 por diária, caso o número de diárias seja menor que 15;
         * R$ 6,50 por diária, caso o número de diárias seja igual a 15;
         * R$ 5,00 por diária, caso o número de diárias seja maior que 15.
         * 
         * Descreva um algoritmo que apresente as seguintes opções ao recepcionista:
         * (1) encerrar a conta de um hóspede;
         * (2) verificar número de contas encerradas;
         * (3) sair.
         * 
         * Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do
         * hóspede e escreva o nome e total a ser pago. Caso a opção escolhida seja a
         * segunda, informe o número de hóspedes que deixaram o hotel (número de contas
         * encerradas). Caso a opção escolhida seja a terceira finalize a execução do
         * algoritmo.
         */

        int opcao;
        int contasEncerradas = 0;

        do {
            System.out.println("MENU:");
            System.out.println("1 - Encerrar conta de hóspede");
            System.out.println("2 - Verificar número de contas encerradas");
            System.out.println("3 - Sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do hóspede: ");
                    String nome = teclado.nextLine();

                    System.out.print("Número de diárias: ");
                    int diarias = teclado.nextInt();

                    double diaria = 50.00;
                    double taxa;

                    if (diarias < 15) {
                        taxa = 7.50;
                    } else if (diarias == 15) {
                        taxa = 6.50;
                    } else {
                        taxa = 5.00;
                    }

                    double total = diarias * (diaria + taxa);
                    System.out.printf("Hóspede: %s\nTotal a pagar: R$ %.2f\n", nome, total);
                    contasEncerradas++;
                    break;

                case 2:
                    System.out.println("Número de contas encerradas: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 3);

        teclado.close();
    }
}