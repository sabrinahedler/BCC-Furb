import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro maior que 0:");
        int valor = teclado.nextInt();

        if (valor %2 == 0){
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }

        teclado.close();
    }
}