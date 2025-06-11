import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Os regulamentos de uma competição de pesca impõem um limite no peso total de
         * pesca de um dia. Descreva um algoritmo que leia o limite diário (em
         * quilogramas) e então leia o peso (em gramas) de cada peixe e escreva o peso
         * total da pesca obtido até aquele ponto. Quando o limite diário for excedido
         * escreva uma mensagem e encerre a execução do algoritmo. Para prosseguir com a
         * entrada de dados de pesos de cada peixe o algoritmo deve apresentar a
         * seguinte mensagem: “deseja informar o peso de mais um peixe: s (SIM) / n
         * (NÃO)?”.
         */

        System.out.println("Informe o limite de peso total de pesca do dia:");
        double limite = teclado.nextDouble();

        System.out.print("Informe o peso (em gramas) do peixe: ");
        double pesoPeixe = teclado.nextInt();

        System.out.println("Deseja informar o peso de mais um peixe?");
        String continuar = teclado.next();

        double pesoTotal = +pesoPeixe;

        while (pesoTotal < limite || continuar.equalsIgnoreCase("sim")) {

            System.out.print("Informe o peso (em gramas) do peixe: ");
            pesoPeixe = teclado.nextDouble();

            pesoTotal = pesoTotal + pesoPeixe;

            System.out.println("Peso total atual: " + pesoTotal);

            System.out.println("Deseja informar o peso de mais um peixe?");
            continuar = teclado.next();

        }

        System.out.println("Limite de peso excedido!");
        System.out.println("Peso total final: " + pesoTotal);

        teclado.close();
    }
}