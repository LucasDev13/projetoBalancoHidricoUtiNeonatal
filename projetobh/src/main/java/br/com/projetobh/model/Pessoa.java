package br.com.projetobh.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public abstract class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String nomeCompleto;
	
	@NotNull
	private String sexo;

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
	
	
}
