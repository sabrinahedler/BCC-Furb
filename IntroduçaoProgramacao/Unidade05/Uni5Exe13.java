import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Antes de sair de
         * viagem e imediatamente após retornar, o motorista encheu o tanque do veículo
         * e registrou as medidas do odômetro. Em cada parada feita durante a viagem,
         * foi registrado o valor do odômetro e a quantidade de combustível comprado
         * para reabastecer o veículo (suponha que o tanque foi enchido a cada parada).
         * Descreva um algoritmo que leia o número total de reabastecimentos feitos e os
         * dados registrados relativos à compra de combustível. Calcule e escreva:
         * 
         * a quilometragem obtida por litro de combustível em cada parada;
         * a quilometragem média obtida por litro de combustível em toda a viagem.
         */

        double media = 0;
        int contador = 0;

        System.out.print("Número total de reabastecimentos: ");
        int paradas = teclado.nextInt();

        for (int i = 1; i <= paradas; i++) {
            System.out.println("Parada " + i + ":");
            System.out.print("Quilometragem: ");
            double quilometragem = teclado.nextDouble();
            System.out.print("Combustível: ");
            double litros = teclado.nextDouble();

            media = media + (quilometragem / litros);
            contador++;

            System.out.println((quilometragem / litros) + " por litro.");
            System.out.println();
        }

        System.out.println("Quilometragem média obtida por litro: " + (media / contador));

        teclado.close();
    }
}