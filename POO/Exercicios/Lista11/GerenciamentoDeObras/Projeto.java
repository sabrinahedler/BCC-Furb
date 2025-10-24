package GerenciamentoDeObras;

import java.time.LocalDate;
import java.util.ArrayList;

	public abstract class Projeto implements Relatorio {

		public Projeto() {
			this.responsaveis = new ArrayList<>();
		}

	private int identificador;
	private LocalDate entradaSistema;
	private String descricao;
		private ArrayList<Pessoa> responsaveis;

		public Projeto(int identificador, LocalDate entradaSistema, String descricao) {
			this.responsaveis = new ArrayList<>();
		this.identificador = identificador;
		this.entradaSistema = entradaSistema;
		this.descricao = descricao;
	}

	public int getIdentificador() {
		return identificador;
	}

	public LocalDate getEntradaSistema() {
		return entradaSistema;
	}

	public String getDescricao() {
		return descricao;
	}

		public ArrayList<Pessoa> getResponsaveis() {
			return responsaveis;
		}

		public void adicionarResponsavel(Pessoa responsavel) {
			if (this.responsaveis.contains(responsavel)) {
				throw new IllegalArgumentException("Profissional já registrado para o projeto: " + this.identificador);
			}
			this.responsaveis.add(responsavel);
		}

	public void setIdentificador(int identificador) {
		if (identificador < 0) {
			throw new IllegalArgumentException("IDENTIFICADOR INVÁLIDO!");
		} else {
			this.identificador = identificador;
		}
	}

	public abstract String getTipoProjeto();

	@Override
	public String gerarRelatorio() {
		return "ID: " + getIdentificador() + "\n" + "Descrição: " + getDescricao() + "\n" + "Início: "
				+ getEntradaSistema() + "\n" + "Responsáveis: " + getResponsaveis();
	}
}
