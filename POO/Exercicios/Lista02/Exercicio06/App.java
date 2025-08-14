package Exercicio06;

public class App {

	public static void main(String[] args) {

		Lampada l1 = new Lampada (true, "roxa", 100);
		
		l1.desligar();
		l1.trocarCor("rosa");
		System.out.println(l1.mostrarStatus());
		
	}
}
