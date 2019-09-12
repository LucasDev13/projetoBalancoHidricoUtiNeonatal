package br.com.projetobh.model;

import java.io.Serializable;

public class CalculoTotal implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idCalculoTotal;

	private LiquidoEliminado liquidosEliminados;

	private LiquidoInfundido liquidosInfundidos;

	public CalculoTotal() {
	}

	public CalculoTotal(Long idCalculoTotal, LiquidoEliminado liquidosEliminados,
			LiquidoInfundido liquidosInfundidos) {
		this.idCalculoTotal = idCalculoTotal;
		this.liquidosEliminados = liquidosEliminados;
		this.liquidosInfundidos = liquidosInfundidos;
	}

	public CalculoTotal(LiquidoEliminado liquidosEliminados, LiquidoInfundido liquidosInfundidos) {
		this.liquidosEliminados = liquidosEliminados;
		this.liquidosInfundidos = liquidosInfundidos;
	}

	public Long getIdCalculoTotal() {
		return idCalculoTotal;
	}

	public void setIdCalculoTotal(Long idCalculoTotal) {
		this.idCalculoTotal = idCalculoTotal;
	}

	public LiquidoEliminado getLiquidosEliminados() {
		return liquidosEliminados;
	}

	public void setLiquidosEliminados(LiquidoEliminado liquidosEliminados) {
		this.liquidosEliminados = liquidosEliminados;
	}

	public LiquidoInfundido getLiquidosInfundidos() {
		return liquidosInfundidos;
	}

	public void setLiquidosInfundidos(LiquidoInfundido liquidosInfundidos) {
		this.liquidosInfundidos = liquidosInfundidos;
	}

	// Método para calcular o total das parciais dos três turnos
	public double calculoTotal() {
		// FAZER O CALCULO TOTAL DO BALANCO HIDRICO
		return 0;
	}

	@Override
	public String toString() {
		return "CalculoTotal [idCalculoTotal=" + idCalculoTotal + ", liquidosEliminados=" + liquidosEliminados
				+ ", liquidosInfundidos=" + liquidosInfundidos + "]";
	}

}
