package Exercicio04;

public class App {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa ("Samanta", 22, 1.68);
		Pessoa p2 = new Pessoa ("Jorge", 13, 1.66);
		Pessoa p3 = new Pessoa ("Cláudio", 57, 1.78);
		
		System.out.println(p1.apresentar());
		System.out.println(p2.ehMaiorIdade());
		System.out.println(p3.calcularIdadeEm(2050));
		
	}
}
