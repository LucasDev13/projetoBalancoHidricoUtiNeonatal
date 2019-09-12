package br.com.projetobh.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
@Entity
@Table(name = "paciente")
public class Paciente extends AbstractEntity<Long> {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@NotNull
//	private int prontuario;

	@NotNull
	private String nomeCompleto;

	@NotNull
	private String sexo;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimento;

	@NotNull
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente")
	private List<IdadeGestacional> idadeGestacional;

	@NotNull
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente")
	private List<DiasDeUti> dataInternacao;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPrescricao;

	@NotNull
	private Double pesoNascimento;

	@NotNull
	private Double pesoAnteriar;

	@NotNull
	private Double pesoAtual;

	@NotNull
	@OneToOne(mappedBy = "paciente")
	private Setor leito;

	@NotNull
	private int idade;

	@NotNull
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente")
	private List<PrescricaoReceituario> prescricaoReceituario;

	public Paciente() {

	}

	public Paciente(int prontuario, Date dataNascimento, List<IdadeGestacional> idadeGestacional,
			List<DiasDeUti> dataInternacao, Date dataPrescricao, Double pesoNascimento, Double pesoAnteriar,
			Double pesoAtual, Setor leito, int idade, List<PrescricaoReceituario> prescricaoReceituario) {
		//this.prontuario = prontuario;
		this.dataNascimento = dataNascimento;
		this.idadeGestacional = idadeGestacional;
		this.dataInternacao = dataInternacao;
		this.dataPrescricao = dataPrescricao;
		this.pesoNascimento = pesoNascimento;
		this.pesoAnteriar = pesoAnteriar;
		this.pesoAtual = pesoAtual;
		this.leito = leito;
		this.idade = idade;
		this.prescricaoReceituario = prescricaoReceituario;
	}

//	public int getProntuario() {
//		return prontuario;
//	}
//
//	public void setProntuario(int prontuario) {
//		this.prontuario = prontuario;
//	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<IdadeGestacional> getIdadeGestacional() {
		return idadeGestacional;
	}

	public void setIdadeGestacional(List<IdadeGestacional> idadeGestacional) {
		this.idadeGestacional = idadeGestacional;
	}

	public List<DiasDeUti> getDataInternacao() {
		return dataInternacao;
	}

	public void setDataInternacao(List<DiasDeUti> dataInternacao) {
		this.dataInternacao = dataInternacao;
	}

	public Date getDataPrescricao() {
		return dataPrescricao;
	}

	public void setDataPrescricao(Date dataPrescricao) {
		this.dataPrescricao = dataPrescricao;
	}

	public Double getPesoNascimento() {
		return pesoNascimento;
	}

	public void setPesoNascimento(Double pesoNascimento) {
		this.pesoNascimento = pesoNascimento;
	}

	public Double getPesoAnteriar() {
		return pesoAnteriar;
	}

	public void setPesoAnteriar(Double pesoAnteriar) {
		this.pesoAnteriar = pesoAnteriar;
	}

	public Double getPesoAtual() {
		return pesoAtual;
	}

	public void setPesoAtual(Double pesoAtual) {
		this.pesoAtual = pesoAtual;
	}

	public Setor getLeito() {
		return leito;
	}

	public void setLeito(Setor leito) {
		this.leito = leito;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<PrescricaoReceituario> getPrescricaoReceituario() {
		return prescricaoReceituario;
	}

	public void setPrescricaoReceituario(List<PrescricaoReceituario> prescricaoReceituario) {
		this.prescricaoReceituario = prescricaoReceituario;
	}

//	public PrescricaoReceituario getPrescricaoReceituario() {
//		return prescricaoReceituario;
//	}
//
//	public void setPrescricaoReceituario(PrescricaoReceituario prescricaoReceituario) {
//		this.prescricaoReceituario = prescricaoReceituario;
//	}

//	@Override
//	public String toString() {
//		return "Paciente [dataNascimento=" + dataNascimento + ", idadeGestacional=" + idadeGestacional
//				+ ", dataInternacao=" + dataInternacao + ", dataPrescricao=" + dataPrescricao + ", pesoNascimento="
//				+ pesoNascimento + ", pesoAnteriar=" + pesoAnteriar + ", pesoAtual=" + pesoAtual + ", leito=" + leito
//				+ ", prontuario=" + prontuario + ", idade=" + idade + ", prescricaoReceituario=" + prescricaoReceituario
//				+ "]";
//	}

}
