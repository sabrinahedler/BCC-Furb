public class Uni5Exe03 {
    public static void main(String[] args) throws Exception {

        // Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100
        // termos:

        double soma = 0;

        for (int i = 1; i < 101; i++) {
            System.out.println("1/" + i);

            soma += 1.0 / i;
        }

        System.out.println("Soma da série: " + soma);
    }
}
