@CadastroDepartamento

@tag
Feature: Cadastro de departamentos
 		Feature para descrever cadastro de departamentos
 	
  @tag1
  Scenario: Departamemto cadastrado com sucesso
 			When eu preencho o campo "nomeDepartamento" com "compras"
			And eu preencho o campo "orcamento" com "121-039"
			And eu preencho o camp "local" com "comp"
  
  @tag2
  Scenario Outline: Falha ao cadastrar departamento
   	When eu não preencho todos campos
   	When eu preencho o campo "nomeDepartamento" com <nomeDepartamento>
  	And eu preencho o campo "orcamento" com <orcamento>
   	And eu preencho o campo "local" com <local>
     