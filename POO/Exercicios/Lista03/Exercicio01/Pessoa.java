package Exercicio01;

public class Pessoa {
	
	private double altura;
	private double peso;
	private String nome;
	
	 void setAltura (double altura) {
	        this.altura = altura;
	    }
	 
	 void setPeso (double peso) {
	        this.peso = peso;
	    }
	 
	 void setNome (String nome) {
	        this.nome = nome;
	    }
	 
	 double getAltura () {
		return altura;
	 }
	 
	 double getIdade () {
			return peso;
		 }
	 
	 String getNome () {
		 return nome;
	 }

	    public double calcularImc() {
	        return peso / (altura * altura);
	    }
	
	    void exibirDados() {
	    	System.out.println("======================");
	        System.out.println("Nome: " + nome);
	        System.out.println("Peso: " + peso);
	        System.out.println("Altura: " + altura);
	        System.out.println("IMC: " + calcularImc());
	        System.out.println("======================");
	        System.out.println("");
	    }

}
