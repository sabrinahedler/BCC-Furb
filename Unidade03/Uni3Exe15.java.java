import java.util.Scanner;

public class exercicioQuinze {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Construa um programa para ler um número inteiro (assuma até 3 dígitos) e
        // imprima a saída da seguinte forma:

        System.out.println("Digite um número inteiro:");
        int numero = teclado.nextInt();

        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;

        System.out.println( centena + " centena(s), " + dezena + " dezena(s), " + unidade + " unidade(s).");

        teclado.close();

    }
}
