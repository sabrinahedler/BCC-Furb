import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe23 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        /*
         * Uma grande loja de departamentos paga aos vendedores um salário com base nas
         * vendas efetuadas durante o mês, que é igual a 30% de comissão sobre o preço
         * de cada produto vendido. Cada vendedor, em um determinado mês, vende n
         * produtos, onde, para cada produto tem-se o preço unitário e a quantidade
         * vendida. O departamento de pessoal deseja obter um relatório com: nome, total
         * de vendas (em R$) e salário de cada vendedor. Descreva um algoritmo que gere
         * o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve
         * apresentar a seguinte mensagem: “deseja digitar os dados de mais um vendedor:
         * s (SIM) / n (NÃO)?”. número de produtos (n) de cada vendedor deve ser
         * informado.
         */

         String continuar;
         double totalVendas = 0;

         do {
            System.out.print("Informe o nome do vendedor: ");
            String nome = teclado.nextLine();

            System.out.print("Informe a quantidade de tipos de produtos vendidos: ");
            int n = teclado.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Produto " + i + ":");
                System.out.print("Preço unitário (R$): ");
                double preco = teclado.nextDouble();

                System.out.print("Quantidade vendida: ");
                int quantidade = teclado.nextInt();

                totalVendas += preco * quantidade;
            }

            double salario = totalVendas * 0.30;

            System.out.println("RELATÓRIO DO VENDEDOR");
            System.out.println("Nome: " + nome);
            System.out.printf("Total de vendas: R$ %.2f%n", totalVendas);
            System.out.printf("Salário (30%% de comissão): R$ ", df.format(salario));
            System.out.println();

            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            continuar = teclado.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        teclado.close();
    }
}