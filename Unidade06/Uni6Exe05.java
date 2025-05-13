import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça
         * cada um respondeu um questionário com 5 perguntas, como por exemplo:
         * 
         * Gosta de música sertaneja?
         * Gosta de futebol?
         * Gosta de seriados?
         * Gosta de redes sociais?
         * Gosta da Oktoberfest?
         * A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice
         * de afinidade é medido da seguinte maneira:
         * 
         * se ambos deram a mesma resposta soma-se 3 pontos ao índice;
         * se um respondeu IND e o outro SIM ou NÃO soma-se 1;
         * se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
         * Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as
         * respostas da moça. Crie um método que possa ler tanto as respostas do rapaz
         * como da moça, e outro para calcular e retornar a afinidade.
         */

        String[] perguntas = {
                "Gosta de música sertaneja?",
                "Gosta de futebol?",
                "Gosta de seriados?",
                "Gosta de redes sociais?",
                "Gosta da Oktoberfest?",
        };

        String[] rapaz = new String[5];
        String[] moca = new String[5];

        int afinidade = 0;

        System.out.println("Responda as questões com SIM, NÃO ou IND");
        System.out.println("Questionário do rapaz:");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            rapaz[i] = teclado.next();
        }

        System.out.println();

        System.out.println("Questionário da moça:");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            moca[i] = teclado.next();
        }

        for (int i = 0; i < perguntas.length; i++) {

            if (moca[i].equalsIgnoreCase(rapaz[i])) {
                afinidade = afinidade + 3;
            }
            if ((moca[i].equalsIgnoreCase("IND") &&
                    (rapaz[i].equalsIgnoreCase("SIM") || rapaz[i].equalsIgnoreCase("NAO")))
                    || (rapaz[i].equalsIgnoreCase("IND") &&
                            (moca[i].equalsIgnoreCase("SIM") || moca[i].equalsIgnoreCase("NAO")))) {
                afinidade = afinidade + 1;
            }
            if (moca[i].equalsIgnoreCase("NAO") && rapaz[i].equalsIgnoreCase("SIM")
                    || rapaz[i].equalsIgnoreCase("NAO") && moca[i].equalsIgnoreCase("SIM")) {
                afinidade = afinidade - 2;
            }
        }

        if (afinidade >= 15) {
            System.out.println("Casem!!!");
        } else if (afinidade >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0) {
            System.out.println("Vale um encontro.");
        } else if (afinidade < 0 && afinidade >= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }

        teclado.close();

    }
}