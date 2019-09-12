package br.com.projetobh.model;

import java.io.Serializable;

public class LoginLogout implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long idLoginLogout;
	
	private String login;
	
	private String logout;

	
	
	public LoginLogout() {
	}
		
	public LoginLogout(Long idLoginLogout, String login, String logout) {
		super();
		this.idLoginLogout = idLoginLogout;
		this.login = login;
		this.logout = logout;
	}

	public LoginLogout(String login, String logout) {
		this.login = login;
		this.logout = logout;
	}

	public Long getIdLoginLogout() {
		return idLoginLogout;
	}

	public void setIdLoginLogout(Long idLoginLogout) {
		this.idLoginLogout = idLoginLogout;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogout() {
		return logout;
	}

	public void setLogout(String logout) {
		this.logout = logout;
	}
	
	//metodo para validar dados
	public void validarDados() {
		
	}
	
	//metodo para sair do sistema
	public void efetuarLogout() {
		
	}
}
