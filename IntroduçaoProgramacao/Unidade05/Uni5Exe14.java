import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que
         * comercializa. Para cada mercadoria ele tem o nome, o preço de compra (PC) e o
         * preço de venda (PV). Descreva um algoritmo que:
         * 
         * escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <=
         * 20%) e (lucro > 20%), onde o percentual de lucro é calculado da seguinte
         * forma: % = (PV - PC) / PC * 100;
         * determine e escreva o valor total de compra e de venda de todas as
         * mercadorias, assim como o lucro total.
         */

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        double lucro = 0;
        double lucroTotal = 0;
        double pcTotal = 0;
        double pvTotal = 0;

        System.out.println("Preencha as informações dos produtos:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Nome: ");
            String nome = teclado.next();
            System.out.print("Preço de compra: ");
            double PC = teclado.nextDouble();
            System.out.print("Preço de venda: ");
            double PV = teclado.nextDouble();

            lucro = (PV - PC) / PC * 100;
            lucroTotal = lucroTotal + (PV - PC);
            pcTotal = pcTotal + PC;
            pvTotal = pvTotal + PV;

            if (lucro < 10) {
                contador1++;
            }
            if (lucro >= 10 && lucro <= 20) {
                contador2++;
            }
            if (lucro > 20) {
                contador3++;
            }
        }

        System.out.println("Produtos com o lucro menor que 10%: " + contador1);
        System.out.println("Produtos com o lucro entre 10 e 20%: " + contador2);
        System.out.println("Produtos com o lucro maior que 20%: " + contador3);
        System.out.println("Valor total geral: " + (lucroTotal + pcTotal + pvTotal));

        teclado.close();
    }
}