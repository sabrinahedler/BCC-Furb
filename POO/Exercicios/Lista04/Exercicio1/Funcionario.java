package Exercicio1;
public class Funcionario {

	 private String nome;
	    private double salario;

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setSalario(double salario) {
	        if (salario < 0) {
	            System.out.println("Valor inválido");
	        } else {
	            this.salario = salario;
	        }
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public double calcularIrpf() {
	        double imposto = 0;
	        double salarioBase = this.salario;

	        if (salarioBase <= 1903.98) {
	            imposto = 0;
	        } else if (salarioBase <= 2826.65) {
	            imposto = (salarioBase - 1903.98) * 0.075;
	        } else if (salarioBase <= 3751.05) {
	            imposto = (922.67 * 0.075) + ((salarioBase - 2826.65) * 0.15);
	        } else if (salarioBase <= 4664.68) {
	            imposto = (922.67 * 0.075) + (924.40 * 0.15) + ((salarioBase - 3751.05) * 0.225);
	        } else {
	            imposto = (922.67 * 0.075) + (924.40 * 0.15) + (913.63 * 0.225) + ((salarioBase - 4664.68) * 0.275);
	        }
	        return imposto;
	    }
}
