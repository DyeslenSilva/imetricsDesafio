package com.example.model;

public class DepartamentoDto {

	/*
	 * Classe de modelo do Departamento
	 */
	
	private String local;
	private String nomeDepartamento;
	private String orcamento;
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	public String getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(String orcamento) {
		this.orcamento = orcamento;
	}
}
