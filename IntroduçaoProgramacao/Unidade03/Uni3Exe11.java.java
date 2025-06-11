import java.util.Scanner;

public class exercicioOnze {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Descreva um programa que dado uma temperatura em °C informe o seu valor em
        // °F. Fórmula: °F = (9/5) °C + 32

        System.out.println("Informe a temperatura em graus Celsius:");
        double grausCelsius = teclado.nextDouble();

        double conversaoFahrenheit = (grausCelsius * 9/5) + 32;

        System.out.println("O valor em Fahrenheit é: " + conversaoFahrenheit);

        teclado.close();
    }
}
