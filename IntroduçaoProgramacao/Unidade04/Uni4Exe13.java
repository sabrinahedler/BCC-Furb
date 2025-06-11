import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as
        // três cartas deste usuário em uma mão de jogo de truco.
        // O algoritmo deve imprimir na tela a palavra "TRUCO" (se APENAS UMA das três
        // cartas for AS, 2 ou 3), "SEIS" (se
        // APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas
        // forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso
        // nada.

        System.out.println("Informe 3 valores inteiros, sendo eles:");
        System.out.println("1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei");
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        int valor3 = teclado.nextInt();

        // variável para fazer contagem
        int contador = 0;

        if (valor1 == 1 || valor1 == 2 || valor1 == 3){
            contador++;
        } 
        if (valor2 == 1 || valor2 == 2 || valor2 == 3){
            contador++;
        } 
        if (valor3 == 1 || valor3 == 2 || valor3 == 3){
            contador++;
        } 

        if (contador == 1){
            System.out.println("TRUCO");
        } else if (contador == 2){
            System.out.println("SEIS");
        } else if (contador == 3){
            System.out.println("NOVE");
        }

        teclado.close();
    }
}