import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência
        // de números:

        System.out.println("Informe um número maior que 2:");
        int numero = teclado.nextInt();

        int potencia = 8;

        if (numero <= 2){
            System.out.println("Inválido");
        } else {
            for (int i = 1; i <= numero; i++){
                int valor;

                if (i % 2 != 0) {
                    valor = potencia; 
                } else {
                    valor = potencia + 2; 
                    potencia = potencia * 2;       
                }
    
                System.out.print(valor + " ");
            }
        }

        teclado.close();
    }
}
