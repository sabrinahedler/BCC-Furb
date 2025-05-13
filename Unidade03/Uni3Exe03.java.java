import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // EXERCÍCIO 3: Um motorista deseja abastecer seu tanque de combustível.
        // Escreva um programa para ler o preço do litro da gasolina e o valor do
        // pagamento e exibir quantos litros ele conseguiu colocar no tanque.

        System.out.println("Informe o preço do litro da gasolina:");
        double precoGasolina = teclado.nextDouble();

        System.out.println("Informe quanto você pagou:");
        double valorPago = teclado.nextDouble();

        double quantidadeGasolina = valorPago / precoGasolina;

        System.out.println("Você conseguiu colocar " + quantidadeGasolina + " litros de gasolina em seu tanque.");

        teclado.close();
    }
}
