import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.

        System.out.println("Informe uma letra:");
        String letra = teclado.next();

        // Transformando em minusculo
        letra = letra.toLowerCase();

        if (letra.equals("a")
                || letra.equals("e")
                || letra.equals("i")
                || letra.equals("o")
                || letra.equals("u")) {
            System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }

        teclado.close();
    }
}