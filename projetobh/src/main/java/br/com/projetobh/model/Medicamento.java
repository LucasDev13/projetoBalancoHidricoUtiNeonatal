package br.com.projetobh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.projetobh.model.PrescricaoReceituario;

@Entity
public class Medicamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMed;
	private String nomeComercial;
	private String nomeGenerico;
	private String laboratorio;
	private int lote;
	private String vencimento;
	private int concentracaoMedicamento;

	@ManyToOne
	@JoinColumn(name = "id_prescricao")
	private PrescricaoReceituario prescricaoReceituario;

	public Medicamento() {

	}

	public Medicamento(String nomeComercial, String nomeGenerico, String laboratorio, int lote, String vencimento,
			int concentracaoMedicamento) {
		this.nomeComercial = nomeComercial;
		this.nomeGenerico = nomeGenerico;
		this.laboratorio = laboratorio;
		this.lote = lote;
		this.vencimento = vencimento;
		this.concentracaoMedicamento = concentracaoMedicamento;
	}

	public Medicamento(Long idMed, String nomeComercial, String nomeGenerico, String laboratorio, int lote,
			String vencimento, int concentracaoMedicamento, PrescricaoReceituario prescricaoReceituario) {
		this.idMed = idMed;
		this.nomeComercial = nomeComercial;
		this.nomeGenerico = nomeGenerico;
		this.laboratorio = laboratorio;
		this.lote = lote;
		this.vencimento = vencimento;
		this.concentracaoMedicamento = concentracaoMedicamento;
		this.prescricaoReceituario = prescricaoReceituario;
	}

	public Long getIdMed() {
		return idMed;
	}

	public void setIdMed(Long idMed) {
		this.idMed = idMed;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	public String getNomeGenerico() {
		return nomeGenerico;
	}

	public void setNomeGenerico(String nomeGenerico) {
		this.nomeGenerico = nomeGenerico;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public int getConcentracaoMedicamento() {
		return concentracaoMedicamento;
	}

	public void setConcentracaoMedicamento(int concentracaoMedicamento) {
		this.concentracaoMedicamento = concentracaoMedicamento;
	}

	public PrescricaoReceituario getPrescricaoReceituario() {
		return prescricaoReceituario;
	}

	public void setPrescricaoReceituario(PrescricaoReceituario prescricaoReceituario) {
		this.prescricaoReceituario = prescricaoReceituario;
	}

	@Override
	public String toString() {
		return "Medicamento [idMed=" + idMed + ", nomeComercial=" + nomeComercial + ", nomeGenerico=" + nomeGenerico
				+ ", laboratorio=" + laboratorio + ", lote=" + lote + ", vencimento=" + vencimento
				+ ", concentracaoMedicamento=" + concentracaoMedicamento + "]";
	}

}
