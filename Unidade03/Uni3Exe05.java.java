import java.util.Scanner;

public class exercicioCinco {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Uma granja possui um controle automatizado de cada frango da sua produção. No
        // pé direito do frango há um anel com um chip de identificação; no pé esquerdo
        // são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo
        // que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um
        // programa para calcular o gasto total da granja para marcar todos os seus
        // frangos.

        System.out.println("Informe quantas galinhas você tem:");
        int galinhas = teclado.nextInt();
        
        System.out.println("Informe o valor do anel com chip:");
        double precoChip = teclado.nextDouble();

        System.out.println("Informe o valor do anel de alimento:");
        double precoAlimento = teclado.nextDouble();

        precoAlimento = precoAlimento * 2;
        double calculo = (precoAlimento + precoChip) * galinhas;

        System.out.println("O gasto total foi de: " + calculo);

        teclado.close();
    }
}