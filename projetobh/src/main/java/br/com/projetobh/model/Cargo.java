package br.com.projetobh.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
public class Cargo extends AbstractEntity<Long> {
	
	@NotBlank(message = "O nome do cargo é obrigatorio.")//Essa anotação vai verificar se um campo no formulario ele esta em branco ou esta apenas com espaços em branco 
	@Size(min = 2, max = 60, message = "O nome do cargo deve ter entre {min} e {max} caracteres.")//verifica o tamanha do sua String
	@Column(name = "nomeCargo", nullable = false, unique = true, length = 60)
	private String nome;
	
	@NotNull(message = "Selecione o setor relativo ao cargo.")//se não selecionar o setor, o valor será null e aparece-rá a mensagem para informar um setor
	@ManyToOne //sempre lê da direita para a esquerda
	@JoinColumn(name = "id_setor_fk")//nome da chave estrangeira que teremas na tabela cargos
	private Setor setor;
	
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	


}
