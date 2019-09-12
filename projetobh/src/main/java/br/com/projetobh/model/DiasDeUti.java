package br.com.projetobh.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class DiasDeUti implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDiaUti;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEntrada;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataSaida;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHoraInternacao;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_pessoa")
	private Paciente paciente;

	public DiasDeUti(Long idDiaUti, Date dataEntrada, Date dataSaida, Date dataHoraInternacao, Paciente paciente) {
		this.idDiaUti = idDiaUti;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.dataHoraInternacao = dataHoraInternacao;
		this.paciente = paciente;
	}

	public Long getIdDiaUti() {
		return idDiaUti;
	}

	public void setIdDiaUti(Long idDiaUti) {
		this.idDiaUti = idDiaUti;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Date getDataHoraInternacao() {
		return dataHoraInternacao;
	}

	public void setDataHoraInternacao(Date dataHoraInternacao) {
		this.dataHoraInternacao = dataHoraInternacao;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int somaDiasInternacao() {
		//Fazer os calculos de total de dias internado
		
		return 0;
	}
	
	@Override
	public String toString() {
		return "DiasDeUti [idDiaUti=" + idDiaUti + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida
				+ ", dataHoraInternacao=" + dataHoraInternacao + ", paciente=" + paciente + "]";
	}

	
}
