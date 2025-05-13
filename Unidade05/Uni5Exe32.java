import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Escreva um programa que imprime um calendário para um determinado mês. O
         * calendário deve conter cada dia do mês e o dia da semana correspondente. A
         * entrada consiste de um inteiro especificando em que dia da semana cai o
         * primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) e um inteiro
         * especificando o número de dias que o mês possui.
         * 
         * Exemplo: p = 3 n = 31
         */

         System.out.print("Informe o dia da semana do primeiro dia do mês (1=Dom, 7=Sáb): ");
         int primeiroDia = teclado.nextInt();
 
         System.out.print("Informe o número de dias do mês: ");
         int totalDias = teclado.nextInt();
 
         System.out.println("Dom Seg Ter Qua Qui Sex Sab");
 
         int diaAtual = 1;
         for (int i = 1; i < primeiroDia; i++) {
             System.out.print("    ");
         }
 
         for (int i = primeiroDia; diaAtual <= totalDias; i++) {
             System.out.printf("%3d ", diaAtual);
             diaAtual++;
 
             if (i % 7 == 0) {
                 System.out.println();
             }
         }
 
         System.out.println();

        teclado.close();
    }
}