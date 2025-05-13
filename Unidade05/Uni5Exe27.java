import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Uma fábrica resolveu, no mês de Abril, pagar seus funcionários um valor
         * diário conforme as regras descritas abaixo. Escreva um programa para ler o
         * dia do mês de abril que será calculado o valor diário. O programa deve
         * validar a leitura do dia deforma a aceitar apenas valores válidos para o mês
         * de Abril (1 a 30). Caso o dia seja inválido, escrever a mensagem
         * "Dia inválido" e repetir a leitura até que seja válido. A seguir deve ser
         * lido o total de peças produzidas pelo funcionário no turno da manhã e o total
         * de peças produzidas no turno da tarde. Escrever o valor que o respectivo
         * funcionário receberá no dia. Logo após exibir a mensagem
         * "Novo funcionário (1.sim 2.não)?". Caso a resposta seja 1 o programa deve ser
         * repetido solicitando novamente o dia do mês e a produção de peças do
         * funcionário em cada turno, caso contrário deve ser encerrado.
         * 
         * Regras:
         * 
         * para a primeira quinzena do mês (1 a 15) o funcionário recebe R$ 0,80 por
         * peça caso tenha produzido mais de 100 no dia (considerando manhã e tarde),
         * desde que a produção em cada um dos turnos não seja inferior a 30. Caso
         * contrário recebe R$ 0,50 por peça.
         * para a segunda quinzena do mês (16 a 30) o funcionário recebe R$ 0,40 por
         * peça produzida no turno da manhã e R$ 0,30 por peça produzida no turno da
         * tarde.
         * Considere que a produção em cada turno nunca será a mesma (não é necessário
         * validar) Responda também:
         * 
         * qual dia ocorreu a maior produção;
         * em qual período o funcionário mais produz (manhã ou tarde e a quantidade
         * produzida).
         */

        int maiorProducaoDia = 0;
        int diaMaiorProducao = 0;
        int totalManha = 0;
        int totalTarde = 0;

        int opcao;

        do {
            int dia;

            do {
                System.out.print("Informe o dia do mês de Abril (1 a 30): ");
                dia = teclado.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido.");
                }
            } while (dia < 1 || dia > 30);

            System.out.print("Quantidade de peças produzidas no turno da MANHÃ: ");
            int manha = teclado.nextInt();

            System.out.print("Quantidade de peças produzidas no turno da TARDE: ");
            int tarde = teclado.nextInt();

            int producaoTotal = manha + tarde;
            double valorReceber = 0.0;

            if (dia >= 1 && dia <= 15) {
                if (producaoTotal > 100 && manha >= 30 && tarde >= 30) {
                    valorReceber = producaoTotal * 0.80;
                } else {
                    valorReceber = producaoTotal * 0.50;
                }
            } else {
                valorReceber = (manha * 0.40) + (tarde * 0.30);
            }

            System.out.printf("Valor a receber: R$ %.2f%n", valorReceber);

            totalManha += manha;
            totalTarde += tarde;

            if (producaoTotal > maiorProducaoDia) {
                maiorProducaoDia = producaoTotal;
                diaMaiorProducao = dia;
            }

            System.out.print("Novo funcionário (1. sim | 2. não)? ");
            opcao = teclado.nextInt();

        } while (opcao == 1);


        System.out.println("Dia com maior produção: " + diaMaiorProducao + " (Total: " + maiorProducaoDia + " peças)");

        if (totalManha > totalTarde) {
            System.out.println("Maior produção foi no turno da MANHÃ com " + totalManha + " peças.");
        } else {
            System.out.println("Maior produção foi no turno da TARDE com " + totalTarde + " peças.");
        }

        teclado.close();
    }
}