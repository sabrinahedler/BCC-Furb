import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Uma loja que trabalha com crediário funciona da seguinte maneira: se o
        // pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e é
        // avisado que o pagamento está em dia. Se o pagamento é realizado até cinco
        // dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa
        // mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um
        // algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da
        // prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas
        // mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os
        // clientes nunca deixam para pagar no mês seguinte.

        System.out.print("Dia do vencimento: ");
        int diaVencimento = teclado.nextInt();

        System.out.print("Dia do pagamento: ");
        int diaPagamento = teclado.nextInt();

        System.out.print("Valor da prestação: ");
        double valorPrestacao = teclado.nextDouble();

        if (diaPagamento <= diaVencimento){
            valorPrestacao = valorPrestacao - (valorPrestacao * 0.10);
            System.out.println("O pagamento está em dia. O valor da prestação = R$ " + valorPrestacao);
        } else if (diaPagamento > diaVencimento && diaPagamento <= diaVencimento + 5){
            System.out.println("O pagamento está atrasado. O valor da prestação = R$ " + valorPrestacao);
        } else {
            int diasAtrasados = diaPagamento - diaVencimento;
            valorPrestacao = valorPrestacao + ((valorPrestacao * 0.02) * diasAtrasados);
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. O valor da prestação = R$ " + valorPrestacao);
        }

        teclado.close();
    }
}
