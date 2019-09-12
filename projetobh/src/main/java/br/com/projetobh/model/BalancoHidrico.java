package br.com.projetobh.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@SuppressWarnings("serial")
@Entity
public class BalancoHidrico extends AbstractEntity<Long>{

	//private double urina;
	
	// Paciente
	//private List<Paciente> paciente;

	// Liquidos eliminados
	@Column
	@OneToMany(cascade = CascadeType.ALL, mappedBy="balancoHidrico")
	private List<LiquidoInfundido> liquidoInfundido;

	// Liquidos infundidos
	@Column
	@OneToMany(cascade = CascadeType.ALL, mappedBy="balancoHidrico")
	private List<LiquidoEliminado> liquidoEliminado;

	//private List<Peso> peso;

	//private List<IdadeGestacional> idadeGestacional;

	//private List<DiasDeUti> diasDeUti;

	//private List<Date> dataHoraCadastroBH;
	
	
	@Column(length = 5)
	private String sm;

	@Column(length = 5)
	private double voLmLa;

	@Column(length = 5)
	private double sondaLmLa;

	@Column(length = 5)
	private double soro;

	@Column(length = 5)
	private double npt;

	@Column(length = 5)
	private double hemo; // Sangue

	@Column(length = 5)
	private double flush;
	
	@Column(length = 5)
	private double urina;

	@Column(length = 5)
	private String fezes;

	@Column(length = 5)
	private String vomito;

	@Column(length = 5)
	private double dreno;

	@Column(length = 5)
	private double estase;
	
	
	
	public BalancoHidrico() {
		
	}

	//construtor
	public BalancoHidrico(List<LiquidoInfundido> liquidoInfundido, List<LiquidoEliminado> liquidoEliminado) {
		this.liquidoInfundido = liquidoInfundido;
		this.liquidoEliminado = liquidoEliminado;
	}

	public List<LiquidoInfundido> getLiquidoInfundido() {
		return liquidoInfundido;
	}

	public void setLiquidoInfundido(List<LiquidoInfundido> liquidoInfundido) {
		this.liquidoInfundido = liquidoInfundido;
	}

	public List<LiquidoEliminado> getLiquidoEliminado() {
		return liquidoEliminado;
	}

	public void setLiquidoEliminado(List<LiquidoEliminado> liquidoEliminado) {
		this.liquidoEliminado = liquidoEliminado;
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

	
	
	
//	public double getUrina() {
//		return urina;
//	}
//	
//	public void setUrina(double urina) {
//		this.urina = urina;
//	}

//	public List<Paciente> getPaciente() {
//		return paciente;
//	}
//
//	public void setPaciente(List<Paciente> paciente) {
//		this.paciente = paciente;
//	}



//	public List<Peso> getPeso() {
//		return peso;
//	}
//
//	public void setPeso(List<Peso> peso) {
//		this.peso = peso;
//	}
//
//	public List<IdadeGestacional> getIdadeGestacional() {
//		return idadeGestacional;
//	}
//
//	public void setIdadeGestacional(List<IdadeGestacional> idadeGestacional) {
//		this.idadeGestacional = idadeGestacional;
//	}
//
//	public List<DiasDeUti> getDiasDeUti() {
//		return diasDeUti;
//	}
//
//	public void setDiasDeUti(List<DiasDeUti> diasDeUti) {
//		this.diasDeUti = diasDeUti;
//	}
//
//	public List<Date> getDataHoraCadastroBH() {
//		return dataHoraCadastroBH;
//	}
//
//	public void setDataHoraCadastroBH(List<Date> dataHoraCadastroBH) {
//		this.dataHoraCadastroBH = dataHoraCadastroBH;
//	}

//	@Override
//	public String toString() {
//		return "BalancoHidrico [paciente=" + paciente + ", liquidosEliminados=" + liquidosEliminados
//				+ ", liquidosInfundidos=" + liquidosInfundidos + ", peso=" + peso + ", idadeGestacional="
//				+ idadeGestacional + ", diasDeUti=" + diasDeUti + ", dataHoraCadastroBH=" + dataHoraCadastroBH + "]";
//	}

		

}
