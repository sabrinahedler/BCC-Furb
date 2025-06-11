import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda
        // anual e o número de dependentes do contribuinte. A renda líquida é calculada
        // sobre a renda anual com um desconto de 2% para cada dependente do
        // contribuinte. O contribuinte com uma renda líquida de até R$ 2.000,00 não
        // paga imposto. Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$
        // 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas
        // líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$
        // 10.000,00 pagam 15% de imposto.

        System.out.println("Informe sua renda anual:");
        double rendaAnual = teclado.nextDouble();

        System.out.println("Informe quantos dependentes você possui:");
        int dependentes = teclado.nextInt();

        double descontoDependentes = 2 * dependentes; 
        double rendaLiquida = rendaAnual - (rendaAnual * descontoDependentes / 100);
        
        double imposto = 0.0;
    
        
        if (rendaLiquida >= 2000.00 && rendaLiquida <= 5000.00) {
            imposto = rendaLiquida * 0.05;
            System.out.println("O imposto é de 5%: R$ " + imposto);
        } else if (rendaLiquida >= 5000.01 &&  rendaLiquida <= 10000.00) {
            imposto = rendaLiquida * 0.10; 
        } else if (rendaLiquida >= 10000.01){
            imposto = rendaLiquida * 0.15;
            System.out.println("O imposto é de 15%: R$ " + imposto);
        } else {
            System.out.println("Você não possui imposto.");
        }

        teclado.close();
    }
}