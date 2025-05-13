import java.util.Scanner;

public class exercicioSete {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350
        // ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma
        // determinada quantidade de cada formato, faça um programa para calcular
        // quantos litros de refrigerante ele comprou.

        System.out.println("Informe quantas latas você pegou:");
        double latas = teclado.nextDouble();

        System.out.println("Informe quantas garrafas de 600ml você pegou:");
        double garrafas = teclado.nextDouble();

        System.out.println("Informe quantas garrafas de 2 litros você pegou:");
        double litrao = teclado.nextDouble();

        latas = latas * 0.350;
        garrafas = garrafas * 0.600;
        litrao = litrao * 2;

        double litrosTotais = latas + garrafas + litrao;

        System.out.println("Você comprou um total de " + litrosTotais + " litros.");

        teclado.close();
    }
}
