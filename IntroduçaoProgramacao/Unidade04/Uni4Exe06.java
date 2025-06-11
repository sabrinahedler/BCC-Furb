import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M'
        // escreva “Masculino”. Se for digitada a letra 'F' escreva “Feminino”. Se for
        // informado 'I' escreva “Não Informado”. Qualquer outra letra digitada escreva
        // “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para
        // maiúscula.

        System.out.println("Digite um caractere (M, F ou I):");
        char genero = teclado.next().trim().toUpperCase().charAt(0);

        if (genero == 'M') {
            System.out.println("Masculino");
        } else if (genero == 'F') {
            System.out.println("Feminino");
        } else if (genero == 'I') {
            System.out.println("Não Informado");
        } else {
            System.out.println("Entrada Incorreta");
        }

        teclado.close();
    }
}
