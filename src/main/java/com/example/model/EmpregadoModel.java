package com.example.model;

public class EmpregadoModel {
	
	/*
	 * Classe de modelo do Empregado
	 */
	
	
	private AcessoModel acesso;
	private String admissao;
	private String cargo;
	private String cpf;
	private EmpregadoModel empregado;
	private Integer empregadoID;
	private String nome;
	private String salario;
	private String sexo;
	private String tipoDeContratacao;
	
	
	public AcessoModel getAcesso() {
		return acesso;
	}
	public void setAcesso(AcessoModel acesso) {
		this.acesso = acesso;
	}
	public String getAdmissao() {
		return admissao;
	}
	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public EmpregadoModel getEmpregado() {
		return empregado;
	}
	public void setEmpregado(EmpregadoModel empregado) {
		this.empregado = empregado;
	}
	public Integer getEmpregadoID() {
		return empregadoID;
	}
	public void setEmpregadoID(Integer empregadoID) {
		this.empregadoID = empregadoID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTipoDeContratacao() {
		return tipoDeContratacao;
	}
	public void setTipoDeContratacao(String tipoDeContratacao) {
		this.tipoDeContratacao = tipoDeContratacao;
	}
	
	
	
}
