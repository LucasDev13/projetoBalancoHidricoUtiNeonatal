package br.com.projetobh.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class IdadeGestacional implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idIdadeGestacional;

	private double idadeGestacional;

	private int semanaGestacaoInicio;

	private int semanaGestacaoFinal;

	private Date dataHoraAlteracaoRegistro;

	@ManyToOne
	@JoinColumn(name = "id_pessoa")
	private Paciente paciente;

	public IdadeGestacional(Long idIdadeGestacional, double idadeGestacional, int semanaGestacaoInicio,
			int semanaGestacaoFinal, Date dataHoraAlteracaoRegistro, Paciente paciente) {
		this.idIdadeGestacional = idIdadeGestacional;
		this.idadeGestacional = idadeGestacional;
		this.semanaGestacaoInicio = semanaGestacaoInicio;
		this.semanaGestacaoFinal = semanaGestacaoFinal;
		this.dataHoraAlteracaoRegistro = dataHoraAlteracaoRegistro;
		this.paciente = paciente;
	}

	public IdadeGestacional(Long idIdadeGestacional, double idadeGestacional, int semanaGestacaoInicio,
			int semanaGestacaoFinal, Paciente paciente) {
		this.idIdadeGestacional = idIdadeGestacional;
		this.idadeGestacional = idadeGestacional;
		this.semanaGestacaoInicio = semanaGestacaoInicio;
		this.semanaGestacaoFinal = semanaGestacaoFinal;
		this.paciente = paciente;
	}

	public Long getIdIdadeGestacional() {
		return idIdadeGestacional;
	}

	public void setIdIdadeGestacional(Long idIdadeGestacional) {
		this.idIdadeGestacional = idIdadeGestacional;
	}

	public double getIdadeGestacional() {
		return idadeGestacional;
	}

	public void setIdadeGestacional(double idadeGestacional) {
		this.idadeGestacional = idadeGestacional;
	}

	public int getSemanaGestacaoInicio() {
		return semanaGestacaoInicio;
	}

	public void setSemanaGestacaoInicio(int semanaGestacaoInicio) {
		this.semanaGestacaoInicio = semanaGestacaoInicio;
	}

	public int getSemanaGestacaoFinal() {
		return semanaGestacaoFinal;
	}

	public void setSemanaGestacaoFinal(int semanaGestacaoFinal) {
		this.semanaGestacaoFinal = semanaGestacaoFinal;
	}

	public Date getDataHoraAlteracaoRegistro() {
		return dataHoraAlteracaoRegistro;
	}

	public void setDataHoraAlteracaoRegistro(Date dataHoraAlteracaoRegistro) {
		this.dataHoraAlteracaoRegistro = dataHoraAlteracaoRegistro;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	//método para somar as semanas de gestação da criança
	public int somaSemanaGestacao() {
		return 0;
	}

	@Override
	public String toString() {
		return "IdadeGestacional [idadeGestacional=" + idadeGestacional + ", semanaGestacaoInicio="
				+ semanaGestacaoInicio + ", semanaGestacaoFinal=" + semanaGestacaoFinal + ", paciente=" + paciente
				+ "]";
	}

}
