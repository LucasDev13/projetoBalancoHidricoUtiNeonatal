package br.com.projetobh.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import br.com.projetobh.model.Paciente;

@Entity
public class PrescricaoReceituario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPrescricao;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prescricaoReceituario")
	private List<Medicamento> medicamento;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_pessoa")
	private Paciente paciente;

	private String prescricao;
	private Date dataHoraPrescricao;

	public PrescricaoReceituario() {

	}

	public PrescricaoReceituario(String prescricao, Date dataHoraPrescricao) {
		this.prescricao = prescricao;
		this.dataHoraPrescricao = dataHoraPrescricao;
	}

	public PrescricaoReceituario(Long idPrescricao, List<Medicamento> medicamento, Paciente paciente, String prescricao,
			Date dataHoraPrescricao) {
		this.idPrescricao = idPrescricao;
		this.medicamento = medicamento;
		this.paciente = paciente;
		this.prescricao = prescricao;
		this.dataHoraPrescricao = dataHoraPrescricao;
	}

	public List<Medicamento> getMedicamento() {
		return medicamento;
	}

	public Long getIdPrescricao() {
		return idPrescricao;
	}

	public void setIdPrescricao(Long idPrescricao) {
		this.idPrescricao = idPrescricao;
	}

	public void setMedicamento(List<Medicamento> medicamento) {
		this.medicamento = medicamento;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}

	public Date getDataHoraPrescricao() {
		return dataHoraPrescricao;
	}

	public void setDataHoraPrescricao(Date dataHoraPrescricao) {
		this.dataHoraPrescricao = dataHoraPrescricao;
	}

	@Override
	public String toString() {
		return "PrescricaoReceituario [idPrescricao=" + idPrescricao + ", medicamento=" + medicamento + ", paciente="
				+ paciente + ", prescricao=" + prescricao + ", dataHoraPrescricao=" + dataHoraPrescricao + "]";
	}

}
