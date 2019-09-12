package br.com.projetobh.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
public class Setor extends AbstractEntity<Long>{

	//nullable = false diz que é obrigatorio essa informação
	//unique = true diz que essa coluna é unica
	//length = 60 diz que vai ter 60 caracteres de tamanho
	// QUANDO FOR COLOCADO unique = true, NÃO PODE TER O MESMO VALOR NO BANCO DE DADOS, SENÃO VAI GERAR UM ERRO DE Key (nome_setor)=(UTI Neonatal) already exists
	@NotBlank(message = "Informe um nome.")//Essa anotação vai verificar se um campo no formulario ele esta em branco ou esta apenas com espaços em branco 
	@Size(min = 2, max = 60, message = "O nome do setor deve ter entre {min} e {max} caracteres.")//verifica o tamanha do sua String 
	@Column(nullable = false, length = 60)	
	private String nomeSetor;

//	@Column(nullable = false)
//	private String andar;
//
//	private String sala;
//
//	@Column(name = "leito", nullable = false, length = 60)
//	private String leito;

	@OneToOne
	@JoinColumn(name = "prontuario")
	private Paciente paciente;
	
	@OneToMany(mappedBy = "setor")
	private List<Cargo> cargos;

	
	public Setor() {
	}

//	public Setor(String nomeSetor, String andar, String sala, String leito,
//			Paciente paciente) {
//		this.nomeSetor = nomeSetor;
////		this.andar = andar;
////		this.sala = sala;
////		this.leito = leito;
//		this.paciente = paciente;
//	}
//
//	public Setor(String nomeSetor, String andar, String sala, String leito) {
//		super();
//		this.nomeSetor = nomeSetor;
////		this.andar = andar;
////		this.sala = sala;
////		this.leito = leito;
//	}

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

//	public String getAndar() {
//		return andar;
//	}
//
//	public void setAndar(String andar) {
//		this.andar = andar;
//	}
//
//	public String getSala() {
//		return sala;
//	}
//
//	public void setSala(String sala) {
//		this.sala = sala;
//	}
//
//	public String getLeito() {
//		return leito;
//	}
//
//	public void setLeito(String leito) {
//		this.leito = leito;
//	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public List<Cargo> getCargos() {
		return cargos;
	}
	
	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

//	@Override
//	public String toString() {
//		return "Setor [nomeSetor=" + nomeSetor + ", andar=" + andar + ", sala=" + sala +  ", leito=" + leito + ", paciente=" + paciente + "]";
//	}

}
