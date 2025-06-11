import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Descreva um algoritmo que leia o número de inscrição e a altura de um atleta
         * em uma competição e informe:
         * o número de inscrição e a altura do atleta mais alto;
         * o número de inscrição e a altura do atleta mais baixo;
         * a altura média do grupo de atletas.
         * A leitura deve ser finalizada ao digitar 0 para o número de inscrição.
         */

        int contador = 0;
        double alturaGrupo = 0;
        int atletaBaixo = 0;
        int atletaAlto = 0;
        double minimo = Double.MAX_VALUE;
        double maximo = Double.MIN_VALUE;

         System.out.println("Informe abaixo os dados dos atletas:");
         System.out.print("Número de inscrição: ");
         int numInscricao = teclado.nextInt();

         while(numInscricao != 0){
            System.out.print("Altura: ");
            double altura = teclado.nextDouble();

            if (altura < minimo){
                minimo = altura;
                atletaBaixo = numInscricao;
            }
            if (altura > maximo){
                maximo = altura;
                atletaAlto = numInscricao;
            }

            alturaGrupo = alturaGrupo + altura;
            contador++;

            System.out.println("Informe novamente um número de inscrição ou 0 para parar:");
            numInscricao = teclado.nextInt();
         }

         System.out.println("Número de inscrição do atleta MAIS ALTO: " + atletaAlto);
         System.out.println("Número de inscrição do atleta MAIS BAIXO: " + atletaBaixo);
         System.out.println("Altura média dos atletas: " + (alturaGrupo / contador));

        teclado.close();
    }
}