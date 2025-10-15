package ClinicaVeterinaria;

import java.time.LocalDate;

public class AtendimentoRetorno extends Atendimento implements Pagavel{

    public AtendimentoRetorno(int id, LocalDate data, String descricao, Veterinario veterinario, Animal animal, double valorBase) {
        super(id, data, descricao, veterinario, animal, valorBase);
    }

    @Override
	public double calcularValor() {
		return getValorBase() / 2;
	}
    
    @Override
	public String exibirResumo() {
		return "O atendimento realizado no animal " + getAnimal().getNome() + " teve um custo de R$ " + calcularValor();
	}
    
    @Override
   	public double getValorTotal() {
   		return calcularValor();
   	}
    
    @Override
   	public String getDescricaoPagamento() {
   		return "O atendimento de retorno teve um custo total de R$ " + getValorTotal();
   	}
    
    @Override
	 public void registrarNoSistema() {
		 System.out.println("Atendimento n° " + getId() + " registrado com sucesso!");
	 }
}
