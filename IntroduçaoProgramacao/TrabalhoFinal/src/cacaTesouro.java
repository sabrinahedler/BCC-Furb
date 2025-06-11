
import java.util.Random;
import java.util.Scanner;

public class cacaTesouro {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        // variáveis auxiliares:
        int contadorTesouro = 0;
        int contadorArmadilha = 0;
        int numTesouros = 0;
        int numJogadas = 0;

        // criando o mapa original:
        char[][] mapaOriginal = new char[9][9];

        // criando o mapa do tesouro visível:
        char[][] mapaVisivel = new char[9][9];

        // preenchendo os mapas:
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                mapaVisivel[x][y] = '~';
                mapaOriginal[x][y] = 'O';
            }
        }

        // posicionando os tesouros:
        while (contadorTesouro < 8) {
            int linhaAleatoria = random.nextInt(9);
            int colunaAleatoria = random.nextInt(9);

            if (mapaOriginal[linhaAleatoria][colunaAleatoria] == 'O') {
                mapaOriginal[linhaAleatoria][colunaAleatoria] = 'T';
                contadorTesouro++;
            }
        }

        // posicionando as armadilhas:
        while (contadorArmadilha < 5) {
            int linhaAleatoria = random.nextInt(9);
            int colunaAleatoria = random.nextInt(9);

            if (mapaOriginal[linhaAleatoria][colunaAleatoria] == 'O') {
                mapaOriginal[linhaAleatoria][colunaAleatoria] = 'A';
                contadorArmadilha++;
            }
        }

        // iniciando o jogo:
        System.out.print(" CAÇA AO TESOURO ");
        System.out.println();
        System.out.println("=======================================");
        System.out.println();

        do {
            // exibindo no console o mapa:
            System.out.print("  ");
            for (int y = 0; y < 9; y++) {
                System.out.print(" " + y + " ");
            }
            System.out.println();

            for (int x = 0; x < 9; x++) {
                System.out.print(x + "  ");
                for (int y = 0; y < 9; y++) {
                    System.out.print(mapaVisivel[x][y] + "  ");
                }
                System.out.println();
            }

            // solicitando as coordenadas:
            System.out.println();
            System.out.println("=======================================");
            System.out.println("Informe as coordenadas da escavação:");
            System.out.print("- Número da LINHA: ");
            int linha = teclado.nextInt();
            System.out.print("- Número da COLUNA: ");
            int coluna = teclado.nextInt();
            System.out.println("=======================================");

            // validando as coordenadas:
            if (linha < 0 || linha > 8 || coluna < 0 || coluna > 8) {
                System.out.println("Coordenada informada não existe.");
                System.out.println("=======================================");
                System.out.println();
                continue;
            }

            if (mapaVisivel[linha][coluna] != '~') {
                System.out.println("Essa coordenada já foi escavada.");
                System.out.println("=======================================");
                System.out.println();
                continue;
            }

            // verificando se na coordenada há um tesouro:
            if (mapaOriginal[linha][coluna] == 'T') {
                numTesouros++;
            }

            // acrescentando a jogada:
            mapaVisivel[linha][coluna] = mapaOriginal[linha][coluna];
            numJogadas++;

            // validação para determinar a continuação ou o fim do jogo
        } while (numJogadas < 25 && numTesouros < 8);
    }
}
