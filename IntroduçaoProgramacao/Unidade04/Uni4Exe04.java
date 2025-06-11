import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Dado um número de ponto flutuante maior do que 0, informe se foram digitadas
        // ou não casas decimais no número.

        System.out.println("Informe um valor:");
        double valor = teclado.nextDouble();

        if (valor > 0) {
            if (valor % 1 != 0) {
                System.out.println("O número tem casas decimais.");
            } else {
                System.out.println("O número não tem casas decimais.");
            }
        } else {
            System.out.println("O número deve ser maior que 0.");
        }
        
        teclado.close();
    }
}