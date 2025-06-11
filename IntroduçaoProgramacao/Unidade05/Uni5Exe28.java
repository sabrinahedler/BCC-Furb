import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Os votos são informados através de códigos:
         * 
         * código | conjunto
         * 1 | Nenhum de Nós
         * 2 | CPM22
         * 3 | Skank
         * 4 |Jota Quest
         * 
         * Descreva um algoritmo que:
         * 
         * informe o total de votos para cada grupo;
         * informe o percentual dos votos para cada grupo;
         * informe o grupo vencedor.
         * O algoritmo deve apresentar ao usuário a seguinte mensagem: mais um voto: s
         * (SIM) / n (NÃO)? antes de prosseguir com a entrada de dados.
         */

         int votosNenhum = 0;
         int votosCPM22 = 0;
         int votosSkank = 0;
         int votosJotaQuest = 0;
         int totalVotos = 0;
 
         String continuar = "s";
 
         while (continuar.equalsIgnoreCase("s")) {
             System.out.println("Vote em seu grupo favorito:");
             System.out.println("1 - Nenhum de Nós");
             System.out.println("2 - CPM22");
             System.out.println("3 - Skank");
             System.out.println("4 - Jota Quest");
             System.out.print("Digite o código do grupo: ");
             int voto = teclado.nextInt();
 
             switch (voto) {
                 case 1:
                     votosNenhum++;
                     totalVotos++;
                     break;
                 case 2:
                     votosCPM22++;
                     totalVotos++;
                     break;
                 case 3:
                     votosSkank++;
                     totalVotos++;
                     break;
                 case 4:
                     votosJotaQuest++;
                     totalVotos++;
                     break;
                 default:
                     System.out.println("Código inválido! Voto não contabilizado.");
                     break;
             }
 
             System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
             continuar = teclado.next();
         }
 
         System.out.println("RESULTADO FINAL DA VOTAÇÃO:");
 
         double percNenhum = 0, percCPM = 0, percSkank = 0, percJota = 0;
 
         if (totalVotos > 0) {
             percNenhum = (votosNenhum * 100.0) / totalVotos;
             percCPM = (votosCPM22 * 100.0) / totalVotos;
             percSkank = (votosSkank * 100.0) / totalVotos;
             percJota = (votosJotaQuest * 100.0) / totalVotos;
         }
 
         System.out.println("Nenhum de Nós: " + votosNenhum + " votos (" + String.format("%.2f", percNenhum) + "%)");
         System.out.println("CPM22: " + votosCPM22 + " votos (" + String.format("%.2f", percCPM) + "%)");
         System.out.println("Skank: " + votosSkank + " votos (" + String.format("%.2f", percSkank) + "%)");
         System.out.println("Jota Quest: " + votosJotaQuest + " votos (" + String.format("%.2f", percJota) + "%)");
 
         String vencedor = "";
         int maior = votosNenhum;
         vencedor = "Nenhum de Nós";
 
         if (votosCPM22 > maior) {
             maior = votosCPM22;
             vencedor = "CPM22";
         }
         if (votosSkank > maior) {
             maior = votosSkank;
             vencedor = "Skank";
         }
         if (votosJotaQuest > maior) {
             maior = votosJotaQuest;
             vencedor = "Jota Quest";
         }
 
         System.out.println("Grupo vencedor: " + vencedor);

        teclado.close();
    }
}