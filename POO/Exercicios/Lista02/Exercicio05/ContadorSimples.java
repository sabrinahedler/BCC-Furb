package Exercicio05;

public class ContadorSimples {

	int valor = 0;

	public ContadorSimples(int valor) {
       this.valor = valor;
    }
	
	public void incrementar() {
		valor = valor + 1;
	}
	
	public void decrementar() {
		valor = valor - 1;
	}
	
	public void zerar() {
		valor =0;
	}
	
	public int obterValor() {
		return valor;
	}
	
	public String exibirEstado() {
		return "Contador está em: " + valor;
	}

}
