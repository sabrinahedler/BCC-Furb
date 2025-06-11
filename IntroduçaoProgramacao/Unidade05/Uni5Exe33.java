import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Em uma eleição para presidência, existem 4 candidatos. Os votos são
         * informados através de código. Os dados utilizados para votação obedecem a
         * seguinte codificação:
         * 
         * 1, 2, 3, 4 = voto para o respectivo candidato;
         * 5 = voto nulo;
         * 6 = voto em branco.
         * Elabore um programa que calcule e escreva:
         * 
         * total de votos para cada candidato;
         * total de votos nulos;
         * total de votos em branco;
         * percentual dos votos em branco e nulos sobre o total.
         * Se o usuário informar um número de operação incorreto, emitir a mensagem
         * “Opção incorreta” e persistir solicitando um número de opção correto. Para
         * interromper a operação, o usuário poderá fornecer o número 0.
         */

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int nulo = 0, branco = 0, totalVotos = 0;

        int voto;

        System.out.println("Digite seu voto:");
        System.out.println("1, 2, 3, 4 - para candidatos");
        System.out.println("5 - voto nulo");
        System.out.println("6 - voto em branco");
        System.out.println("0 - encerrar votação");

        while (true) {
            System.out.print("Informe seu voto: ");
            voto = teclado.nextInt();

            if (voto == 0) {
                break;
            }

            if (voto >= 1 && voto <= 6) {
                totalVotos++;

                switch (voto) {
                    case 1:
                        candidato1++;
                        break;
                    case 2:
                        candidato2++;
                        break;
                    case 3:
                        candidato3++;
                        break;
                    case 4:
                        candidato4++;
                        break;
                    case 5:
                        nulo++;
                        break;
                    case 6:
                        branco++;
                        break;
                }
            } else {
                System.out.println("Opção incorreta. Tente novamente.");
            }
        }

        System.out.println("RESULTADO:");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Candidato 4: " + candidato4 + " votos");
        System.out.println("Votos nulos: " + nulo);
        System.out.println("Votos em branco: " + branco);

        if (totalVotos > 0) {
            double percNulo = (nulo * 100.0) / totalVotos;
            double percBranco = (branco * 100.0) / totalVotos;

            System.out.printf("Percentual de votos nulos: %.2f%%\n", percNulo);
            System.out.printf("Percentual de votos em branco: %.2f%%\n", percBranco);
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }

        teclado.close();
    }
}