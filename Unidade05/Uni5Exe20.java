import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Um determinado material radioativo perde metade de sua massa a cada 50
         * segundos. Dada a sua massa inicial em Kg, descreva um algoritmo que determine
         * o tempo necessário para que essa massa se torne menor que 0,5 gramas. Escreva
         * a massa inicial, a massa final e o tempo.
         */

         int contador = 0;

         System.out.println("Informe a massa inicial (em kg):");
         double material = teclado.nextDouble();

         double massaInicial = material;

         while (material >= 0.5){

            material = material / 2;
            contador++;
         }

         System.out.println("Massa inicial: " + massaInicial);
         System.out.println("Massa final: " + material);

         double tempo = 0.50 * contador;

         if (tempo >= 1){
            System.out.println("Tempo levado: " + tempo + " minuto(s)");
         } else {
            System.out.println("Tempo levado: " + tempo + " segundo(s)");
         }

        teclado.close();
    }
}