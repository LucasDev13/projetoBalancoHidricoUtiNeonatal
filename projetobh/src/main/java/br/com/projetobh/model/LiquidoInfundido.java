package br.com.projetobh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@SuppressWarnings("serial")
@Entity
public class LiquidoInfundido extends AbstractEntity<Long>{

	@Column(length = 5)
	private String sm;

	@Column(nullable = false, unique = true, length = 5)
	private double voLmLa;

	@Column(nullable = false, unique = true, length = 5)
	private double sondaLmLa;

	@Column(nullable = false, unique = true, length = 5)
	private double soro;

	@Column(nullable = false, unique = true, length = 5)
	private double npt;

	@Column(nullable = false, unique = true, length = 5)
	private double hemo; // Sangue

	@Column(nullable = false, unique = true, length = 5)
	private double flush;

	@ManyToOne
	@JoinColumn(name = "id_balancoHidrico_fk")
	private BalancoHidrico balancoHidrico;

	public LiquidoInfundido() {

	}

	public String getSm() {
		return sm;
	}

	public void setSm(String sm) {
		this.sm = sm;
	}

	public double getVoLmLa() {
		return voLmLa;
	}

	public void setVoLmLa(double voLmLa) {
		this.voLmLa = voLmLa;
	}

	public double getSondaLmLa() {
		return sondaLmLa;
	}

	public void setSondaLmLa(double sondaLmLa) {
		this.sondaLmLa = sondaLmLa;
	}

	public double getSoro() {
		return soro;
	}

	public void setSoro(double soro) {
		this.soro = soro;
	}

	public double getNpt() {
		return npt;
	}

	public void setNpt(double npt) {
		this.npt = npt;
	}

	public double getHemo() {
		return hemo;
	}

	public void setHemo(double hemo) {
		this.hemo = hemo;
	}

	public double getFlush() {
		return flush;
	}

	public void setFlush(double flush) {
		this.flush = flush;
	}

	public BalancoHidrico getBalancoHidrico() {
		return balancoHidrico;
	}

	public void setBalancoHidrico(BalancoHidrico balancoHidrico) {
		this.balancoHidrico = balancoHidrico;
	}

	public double somaLiquidoInfundido() {
		// IMPLEMENTAR A SOMA DOS LIQUIDOS INFUNDIDOS

		return 0;
	}

	public double calculoParcial() {
		// IMPLEMENTAR O CALCULO PARCIAL - PODE IRA CALCULANDO DIRETO OS VALORES

		return 0;
	}

	@Override
	public String toString() {
		return "LiquidosInfundidos [sm=" + sm + ", voLmLa=" + voLmLa + ", sondaLmLa=" + sondaLmLa + ", soro=" + soro
				+ ", npt=" + npt + ", hemo=" + hemo + ", flush=" + flush + ", balancoHidrico=" + balancoHidrico + "]";
	}
}
