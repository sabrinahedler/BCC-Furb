import java.util.Scanner;

public class exercicioQuatorze {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Descreva um programa que a partir da distância percorrida e o do tempo gasto
        // por um motorista durante uma viagem de final de semana, calcule a velocidade
        // média e a quantidade de combustível gasto na viagem, sabendo que o automóvel
        // faz 12 km por litro.

        System.out.println("Informe a distância percorrida em km:");
        double distanciaPercorrida = teclado.nextDouble();

        System.out.println("Informe o tempo que levou:");
        double tempoLevado = teclado.nextDouble();

        double velocidadeMedia = distanciaPercorrida / tempoLevado;
        double combustivelGasto = distanciaPercorrida / 12;

        System.out.println("A Velocidade média do veículo foi de: " + velocidadeMedia);
        System.out.println("O combustível gasto na viagem foi de: " + combustivelGasto);

        teclado.close();
        
    }
}
