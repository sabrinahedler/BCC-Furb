import java.util.Scanner;

public class exercicioDoze {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Uma empresa tem para um funcionário os seguintes dados: o nome, o número de
        // horas trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00
        // por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente
        // (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre
        // o salário trabalho para o INSS e de 5% sobre o salário trabalho para o
        // imposto de renda. Descreva um programa que informe o nome, o salário bruto e
        // o salário líquido do funcionário.

        System.out.println("Informe seu nome:");
        String nome = teclado.next();

        System.out.println("Informe a quantidade de horas trabalhadas:");
        double horasTrabalhadas = teclado.nextDouble();

        System.out.println("Informe quantos dependentes você possui:");
        int dependentes = teclado.nextInt();

        double valorHoras = horasTrabalhadas * 10;
        double valorDependentes = dependentes * 60;

        double salarioBruto = valorHoras + valorDependentes;
        double descontoInss = salarioBruto * 0.085;
        double descontoImposto = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - descontoImposto - descontoInss;

        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Líquido: " + salarioLiquido);

        teclado.close();
    }
}
