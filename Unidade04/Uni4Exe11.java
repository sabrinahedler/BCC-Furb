import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma
        // mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere
        // que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente
        // dos demais, e apenas irmãos se todas as idades forem diferentes.

        System.out.println("Informe o ano de nascimento de 3 irmãos:");
        int irmao1 = teclado.nextInt();
        int irmao2 = teclado.nextInt();
        int irmao3 = teclado.nextInt();

        if (irmao1 == irmao2 && irmao1 != irmao3 || irmao1 == irmao3 && irmao1 != irmao2
                || irmao2 == irmao3 && irmao2 != irmao1) {
            System.out.println("Gêmeos");
        } else if (irmao1 == irmao2 && irmao2 == irmao3) {
            System.out.println("Trigêmeos");
        } else {
            System.out.println("Apenas irmãos");
        }

        teclado.close();
    }
}