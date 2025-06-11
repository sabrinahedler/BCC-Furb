public class Uni5Exe02 {
    public static void main(String[] args) throws Exception {

        // Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma
        // dos números ímpares entre 1 e 100

        int somaImpar = 0;
        int somaPar = 0;

        for (int i = 0; i < 101; i++){

            if (i % 2 == 0) {
                somaPar = somaPar + i;
            } else {
                somaImpar = somaImpar + i;
            }
            
        }

        System.out.println("A soma de todos os números pares de 1 á 100 é " + somaPar);
        System.out.println("A soma de todos os números ímpares de 1 á 100 é " + somaImpar);

    }
}
