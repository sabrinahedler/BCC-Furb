package Exercicio03;

public class App {

	public static void main(String[] args) {

		/*

d. Transfira R$ 1.800,00
		 * da 2ª conta para a 1ª conta. e. Exiba o titular de cada uma conta com o
		 * respectivo saldo da conta.
		 */

		ContaBancaria conta1 = new ContaBancaria();
		conta1.setNumero("00.000000.0-0");
		conta1.setTitular("João");
		conta1.setSaldo(0);
		
		ContaBancaria conta2 = new ContaBancaria();
		conta2.setNumero("00.000000.0-1");
		conta2.setTitular("Maria");
		conta2.setSaldo(0);
		
		conta1.depositar(1000);
		conta1.depositar(700);
		
		conta2.depositar(5000);
		conta2.sacar(3000);
		
		ContaBancaria contaDestino = conta1;
		conta2.transferir(contaDestino, 1000);
		
		System.out.println("CONTA 01:");
		System.out.println("Número da conta: " + conta1.getNumero());
		System.out.println("Titular da conta: " + conta1.getTitular());
		System.out.println("Saldo da conta: " + conta1.getSaldo());
		System.out.println("==============================");
		System.out.println("CONTA 02:");
		System.out.println("Número da conta: " + conta2.getNumero());
		System.out.println("Titular da conta: " + conta2.getTitular());
		System.out.println("Saldo da conta: " + conta2.getSaldo());
		
	}
}
