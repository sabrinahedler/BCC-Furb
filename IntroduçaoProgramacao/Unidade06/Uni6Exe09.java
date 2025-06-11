import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de
         * seus clientes. Trinta deles foram ouvidos e para cada um perguntou-se o sexo
         * (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor
         * inteiro) e a idade.
         * 
         * Baseado nisto faça um programa que informe:
         * 
         * qual a nota média recebida pelo cinema;
         * qual a nota média atribuída pelos homens;
         * qual a nota atribuída pela mulher mais jovem;
         * quantas das mulheres com mais de 50 anos deram nota superior a média recebida
         * pelo cinema.
         */

        int[] sexo = new int[30];
        int[] nota = new int[30];
        int[] idade = new int[30];

        int somaNotas = 0;
        int somaHomens = 0;
        int mulherMaisJovem = Integer.MAX_VALUE;
        int notaMulherJovem = 0;
        int contadorHomens = 0;
        int contadorMulheres = 0;

        for (int i = 0; i < 30; i++) {

            System.out.print("Informe seu gênero: (1=feminino 2=masculino)");
            sexo[i] = teclado.nextInt();

            System.out.print("Informe uma nota para o cinema: (de 0 á 10)");
            nota[i] = teclado.nextInt();
            somaNotas = somaNotas + nota[i];

            System.out.print("Informe sua idade:");
            idade[i] = teclado.nextInt();

            if (sexo[i] == 2) {
                somaHomens = somaHomens + nota[i];
                contadorHomens++;
            }
            if (sexo[i] == 1 && idade[i] < mulherMaisJovem) {
                mulherMaisJovem = idade[i];
                notaMulherJovem = nota[i];
            }
        }

        int mediaNotas = somaNotas / 30;
        int mediaHomensNotas = somaHomens / contadorHomens;

        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaNotas) {
                contadorMulheres++;
            }
        }

        System.out.println("Nota média recebida pelo cinema: " + mediaNotas);
        System.out.println("Nota média atribuída pelos homens: " + mediaHomensNotas);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherJovem);
        System.out.println("Mulheres com mais de 50 anos deram nota superior a média recebida\r\n" + //
                "         * pelo cinema: " + contadorMulheres);

        teclado.close();
    }
}