import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Astolfo resolveu fazer uma viagem para conhecer o nosso país
         * Ele pretende visitar várias cidades, dividindo assim a viagem em vários
         * trechos. Entretanto Astolfo se nega
         * a passar por estradas cujo custo do pedágio exceda um determinado valor. Faça
         * um programa que leia inicialmente o valor do pedágio ao qual Astolfo se nega
         * a pagar. A seguir leia várias duplas de valores representando respectivamente
         * o custo do pedágio e a distância (em Km) do trecho. Calcular e escrever:
         * 
         * quantos trechos da viagem possuem um valor de pedágio acima do qual Astolfo
         * nega­se a pagar;
         * quantos trechos foram informados;
         * quantos trechos acima de 150Km de distância possuem um valor de pedágio que 
         * Astolfo concorda em pagar.
         * OBS: O programa será encerrado ao ser fornecido um valor de pedágio negativo.
         * Neste caso a leitura da distância não deve ser executada. Os resultados devem
         * ser impressos no final do programa.
         */

         double limitePedagio;
         double pedagio = 0;  
         double distancia;
         int trechosNegados = 0;
         int totalTrechos = 0;
         int trechosLongosAceitos = 0;
 
         System.out.print("Digite o valor máximo de pedágio: ");
         limitePedagio = teclado.nextDouble();
 
         System.out.print("Informe o valor do pedágio (negativo para encerrar): ");
         pedagio = teclado.nextDouble();
 
         while (pedagio > 0) {
             System.out.print("Informe a distância do trecho em Km: ");
             distancia = teclado.nextDouble();
 
             totalTrechos++;
 
             if (pedagio > limitePedagio) {
                 trechosNegados++;
             }
 
             if (distancia > 150 && pedagio <= limitePedagio) {
                 trechosLongosAceitos++;
             }
 
             System.out.print("Informe o valor do próximo pedágio (negativo para encerrar): ");
             pedagio = teclado.nextDouble();
         }
 
         System.out.println("Trechos com pedágio acima do limite: " + trechosNegados);
         System.out.println("Total de trechos informados: " + totalTrechos);
         System.out.println("Trechos com mais de 150Km com pedágio aceito: " + trechosLongosAceitos);

        teclado.close();
    }
}