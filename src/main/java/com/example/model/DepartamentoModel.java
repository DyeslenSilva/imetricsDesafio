package com.example.model;

import lombok.Data;

@Data
public class DepartamentoModel {
	
	/*
	 * Classe de modelo do empregado de um departamento
	 */
	
	private String departamentoId;
	private EmpregadoModel empregado;
	private String local;
	private String nomeDepartamento;
	private String orcamento;
	
	public String getDepartamentoId() {
		return departamentoId;
	}
	public void setDepartamentoId(String departamentoId) {
		this.departamentoId = departamentoId;
	}
	public EmpregadoModel getEmpregado() {
		return empregado;
	}
	public void setEmpregado(EmpregadoModel empregado) {
		this.empregado = empregado;
	}
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
