import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e
        // execute a operação correspondente. O algoritmo deve exibir uma mensagem de
        // erro se a opção for inválida. O menu tem as seguintes opções:
        // Escolha uma opção:
        // 1 - Soma de dois números.
        // 2 - Diferença entre dois números.
        // 3 - Produto entre dois números.
        // 4 - Divisão entre dois números (o denominador não pode ser zero).

        System.out.println("Informe dois números inteiros:");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        System.out.println("Agoras informe um número de 1 á 4:");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
            System.out.println(num1 + num2);
                break;
            case 2:
            if (num1 > num2){
                System.out.println(num1 - num2);
            } else {
                System.out.println(num2 - num1);
            }
                break;
            case 3:
            System.out.println(num1 * num2);
                break;
            case 4:
            if (num1 > num2 && num2 > 0){
                System.out.println(num1 / num2);
            } else if (num2 > num1 && num1 > 0){
                System.out.println(num2 / num1);
            } else {
                System.out.println("Operação inválida");
            }
                break;
            default:
            System.out.println("Opção informada incorreta");
                break;
        }

        teclado.close();
    }
}
