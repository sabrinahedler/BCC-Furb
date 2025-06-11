import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe19 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        /*
         * O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15%
         * caso seja menor ou igual. Descreva um algoritmo que leia o valor da compra e
         * escreva o total a pagar a cada compra. Informe também o valor total recebido
         * pela loja ao final do dia. A leitura deve ser finalizada com a leitura 0 para
         * o valor da compra.
         */

         double desconto = 0;
         double valorCompra = 0;
         double valorTotal = 0;

         System.out.println("Valor da compra: ");
         double valor = teclado.nextDouble();

         while ( valor != 0){

            if (valor > 500){
                desconto = valor * 0.20;
                valorCompra = valor - desconto;
            } else {
                desconto = valor * 0.15;
                valorCompra = valor - desconto;
            }

            valorTotal = valorTotal + valorCompra;

            System.out.println("Valor a pagar: R$ " + df.format(valorCompra));

            System.out.println("Valor da compra: ");
            valor = teclado.nextDouble();
         }

         System.out.println("O valor total recebido foi de R$ " + df.format(valorTotal));

        teclado.close();
    }
}