import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Dado um número inteiro positivo, determine a sua decomposição em fatores
         * primos. 
         */

         System.out.println("Informe um número inteiro:");
         int numero = teclado.nextInt();

         int divisor = 2;

         System.out.println("Número | Divisor");
        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.print(numero + "  | ");
                System.out.println(divisor);
                numero = numero / divisor;
            } else {
                divisor++;
            }
        }

        System.out.println("1");

        teclado.close();
    }
}