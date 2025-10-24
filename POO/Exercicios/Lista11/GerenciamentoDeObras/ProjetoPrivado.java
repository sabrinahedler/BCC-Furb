package GerenciamentoDeObras;

import java.time.LocalDate;

public class ProjetoPrivado extends Projeto implements Relatorio {

	private String areaTerreno;
	private double metragemTerreno;

	public ProjetoPrivado() {
		
	}
	
	public ProjetoPrivado(int identificador, LocalDate entradaSistema, String descricao, String areaTerreno,
			double metragemTerreno) {
		super(identificador, entradaSistema, descricao);
		this.areaTerreno = areaTerreno;
		this.metragemTerreno = metragemTerreno;
	}

	public String getAreaTerreno() {
		return areaTerreno;
	}

	public double getMetragemTerreno() {
		return metragemTerreno;
	}

	public void setAreaTerreno(String areaTerreno) {
		if (areaTerreno == null || areaTerreno.isBlank()) {
			throw new IllegalArgumentException("ÁREA DE TERRENO INVÁLIDA!");
		} else {
			this.areaTerreno = areaTerreno;
		}
	}

		public void setMetragemTerreno(double metragemTerreno) {
			/*
			if (metragemTerreno < 0) {
				throw new IllegalArgumentException("METRAGEM DE TERRENO INVÁLIDA!");
			} else {
				this.metragemTerreno = metragemTerreno;
			}
			*/
			this.metragemTerreno = metragemTerreno;
		}

	@Override
	public String getTipoProjeto() {
		return "Privado";
	}

	@Override
	public String gerarRelatorio() {
		return "ID: " + getIdentificador() + "\n" + "Descrição: " + getDescricao() + "\n" + "Início: "
				+ getEntradaSistema() + "\n" + "Responsáveis: " + getResponsaveis() + "\n" + "Área do terreno: "
				+ getAreaTerreno() + "\n" + "Metragem do terreno: " + getMetragemTerreno();
	}

}