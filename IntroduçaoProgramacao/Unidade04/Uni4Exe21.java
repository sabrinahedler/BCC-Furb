import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // O índice de massa corporal (IMC) é uma medida internacional usada para
        // calcular se uma pessoa está no peso ideal. O IMC é determinado pela divisão
        // da massa do indivíduo pelo quadrado de sua altura, onde a massa está em
        // quilogramas e a altura está em metros.
        // Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo.

        System.out.print("Informe sua altura: ");
        double altura = teclado.nextDouble();

        System.out.print("Informe seu peso: ");
        double peso = teclado.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Saudável");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade I");
        } else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade II (severa)");
        } else {
            System.out.println("Obesidade III (mórbida)");
        }

        teclado.close();
    }
}