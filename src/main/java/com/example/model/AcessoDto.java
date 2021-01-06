package com.example.model;


public class AcessoDto {

	/*
	 * Classe de modelo de dados de Acesso
	 */
	
	private String email;
	private Integer empregoId;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getEmpregoId() {
		return empregoId;
	}
	public void setEmpregoId(Integer empregoId) {
		this.empregoId = empregoId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
