import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Dados 3 valores que representam os comprimentos dos lados de um triângulo,
        // descreva um algoritmo que verifique se os mesmos podem ser os comprimentos
        // dos lados de um triângulo. Em caso afirmativo, verifique e informe se é
        // "triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno". Em
        // caso negativo, informe que os mesmos não formam um triângulo.

        // Considere que:
        // o comprimento de cada lado de um triângulo é menor que a soma dos
        // comprimentos dos outros lados
        // um triângulo equilátero tem três lados iguais
        // um triângulo isóscele tem dois lados iguais e um diferente
        // um triângulo escaleno tem três lados diferentes

        System.out.println("Informe 3 valores inteiros:");
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        int valor3 = teclado.nextInt();

        if (valor1 < (valor2 + valor3) && valor2 < (valor1 + valor3) && valor3 < (valor1 + valor2)) {
            if (valor1 == valor2 && valor1 == valor3) {
                System.out.println("É um triângulo equilátero");
            } else if (valor1 == valor2 && valor3 != valor1 || valor1 == valor3 && valor2 != valor1
                    || valor2 == valor3 && valor1 != valor2) {
                System.out.println("É um triãngulo isóceles");
            } else {
                System.out.println("É um triângulo escaleno");
            }
        } else {
            System.out.println("Não formam um triângulo");
        }

        teclado.close();
    }
}