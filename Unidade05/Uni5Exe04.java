public class Uni5Exe04 {
    public static void main(String[] args) throws Exception {

        // Descreva um algoritmo para calcular o valor de S dado por:

        double S = 0;

        for (int i = 1; i < 21; i++) {
            double numerador = 2 * i + 1;
            double denominador = i * (i + 1);
            double termo = numerador / denominador;

            S = S + termo;
        }

        System.out.printf("Valor de S com 20 termos: " + S);
    }
}
