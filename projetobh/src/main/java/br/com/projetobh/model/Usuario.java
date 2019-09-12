package br.com.projetobh.model;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idUsuario;

	private String nomeUsuario;

	private String senha;

	private StatusUsuario statusUsuario;

	private Funcionario funcionario;

	private String alertaPrescreverProntuario;

	public Usuario() {
	}

	public Usuario(String nomeUsuario, String senha, StatusUsuario statusUsuario, Funcionario funcionario) {
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.statusUsuario = statusUsuario;
		this.funcionario = funcionario;
	}

	public Usuario(Long idUsuario, String nomeUsuario, String senha, StatusUsuario statusUsuario,
			Funcionario funcionario, String alertaPrescreverProntuario) {
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.statusUsuario = statusUsuario;
		this.funcionario = funcionario;
		this.alertaPrescreverProntuario = alertaPrescreverProntuario;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public StatusUsuario getStatusUsuario() {
		return statusUsuario;
	}

	public void setStatusUsuario(StatusUsuario statusUsuario) {
		this.statusUsuario = statusUsuario;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getAlertaPrescreverProntuario() {
		return alertaPrescreverProntuario;
	}

	public void setAlertaPrescreverProntuario(String alertaPrescreverProntuario) {
		this.alertaPrescreverProntuario = alertaPrescreverProntuario;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nomeUsuario=" + nomeUsuario + ", senha=" + senha
				+ ", statusUsuario=" + statusUsuario + ", funcionario=" + funcionario + ", alertaPrescreverProntuario="
				+ alertaPrescreverProntuario + "]";
	}

}
