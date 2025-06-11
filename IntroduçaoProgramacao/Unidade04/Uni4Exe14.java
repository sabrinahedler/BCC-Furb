import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está
        // entre 1 e 12, e se o dia existe naquele mês. Note que fevereiro tem 29 dias
        // em anos bissextos, e 28 dias em anos não bissextos.

        System.out.println("Informe uma data.");
        System.out.print("Dia: ");
        int dia = teclado.nextInt();
        System.out.print("Mês: ");
        int mes = teclado.nextInt();
        System.out.print("Ano: ");
        int ano = teclado.nextInt();

        if (mes >= 1 && mes <= 12) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Data Válida!");
                } else {
                    System.out.println("Data Inválida");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    System.out.println("Data Válida!");
                } else {
                    System.out.println("Data Inválida");
                }
            } else if (mes == 2) {
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    if (dia >= 1 && dia <= 29) {
                        System.out.println("Data Válida!");
                    } else {
                        System.out.println("Data Inválida");
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        System.out.println("Data Válida!");
                    } else {
                        System.out.println("Data Inválida");
                    }
                }
            }
        } else {
            System.out.println("Data Inválida");
        }

        teclado.close();
    }
}