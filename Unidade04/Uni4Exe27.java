import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a hora de chegada: ");
        int horaChegada = teclado.nextInt();
        System.out.print("Informe os minutos de chegada: ");
        int minChegada = teclado.nextInt();

        System.out.print("Informe a hora de saída: ");
        int horaSaida = teclado.nextInt();
        System.out.print("Informe os minutos de saída: ");
        int minSaida = teclado.nextInt();

        int minTotaisChegada = horaChegada * 60 + minChegada;
        int minTotaisSaida = horaSaida * 60 + minSaida;
        int tempoEstacionado = minTotaisSaida - minTotaisChegada;

        if (tempoEstacionado < 0) {
            System.out.println("Erro: saída não pode ser antes da chegada.");
        } else {
            // Arredonda o tempo
            int horasCobradas = tempoEstacionado / 60;
            if (tempoEstacionado % 60 >= 30) {
                horasCobradas++;
            }

            int preco = 0;

            if (horasCobradas < 1){
                preco = 5;
            }

            switch (horasCobradas) {
                case 1:
                    preco = horasCobradas * 5;
                    break;
                case 2:
                    preco = horasCobradas * 5;
                    break;
                case 3:
                case 4:
                    preco = 10 + (horasCobradas - 2) * 7;
                    break;
                default:
                    if (horasCobradas >= 5) {
                        preco = 24 + (horasCobradas - 4) * 10;
                    }
            }

            System.out.println("Preço cobrado = R$" + preco + ",00");
        }

        teclado.close();
    }
}