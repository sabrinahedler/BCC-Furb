import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual
        // quadrante ele está localizado
        // 0, se os dois valores forem zero
        // 1, se os dois valores forem positivos
        // 2, se o x for negativo e o y, positivo
        // 3, se os dois valores forem negativos
        // 4, se o x for positivo e o y, negativo

        System.out.println("Informe as coordenadas:");
        System.out.print("X: ");
        int x = teclado.nextInt();

        System.out.print("Y: ");
        int y = teclado.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 4");
        } else {
            System.out.println("Quadrante 1");
        }

        teclado.close();
    }
}
