package br.com.projetobh.model;

import java.io.Serializable;
import java.util.Date;

public class ControleUsuario implements Serializable{

	private static final long serialVersionUID = 1L;

	private Date dataHoraAcesso;

	public ControleUsuario(Date dataHoraAcesso) {
		this.dataHoraAcesso = dataHoraAcesso;
	}

	public Date getDataHoraAcesso() {
		return dataHoraAcesso;
	}

	public void setDataHoraAcesso(Date dataHoraAcesso) {
		this.dataHoraAcesso = dataHoraAcesso;
	}

	@Override
	public String toString() {
		return "ControleUsuario [dataHoraAcesso=" + dataHoraAcesso + "]";
	}

}
