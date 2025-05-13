import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um
        // algoritmo para ler as idades dos filhos e exibir quem é o caçula da família;
        // suponha que não haja empates.

        System.out.println("Informe a idade de Marquinhos:");
        int iddMarquinhos = teclado.nextInt();

        System.out.println("Informe a idade de Zezinho:");
        int iddZezinho = teclado.nextInt();

        System.out.println("Informe a idade de Luluzinha:");
        int iddLuluzinha = teclado.nextInt();

        if (iddMarquinhos < iddZezinho && iddMarquinhos < iddLuluzinha) {
            System.out.println("Marquinhos é o caçula");
        } else if (iddZezinho < iddLuluzinha && iddZezinho < iddMarquinhos) {
            System.out.println("Zezinho é o caçula");
        } else if (iddLuluzinha < iddMarquinhos && iddLuluzinha < iddZezinho){
            System.out.println("Luluzinha é o caçula");
        } else {
            System.out.println("Eles possuem idades iguais");
        }

        teclado.close();
    }
}