import java.text.DecimalFormat;

public class Uni5Exe22 {
    public static void main(String[] args) throws Exception {

        DecimalFormat df = new DecimalFormat("#.##");

        /*
         * Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais.
         * Em 1996 recebeu aumento de 1.5%. A partir de 1997, os aumentos sempre
         * correspondem ao dobro do ano anterior. Faça programa que determine o salário
         * atual do funcionário.
         */

        double salario = 2000;
        double aumento = 0.015;

        for (int i = 0; i < 30; i++) {

            salario += salario * aumento;
            aumento *= 2;
        }

        System.out.println("O salário atual do funcionário é " + df.format(salario));

    }
}