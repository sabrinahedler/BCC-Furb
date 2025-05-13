import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Dado um caractere indicando uma opção, escreva um algoritmo para:
        // se opção = 'T': calcular a área de um triângulo de base b e altura h
        // se opção = 'Q': calcular a área de um quadrado de lado l
        // se opção = 'R': calcular a área de um retângulo de base b e altura h
        // se opção = 'C': calcular a área de um círculo de raio r

        System.out.println("Escolha uma opção, sendo elas: T, Q, R ou C:");
        char opcao = teclado.next().charAt(0);

        int base = 0;
        int altura = 0;

        switch (opcao) {
            case 't':
                System.out.println("Informe uma base:");
                base = teclado.nextInt();
                System.out.println("Agora informe uma altura:");
                altura = teclado.nextInt();

                System.out.println((base * altura) / 2);
                break;
            case 'q':
                System.out.println("Informe um lado:");
                int lado = teclado.nextInt();

                System.out.println(lado * lado);
                break;
            case 'r':
                System.out.println("Informe uma base:");
                base = teclado.nextInt();
                System.out.println("Agora informe uma altura:");
                altura = teclado.nextInt();

                System.out.println(base * altura);
                break;
            case 'c':
                System.out.println("Informe um raio:");
                int raio = teclado.nextInt();

                System.out.println(3.14 * (raio * raio));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        teclado.close();
    }
}
