package com.example.model;


public class AcessoModel {
	
	/*
	 * Classe de modelo de acesso do empregado
	 */
	
		private Integer acessoId;
		private String email;
		private EmpregadoModel empregado;
		private String password;
		
		public Integer getAcessoId() {
			return acessoId;
		}
		public void setAcessoId(Integer acessoId) {
			this.acessoId = acessoId;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public EmpregadoModel getEmpregado() {
			return empregado;
		}
		public void setEmpregado(EmpregadoModel empregado) {
			this.empregado = empregado;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
