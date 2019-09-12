package br.com.projetobh.model;

import java.io.Serializable;

public class StatusUsuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idStatus;

	private boolean ativo;

	public StatusUsuario() {
	}

	public StatusUsuario(Long idStatus, boolean ativo) {
		this.idStatus = idStatus;
		this.ativo = ativo;
	}

	public StatusUsuario(boolean ativo) {
		this.ativo = ativo;
	}

	public Long getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Long idStatus) {
		this.idStatus = idStatus;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "StatusUsuario [idStatus=" + idStatus + ", ativo=" + ativo + "]";
	}

}
