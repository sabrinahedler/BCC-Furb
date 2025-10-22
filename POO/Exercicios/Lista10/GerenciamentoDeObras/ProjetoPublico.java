package GerenciamentoDeObras;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProjetoPublico extends Projeto implements Relatorio {

	private LocalDate dataInicio;
	private LocalDate dataFinal;

	public ProjetoPublico(int identificador, LocalDate entradaSistema, String descricao, LocalDate dataInicio,
			LocalDate dataFinal) {
		super(identificador, entradaSistema, descricao);
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
	}
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	public long tempoDeDuracao() {
		long duracao = ChronoUnit.DAYS.between(dataInicio, dataFinal);
		return duracao;
	}

	@Override
	public String getTipoProjeto() {
		return "Público";
	}
	
	@Override
	public String gerarRelatorio() {
		return "ID: " + getIdentificador() + "\n" + "Descrição: " + getDescricao() + "\n" + "Entrada no Sistema: "
				+ getEntradaSistema() + "\n" + "Responsáveis: " + getResponsaveis() + "\n" + "Data inicio: "
				+ getDataInicio() + "\n" + "Data final: " + getDataFinal();
	}
}
