package Exercicio05;

public class App {

	public static void main(String[] args) {
		
		ContadorSimples c1 = new ContadorSimples (0);
		ContadorSimples c2 = new ContadorSimples (0);
		
		c1.incrementar();
		c1.incrementar();
		c1.incrementar();
		c1.incrementar();
		c1.incrementar();
		
		c2.decrementar();
		c2.decrementar();
		c2.decrementar();
		
		System.out.println(c1.exibirEstado());
		System.out.println(c2.exibirEstado());
		
		c1.zerar();
		
		System.out.println(c1.exibirEstado());

	}
}
