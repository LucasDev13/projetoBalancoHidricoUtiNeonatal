package br.com.projetobh.model;

import java.io.Serializable;
import java.util.Date;

public class Peso implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idPeso;

	private BalancoHidrico balancoHidrico;

	private double pesoNascimento;

	private double pesoAtual;

	private double pesoAnterior;

	private Date dataHoraAlteracao;

	public Peso() {
	}

	public Peso(Date dataHoraAlteracao) {
		this.dataHoraAlteracao = dataHoraAlteracao;
	}

	public Peso(Long idPeso, BalancoHidrico balancoHidrico, double pesoNascimento, double pesoAtual,
			double pesoAnterior, Date dataHoraAlteracao) {
		this.idPeso = idPeso;
		this.balancoHidrico = balancoHidrico;
		this.pesoNascimento = pesoNascimento;
		this.pesoAtual = pesoAtual;
		this.pesoAnterior = pesoAnterior;
		this.dataHoraAlteracao = dataHoraAlteracao;
	}

	public Peso(double pesoNascimento, double pesoAtual, double pesoAnterior) {
		super();
		this.pesoNascimento = pesoNascimento;
		this.pesoAtual = pesoAtual;
		this.pesoAnterior = pesoAnterior;
	}

	public Long getIdPeso() {
		return idPeso;
	}

	public void setIdPeso(Long idPeso) {
		this.idPeso = idPeso;
	}

	public BalancoHidrico getBalancoHidrico() {
		return balancoHidrico;
	}

	public void setBalancoHidrico(BalancoHidrico balancoHidrico) {
		this.balancoHidrico = balancoHidrico;
	}

	public double getPesoNascimento() {
		return pesoNascimento;
	}

	public void setPesoNascimento(double pesoNascimento) {
		this.pesoNascimento = pesoNascimento;
	}

	public double getPesoAtual() {
		return pesoAtual;
	}

	public void setPesoAtual(double pesoAtual) {
		this.pesoAtual = pesoAtual;
	}

	public double getPesoAnterior() {
		return pesoAnterior;
	}

	public void setPesoAnterior(double pesoAnterior) {
		this.pesoAnterior = pesoAnterior;
	}

	public Date getDataHoraAlteracao() {
		return dataHoraAlteracao;
	}

	public void setDataHoraAlteracao(Date dataHoraAlteracao) {
		this.dataHoraAlteracao = dataHoraAlteracao;
	}

	public double calcularPeso() {
		// IMPLEMENTAR O CALCULO DO PESO PARA OS MEDICAMENTOS
		return 0;

	}

	@Override
	public String toString() {
		return "Peso [balancoHidrico=" + balancoHidrico + ", pesoNascimento=" + pesoNascimento + ", pesoAtual="
				+ pesoAtual + ", pesoAnterior=" + pesoAnterior + "]";
	}

}
