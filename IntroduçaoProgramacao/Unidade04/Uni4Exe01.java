import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        double salarioExtra = 0;

        System.out.println("Entre com as horas trabalhadas no mês:");
        double horasMes = teclado.nextDouble();

        System.out.println("Entre com o valor pago por hora:");
        double horasValor = teclado.nextDouble();

        double salarioTotal = horasMes * horasValor;

        if (horasMes > 160) {
            salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        } else {
            salarioTotal = salarioTotal + salarioExtra;
        }

        System.out.println("O salário total é R$ " + salarioTotal);

        teclado.close();
    }
}