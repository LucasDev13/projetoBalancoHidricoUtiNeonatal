package br.com.projetobh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "liquidoEliminado")
public class LiquidoEliminado extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true, length = 5)
	private double urina;

	@Column(nullable = false, unique = true, length = 5)
	private String fezes;

	@Column(nullable = false, unique = true, length = 5)
	private String vomito;

	@Column(nullable = false, unique = true, length = 5)
	private double dreno;

	@Column(nullable = false, unique = true, length = 5)
	private double estase;

	@ManyToOne
	@JoinColumn(name = "id_balancoHidrico_fk")
	private BalancoHidrico balancoHidrico;

	public LiquidoEliminado() {
	}

	public LiquidoEliminado(double urina, String fezes, String vomito, double dreno, double estase) {
		this.urina = urina;
		this.fezes = fezes;
		this.vomito = vomito;
		this.dreno = dreno;
		this.estase = estase;
	}

	public double getUrina() {
		return urina;
	}

	public void setUrina(double urina) {
		this.urina = urina;
	}

	public String getFezes() {
		return fezes;
	}

	public void setFezes(String fezes) {
		this.fezes = fezes;
	}

	public String getVomito() {
		return vomito;
	}

	public void setVomito(String vomito) {
		this.vomito = vomito;
	}

	public double getDreno() {
		return dreno;
	}

	public void setDreno(double dreno) {
		this.dreno = dreno;
	}

	public double getEstase() {
		return estase;
	}

	public void setEstase(double estase) {
		this.estase = estase;
	}

	public BalancoHidrico getBalancoHidrico() {
		return balancoHidrico;
	}

	public void setBalancoHidrico(BalancoHidrico balancoHidrico) {
		this.balancoHidrico = balancoHidrico;
	}

	public double somaLiquidoEliminado() {
		// IMPLEMENTAR A SOMA DOS LIQUIDOS ELIINADOS

		return 0;
	}

	public double calculoParcial() {
		// IMPLEMENTAR O CALCULO PARCIAL - PODE IRA CALCULANDO DIRETO OS VALORES

		return 0;
	}

	@Override
	public String toString() {
		return "LiquidosEliminados [urina=" + urina + ", fezes=" + fezes + ", vomito=" + vomito + ", dreno=" + dreno
				+ ", estase=" + estase + "]";
	}
}
