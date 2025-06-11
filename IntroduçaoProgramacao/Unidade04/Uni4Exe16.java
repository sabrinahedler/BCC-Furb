import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que
        // a idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a
        // soma das idades do homem mais velho com a mulher mais nova, e o produto das
        // idades do homem mais novo com a mulher mais velha.

        System.out.println("Informe a idade de 2 mulheres:");
        int idadeMulher1 = teclado.nextInt();
        int idadeMulher2 = teclado.nextInt();

        System.out.println("Informe a idade de 2 homens:");
        int idadeHomem1 = teclado.nextInt();
        int idadeHomem2 = teclado.nextInt();

        int mulherVelha = 0;
        int mulherNova = 0;

        int homemVelho = 0;
        int homemNovo = 0;

        if (idadeMulher1 > idadeMulher2){
            mulherVelha = idadeMulher1;
            mulherNova = idadeMulher2;
        } else {
            mulherVelha = idadeMulher2;
            mulherNova = idadeMulher1;
        }

        if (idadeHomem1 > idadeHomem2){
            homemVelho = idadeHomem1;
            homemNovo = idadeHomem2;
        } else {
            homemVelho = idadeHomem2;
            homemNovo = idadeHomem1;
        }

        int soma = homemVelho + mulherNova;
        int produto = homemNovo * mulherVelha;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);

        teclado.close();
    }
}