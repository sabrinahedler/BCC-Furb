import java.util.Scanner;

public class exercicioDez {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Descreva um programa que leia o comprimento dos catetos de um triângulo
        // retângulo e calcule o comprimento da hipotenusa.
        // Fórmula: hipotenusa^2 = cateto1^2 + cateto2^2

        System.out.println("Informe o comprimento dos catetos de um triângulo!");
        System.err.println("Cateto 1:");
        double catetoUm = teclado.nextDouble();

        System.err.println("Cateto 2:");
        double catetoDois = teclado.nextDouble();

        double hipotenusa = Math.sqrt((catetoUm * catetoUm) + (catetoDois * catetoDois));

        System.out.println("O comprimento da hipotenusa é: " + hipotenusa);

        teclado.close();
    }
}
