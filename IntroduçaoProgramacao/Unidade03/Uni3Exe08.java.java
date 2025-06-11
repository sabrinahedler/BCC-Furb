import java.util.Scanner;

public class exercicioOito {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela
        // entregou um valor em dólares para o atendente. Considerando que o atendente
        // tem a cotação do dólar, descreva um programa para calcular quantos reais o
        // atendente deve devolver para a pessoa.

        System.out.println("Informe quantos dólares você deu para o atendente:");
        double dolares = teclado.nextDouble();

        double valorDevolvido = dolares * 5.75;

        System.out.println("O valor que deve ser devolvido é " + valorDevolvido + " reais.");

        teclado.close();
    }
}
