import java.util.Scanner;

public class exercicioNove {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
 
        // Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
        // volume = pi * raio ^2 * altura

        System.out.println("Informe a altura de sua lata:");
        double altura = teclado.nextDouble();

        System.out.println("Agora informe o raio:");
        double raio = teclado.nextDouble();

        double volume = 3.141592653589793 * (raio * raio) * altura;
        System.out.println("O volume da sua lata de óleo é: " + volume);

        teclado.close();
    }
}
