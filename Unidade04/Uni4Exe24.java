import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem
        // a partir de um menu de opções:
        // se opção = 1, escreva os 3 valores em ordem crescente
        // se opção = 2, escreva os 3 valores em ordem decrescente
        // se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio

        System.out.println("Informe 3 valores:");
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        int valor3 = teclado.nextInt();

        System.out.println("Agora informe um número para a opção:");
        int opcao = teclado.nextInt();

        int valorMaior = 0;
        int valorMediano = 0;
        int valorMenor = 0;

        if (valor1 > valor2 && valor2 > valor3) {
            valorMaior = valor1;
            valorMediano = valor2;
            valorMenor = valor3;
        } else if (valor1 > valor3 && valor3 > valor2) {
            valorMaior = valor1;
            valorMediano = valor3;
            valorMenor = valor2;
        } else if (valor2 > valor1 && valor1 > valor3) {
            valorMaior = valor2;
            valorMediano = valor1;
            valorMenor = valor3;
        } else if (valor2 > valor3 && valor3 > valor1) {
            valorMaior = valor2;
            valorMediano = valor3;
            valorMenor = valor1;
        } else if (valor3 > valor2 && valor2 > valor1) {
            valorMaior = valor3;
            valorMediano = valor2;
            valorMenor = valor1;
        } else if (valor3 > valor1 && valor1 > valor2) {
            valorMaior = valor3;
            valorMediano = valor1;
            valorMenor = valor2;
        }

        switch (opcao) {
            case 1:
                System.out.println(valorMenor + ", " + valorMediano + ", " + valorMaior);
                break;
            case 2:
                System.out.println(valorMaior + ", " + valorMediano + ", " + valorMenor);
                break;
            case 3:
                System.out.println(valorMediano + ", " + valorMaior + ", " + valorMenor);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        teclado.close();
    }
}